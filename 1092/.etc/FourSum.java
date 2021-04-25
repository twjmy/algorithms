public class FourSum {
	public static void main(final String[] args){
		System.out.println(new FourSum().F_sum(new int[]{
			-2, -1, 1, 2
		}));
	}
	public int F_sum(int[] A){
		if(A.length < 4) return 0;
		java.util.Arrays.sort(A); 
		int count = 0, i, j, pivot, start, end; long sum;
		for(i = 0; i < A.length-3; ++i){
			for(j = i+1; j < A.length-2; ++j){
				pivot = A[i] + A[j]; start = j+1; end = A.length-1;
				while(start < end){
					sum = pivot + A[start] + A[end];
					if(sum < 0) ++start;
					else if(sum > 0) --end;
					else { ++count; ++start; --end; }
				}
			}
		}
		return count;
	}
}