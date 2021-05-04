public class HW08_4108056020_2 extends Buy_Phone_v2{
	public int[][] bestPhone(final int[][] a){
		final int R = 100, N = a.length, END = N-1, aux[][] = new int[N][], count[] = new int[R+1];
		int i, j, k, len = N; boolean beat;
		for (i = 0; i < N;)
			count[a[i++][0]]++;
		for (i = 0; i < R;)
			count[i+1] += count[i++];
		for (i = END; i > -1;)
			aux[--count[a[i][0]]] = a[i--];
		for (i = 0; i < END; ++i){
			for (j = END; j > i; --j){
				if (aux[j] == null) continue;
				else if (aux[i] == null){ --len; break; }
				else{
					for(beat=true,k=0;beat&&k<6;beat&=aux[i][k]<=aux[j][k++]);
					if(beat){ aux[i] = null; --len; break; }
				}
			}
		}
		if(len==aux.length) return aux;
		final int[][] ans = new int[len][];
		for (i = j = 0; i < N; ++i)
			if (aux[i] != null)
				ans[j++] = aux[i];
		return ans;
	}
}