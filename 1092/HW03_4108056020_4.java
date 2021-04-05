public class HW03_4108056020_4 extends HillFinding {
	volatile int resault = -2;
	public int H_Finding(final int[] A) {
		resault = -2;
		int i;
		for(i=-1; 4>++i;) (new H_Finding(i,A,A.length-1)).start();
		for(i=0;!(i<A.length&&A[i]>A[++i]);) if (resault!=-2) return resault;
		return A.length-1-i;
	}
	protected class H_Finding extends Thread{
		private final int A[], FROM, END;
		public H_Finding(final int t, final int A[], final int END){
			this.A=A;
			this.FROM=(END*t)>>>2;
			this.END=(END*(t+1))>>>2;
		}
		public void run(){
			try{
				for (int l = FROM, h = END, i = (l+h)>>>1; !(l > h); i = (l+h)>>>1) {
					synchronized((Object)resault){
						if(resault != -2) return;
						if (i<h && A[i+1]<A[i])
							resault = A.length-2-i;
						else if (i>l && A[i-1]>A[i])
							resault = A.length-1-i;
					}
					if (A[h]>A[i]) h = i-1;
					else l = i+1;
				}
			}catch(ArrayIndexOutOfBoundsException e){}
		}
	}
}