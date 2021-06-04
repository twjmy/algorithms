public class HW11_4108056020_1 extends GroupCounting{
	final class Slot{
		final Slot NEXT;
		final String K;
		final int V;
		Slot(final String k, final int v, final Slot next){
			this.K = k;
			this.V = v;
			this.NEXT = next;
		}
	}
	public int count(final String[] A, final String[] B){
		final int LEN = A.length, SIZE = LEN<<1, UNION[] = new int[SIZE], UNIONW[] = new int[SIZE],
				BUCKEND = (1<<32-Integer.numberOfLeadingZeros((LEN<<1)-1))-1;
		final Slot[] BUCKET = new Slot[BUCKEND+1];
		for(int i = 0; i < SIZE; i++) UNION[i] = i;
		int nodeN = 0, unionN = 0;
		for(int i = 0, a, b; i<LEN; i++){
			a = b = -1;
			for(Slot pivot = BUCKET[A[i].hashCode() & BUCKEND]; pivot!=null; pivot=pivot.NEXT)
				if(pivot.K.equals(A[i])) { a = pivot.V; break; }
			for(Slot pivot = BUCKET[B[i].hashCode() & BUCKEND]; pivot!=null; pivot=pivot.NEXT)
				if(pivot.K.equals(B[i])) { b = pivot.V; break; }
			if(a == -1){
				final int BN = A[i].hashCode() & BUCKEND;
				BUCKET[BN] = new Slot(A[i], (a = nodeN++), BUCKET[BN]);
			}
			if(b == -1){
				final int BN = B[i].hashCode() & BUCKEND;
				BUCKET[BN] = new Slot(B[i], (b = nodeN++), BUCKET[BN]);
			}
			while(UNION[a] != a) a = UNION[a] = UNION[UNION[a]];
			while(UNION[b] != b) b = UNION[b] = UNION[UNION[b]];
			if(a == b) continue;
			if(UNIONW[a] > UNIONW[b])
				 UNIONW[a] += 1 + (UNION[b] = a);
			else UNIONW[b] += 1 + (UNION[a] = b);
			unionN++;
		}
		return nodeN-unionN;
	}
}