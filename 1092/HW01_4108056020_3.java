public class HW01_4108056020_3 extends ArrayData {
	public int i,min=2147483647,max=-2147483648;
	public HW01_4108056020_3(final int[] ar){
		if (ar.length % 2 == 1) {
			min = ar[0]; max = ar[0];
			i = 1;
		} else {
			if (ar[0] > ar[1])
			{ max = ar[0]; min = ar[1]; }
			else
			{ max = ar[1]; min = ar[0]; }
			i = 2;
		}
		while(i<ar.length-1) {
			if(ar[i]>ar[i+1]){
				if(ar[i]>max) max=ar[i];
				if(ar[i+1]<min) min=ar[i+1];
			}else{
				if(ar[i+1]>max) max=ar[i+1];
				if(ar[i]<min) min=ar[i];
			}
			i += 2;
		}
	}
	public int max(){ return max; }
	public int min(){ return min; }
}