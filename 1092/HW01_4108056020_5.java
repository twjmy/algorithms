public class HW01_4108056020_5 extends ArrayData {
	public volatile int min=2147483647, max=-2147483648;
	public HW01_4108056020_5(final int[] ar){
		A = ar;
		final int CORE = 8, LEN = A.length;
		final Thread T[] = new Thread[(LEN<CORE)?LEN:CORE];
		final int TLEN = T.length;
		for (int ti = -1; TLEN > ++ti;) {
			final int t = ti;
			T[t] = new Thread(() -> {
				final int to = ((LEN * (t + 1)) / TLEN);
				for (int i = ((LEN * t) / TLEN) - 1; to > ++i;){
					if(A[i]>max) max=A[i];
					if(A[i]<min) min=A[i];
				}
			});
			T[t].start();
		}
		try { for (final Thread t:T) t.join(); }
		catch (final InterruptedException e) {}
	}
	public int max(){ return max; }
	public int min(){ return min; }
}