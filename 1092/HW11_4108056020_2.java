public class HW11_4108056020_2 extends GroupCounting{
	public int count(final String[] A, final String[] B){
		final int LEN = A.length, UNION[] = new int[2000000];
		int nodeN = 0, unionN = 0;
		for(int i = 0, a, b, t; i < LEN; i++){
			a = Integer.parseInt(A[i])+1; b = Integer.parseInt(B[i])+1;
			if(UNION[a] == 0){ UNION[a] = -1; nodeN++; }
			else{
				for(t = a; UNION[t] > -1; t = UNION[t]);
				for(int j, k = a; k != t; k = j){
					j = UNION[k]; UNION[k] = t;
				}
				a = t;
			}
			if(UNION[b] == 0){ UNION[b] = -1; nodeN++; }
			else{
				for(t = b; UNION[t] > -1; t = UNION[t]);
				for(int j, k = b; k != t; k = j){
					j = UNION[k]; UNION[k] = t;
				}
				b = t;
			}
			if(a == b) continue;
			t = UNION[a] + UNION[b];
			if(UNION[a] > UNION[b]){
				UNION[a] = b; UNION[b] = t;
			}else{
				UNION[b] = a; UNION[a] = t;
			}
			unionN++;
		}
		return nodeN-unionN;
	}
}
