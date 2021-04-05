public class HW03_4108056020_5 extends HillFinding {
	public int H_Finding(final int[] A) {
		// if(A.length<2||A[0]<A[A.length-1]) return -1;
		int i=0;
		try{ while(A[i]<=A[++i]); }
		catch(ArrayIndexOutOfBoundsException e){}
		return A.length-1-i;
	}
}