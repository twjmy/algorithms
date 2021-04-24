public class HW06_4108056020_3 extends Dessert_Desert{
	final byte CORE = 2; final Thread[] T = new Thread[(1<<CORE)-1];
	public int[] maxBlocks(final int[][] A){
		final int LEN=A.length, TLEN=T.length, FREQ=TLEN+1, ANS[]=new int[LEN];
		for(byte ti=0; ti<TLEN; ++ti){ final byte t=ti; T[t]=new Thread(()->{
			int[] stack = new int[1];
			for(int i=LEN-t-1, j, min, top=0; i>-1; top=0, i-=FREQ){
				final int SUBLEN=A[i].length;
				if(stack.length < SUBLEN) stack = new int[SUBLEN<<1];
				for(stack[0]=A[i][SUBLEN-1], j=SUBLEN-2; j>-1; --j){
					if(A[i][j] > stack[top]){
						min = stack[top--];
						while(top>-1 && A[i][j]>stack[top]) --top;
						stack[++top] = min;
					} else stack[++top] = A[i][j];
				}
				ANS[i] = top+1;
			}
		}); T[t].start(); }
		int[] stack = new int[1];
		for(int i=LEN-TLEN-1, j, min, top=0; i>-1; top=0, i-=FREQ){
			final int SUBLEN=A[i].length;
			if(stack.length < SUBLEN) stack = new int[SUBLEN<<1];
			for(stack[0]=A[i][SUBLEN-1], j=SUBLEN-2; j>-1; --j){
				if(A[i][j] > stack[top]){
					min = stack[top--];
					while(top>-1 && A[i][j]>stack[top]) --top;
					stack[++top] = min;
				} else stack[++top] = A[i][j];
			}
			ANS[i] = top+1;
		}
		try{ for(final Thread t:T) t.join(); }
		catch(final InterruptedException e){}
		return ANS;
	}
	public static void main(final String[] args){ // top == -1 ? A[i][j] : (A[i][j] > STACK[top] ? A[i][j] : STACK[top]);
		final int[] RESULT = new HW06_4108056020_2().maxBlocks(new int[][]{
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