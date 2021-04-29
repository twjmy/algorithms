public class HW07_4108056020_3 extends Buy_Phone{
	final int[][]TMP=new int[1000][],REV=new int[1000][];
	public int[][]bestPhone(final int[][]A){
		int len=A.length-1,count=len-1;mergeSort(A,0,len);
		for(int i=count,min=(REV[len]=A[len])[1];i>-1;i--)
			if(A[i][1]>min){min=A[i][1];REV[count--]=A[i];}
		final int[][]ANS=new int[len-=count++][];
		System.arraycopy(REV,count,ANS,0,len);
		return ANS;
	}
	private void mergeSort(final int[][]A,final int start,final int len){
		if(len<2)return;final int MID=len>>>1;
		mergeSort(A,start,MID);mergeSort(A,start+MID,len-MID);
		final int LSTART=start,LCOUNT=MID,RSTART=start+MID,RCOUNT=len-MID,LO=LSTART+LCOUNT,HI=RSTART+RCOUNT;
		int i=LSTART,j=RSTART,k=LSTART;
		while(i<LO||j<HI)TMP[k++]=A[i<LO&&j<HI?A[j][0]>A[i][0]||A[j][1]>A[i][1]?i++:j++:i<LO?i++:j++];
		System.arraycopy(TMP,LSTART,A,LSTART,k-LSTART);
	}
}