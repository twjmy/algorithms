public class HW06_4108056020_font extends Dessert_Desert{
	public int[] maxBlocks(final int[][] A){
		final int LEN=A.length, ANS[]=new int[LEN];
		int[] stack = new int[1];
		for(int i=0, j, max, top=0; i<LEN; top=0){
			final int SUBLEN=A[i].length;
			if(stack.length < SUBLEN)
				stack = new int[1<<32-Integer.numberOfLeadingZeros(SUBLEN)];
			for(stack[0]=A[i][0], j=1; j<SUBLEN; ++j){
				if(A[i][j] < stack[top]){
					max = stack[top--];
					while(top>-1 && A[i][j]<stack[top]) --top;
					stack[++top] = max;
				} else stack[++top] = A[i][j];
			}
			ANS[i++] = top+1;
		}
		return ANS;
	}
	public static void main(final String[] args){ // top == -1 ? A[i][j] : (A[i][j] > STACK[top] ? A[i][j] : STACK[top]);
		final int[] RESULT = new HW06_4108056020_font().maxBlocks(new int[][]{
			/*1*/ { 2, 2, 2, 2, 1, 1, 1, 1 },
			/*7*/ { 1, 1, 1, 1, 1, 1, 1 },
			/*5*/ { 1, 3, 5, 7, 9 },
			/*3*/ { 1, 2, 3 },
			/*1*/ { 5, 4, 3, 2, 1 },
			/*2*/ { 2, 1, 3, 2 },
			/*1*/ { 7, 1, 2, 4, 6, 5, 3 },
			/*2*/ { 2, 3, 1, 5, 4 }
		});
		StringBuffer str = new StringBuffer();
		for(int i:RESULT) str.append(i+" ");
		System.out.print(str);
	}
}