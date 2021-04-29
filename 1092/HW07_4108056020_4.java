public class HW07_4108056020_4 extends Buy_Phone{
	final int[][]REV=new int[1000][];
	public int[][]bestPhone(final int[][]A){
		mergeSort(A);int len=A.length-1,count=len-1;
		for(int i=count,min=(REV[len]=A[len])[1];i>-1;i--)
			if(A[i][1]>min){min=A[i][1];REV[count--]=A[i];}
		final int[][]ANS=new int[len-=count++][];
		System.arraycopy(REV,count,ANS,0,len);
		return ANS;
	}
	private void mergeSort(final int[][]A){
		if(A.length<2)return;int i,j,k;
		final int MID=A.length>>>1,LEFT[][]=new int[MID][],RIGHT[][]=new int[A.length-MID][];
		for(i=0;i<MID;i++)LEFT[i]=A[i];for(i=MID;i<A.length;i++)RIGHT[i-MID]=A[i];
		mergeSort(LEFT);mergeSort(RIGHT);i=j=k=0;
		while(i<LEFT.length&&j<RIGHT.length)A[k++]=LEFT[i][0]<RIGHT[j][0]?LEFT[i++]:RIGHT[j++];
		while(i<LEFT.length)A[k++]=LEFT[i++];while(j<RIGHT.length)A[k++]=RIGHT[j++];
	}
}