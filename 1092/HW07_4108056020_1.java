public class HW07_4108056020_1 extends Buy_Phone{
	public int[][] bestPhone(final int[][] A){
		final int LEN=A.length, END=LEN-1;
		int i, j, len=LEN;
		for(i=0; i<END; ++i){
			for(j=END; j>i; --j){
				if(A[j]==null) continue;
				else if(A[i]==null) { len--; break; }
				else if(A[j][0]>=A[i][0]&&A[j][1]>=A[i][1])
				{ A[i]=null; len--; break;}
			}
		}
		final int[][] ANS=new int[len][];
		for(i=j=0; i < LEN; ++i)
			if(A[i]!=null){ ANS[j++]=A[i]; }
		return ANS;
	}
}