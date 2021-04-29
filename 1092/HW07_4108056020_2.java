public class HW07_4108056020_2 extends Buy_Phone{
	public int[][] bestPhone(final int[][] A){
		final int LEN=A.length, END=LEN-1;
		int i, j, len=LEN;
		for(i=0; i<END; ++i){
			for(j=END; j>i; --j){
				if(A[j]==null) continue;
				else if(A[i]==null) { len--; break; }
				else if(A[j][0]>=A[i][0] && A[j][1]>=A[i][1])
				{ A[i]=null; len--; break;}
			}
		}
		final int[][] TMP=new int[len][], ANS=new int[len][];
		for(i=j=0; i<LEN; ++i)
			if(A[i]!=null){ TMP[j++]=A[i]; }
		final int N=TMP.length, CT[]=new int[50002], R=CT.length-1;
		boolean needSort=false;
		for(i=0; i<N; i++){
			CT[TMP[i][0]+1]++;
			if(i<N-1&&TMP[i][0]>TMP[i+1][0]) needSort=true;
		}
		if(!needSort) return TMP;
		for(i=0; i<R; i++) CT[i+1] += CT[i];
		for(i=0; i<N; i++) ANS[CT[TMP[i][0]]++]=TMP[i];
		return ANS;
	}
}