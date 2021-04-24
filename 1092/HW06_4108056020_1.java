public class HW06_4108056020_1 extends Dessert_Desert{
	public int[] maxBlocks(final int[][] A){
		final int LEN=A.length, ANS[]=new int[LEN];
		int[] stack = new int[1];
		for(int i=LEN-1, j, min, top=0; i>-1; top=0){
			final int SUBLEN=A[i].length;
			if(stack.length < SUBLEN) stack = new int[SUBLEN<<1];
			for(stack[0]=A[i][SUBLEN-1], j=SUBLEN-2; j>-1; --j){
				if(A[i][j] > stack[top]){
					min = stack[top--];
					while(top>-1 && A[i][j]>stack[top]) --top;
					stack[++top] = min;
				} else stack[++top] = A[i][j];
			}
			ANS[i--] = top+1;
		}
		return ANS;
	}
}