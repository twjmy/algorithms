public class HW11_4108056020_1 extends GroupCounting{
	final class Slot{
		final Slot NEXT; final String K; final int V;
		Slot(final Slot next, final String k, final int v){
			this.NEXT = next; this.K = k; this.V = v;
		}
	}
	public int count(final String[] A, final String[] B){
		final int LEN = A.length, SIZE = LEN<<1, UNION[] = new int[SIZE], UNIONW[] = new int[SIZE],
				BUCKEND = (1<<32-Integer.numberOfLeadingZeros((LEN<<1)-1))-1;
		final Slot[] BUCKET = new Slot[BUCKEND+1];
		for(int i = 0; i < SIZE; i++) UNION[i] = i;
		int nodeN = 0, unionN = 0;
		for(int i = 0, a = -1, b = -1; i<LEN; i++, a = b = -1){
			for(Slot pivot = BUCKET[BUCKEND & A[i].hashCode()]; pivot!=null; pivot=pivot.NEXT)
				if(pivot.K.equals(A[i])) { a = pivot.V; break; }
			for(Slot pivot = BUCKET[BUCKEND & B[i].hashCode()]; pivot!=null; pivot=pivot.NEXT)
				if(pivot.K.equals(B[i])) { b = pivot.V; break; }
			if(a == -1){
				final int BN = BUCKEND & A[i].hashCode();
				BUCKET[BN] = new Slot(BUCKET[BN], A[i], (a = nodeN++));
			}
			if(b == -1){
				final int BN = BUCKEND & B[i].hashCode();
				BUCKET[BN] = new Slot(BUCKET[BN], B[i], (b = nodeN++));
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