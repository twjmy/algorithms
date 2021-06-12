public class HW11_4108056020_2 extends GroupCounting{
	public int count(final String[] A, final String[] B){
		final int LEN = A.length, UNION[] = new int[2000000];
		int nodeN = 0, unionN = 0;
		for(int i = 0, a, b, t; i < LEN; i++){
			if(UNION[a = Integer.parseInt(A[i])+1] != 0){
				for(t = a; UNION[t] > -1; t = UNION[t]);
				for(int j, k = a; k != t; j = UNION[k], UNION[k] = t, k = j);
				a = t;
			}else{ UNION[a] = -1; nodeN++; }
			if(UNION[b = Integer.parseInt(B[i])+1] != 0){
				for(t = b; UNION[t] > -1; t = UNION[t]);
				for(int j, k = b; k != t; j = UNION[k], UNION[k] = t, k = j);
				b = t;
			}else{ UNION[b] = -1; nodeN++; }
			if(a == b) continue;
			if(UNION[a] > UNION[b]){
				UNION[b] += UNION[a]; UNION[a] = b;
			}else{
				UNION[a] += UNION[b]; UNION[b] = a;
			}
			unionN++;
		}
		return nodeN-unionN;
	}
}
