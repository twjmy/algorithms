public class HW03_4108056020_2 extends HillFinding {
	public int H_Finding(final int[] A) {
		final int END = A.length-1;
		int l, h, i=(int)(A.length*Math.random());
		for(l=0, h=END; !(l>h); i=(l+h)>>>1){
			if(i<h && A[i+1]<A[i])
				return END-i-1;
			else if(i>l && A[i-1]>A[i])
				return END-i;
			else if(A[h]>A[i]) h = i-1;
			else l = i+1;
		}
		for(i=0;!(i<A.length&&A[i]>A[++i]););
		return END-i;
	}
}