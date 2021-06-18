public class HW11_4108056020_1 extends GroupCounting{
	final class Slot{
		final Slot NEXT; final String K; final int V;
		Slot(final Slot next, final String k, final int v){
			this.NEXT = next; this.K = k; this.V = v;
		}
	}
	final public int count(final String[] A, final String[] B){
		int nodeN = 0, unionN = 0;
		final int LEN = A.length, UNION[], UNIONW[],
				BUCKEND = (1<<32-Integer.numberOfLeadingZeros((LEN<<1)-1))-1;
		final Slot[] BUCKET = new Slot[BUCKEND+1];
		final int SIZE = LEN<<1; UNION = new int[SIZE]; UNIONW = new int[SIZE];
		for(int i = 0; i < SIZE; i++) UNION[i] = i;
		for(int i = 0, a, b; i<LEN; i++){
			if((a = take(BUCKET, BUCKEND, A[i], nodeN)) == nodeN) nodeN++;
			if((b = take(BUCKET, BUCKEND, B[i], nodeN)) == nodeN) nodeN++;
			if((a = find(UNION, a)) == (b = find(UNION, b))) continue;
			if(UNIONW[a] > UNIONW[b])
			     UNIONW[a] += 1 + (UNION[b] = a);
			else UNIONW[b] += 1 + (UNION[a] = b);
			unionN++;
		}
		return nodeN-unionN;
	}
	final int take(final Slot[] BUCKET, final int END, final String K, final int V) {
		final int BN = END & K.hashCode();
		for(Slot pivot = BUCKET[BN]; pivot!=null; pivot=pivot.NEXT)
			if(pivot.K.equals(K)) return pivot.V;
		BUCKET[BN] = new Slot(BUCKET[BN], K, V);
		return V;
	}
	final int find(final int[] UNION, int n) {
		while(UNION[n] != n) n = UNION[n] = UNION[UNION[n]];
		return n;
	}
}