public class HW11_4108056020_2 extends GroupCounting{
	public int count(final String[] A, final String[] B){
		int nodeN = 0, unionN = 0;
		final int LEN = A.length, UNION[] = new int[2000000];
		for(int i = 0, a, b; i < LEN; i++){
			if(UNION[a = Integer.parseInt(A[i])+1] != 0) a = find(UNION, a);
			else{ UNION[a] = -1; nodeN++; }
			if(UNION[b = Integer.parseInt(B[i])+1] != 0) b = find(UNION, b);
			else{ UNION[b] = -1; nodeN++; }
			if(a == b) continue;
			if(UNION[a] > UNION[b])
			    { UNION[b] += UNION[a]; UNION[a] = b; }
			else{ UNION[a] += UNION[b]; UNION[b] = a; }
			unionN++;
		}
		return nodeN-unionN;
	}
	final int find(final int[] UNION, int n) {
		int r;
		for(r = n; UNION[r] > -1; r = UNION[r]);
		for(int i, j = n; j != r; i = UNION[j], UNION[j] = r, j = i);
		return r;
	}
}