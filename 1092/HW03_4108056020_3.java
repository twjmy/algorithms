public class HW03_4108056020_3 extends HillFinding {
	public int H_Finding(int A[]){
		final int END = A.length-1;
		int i, j, l = 0, r = END;
		while (r >= l) {
			i = l+(r-l)/3;
			j = r-(r-l)/3;
			if(i<r && A[i+1]<A[i])
				return END-i-1;
			else if(i>l && A[i-1]>A[i])
				return END-i;
			else if(j<r && A[j+1]<A[j])
				return END-j-1;
			else if(j>l && A[j-1]>A[j])
				return END-j;
			l = i+1; r = j-1;
		}
		for(i=0;!(i<A.length&&A[i]>A[++i]););
		return END-i;
	}
}