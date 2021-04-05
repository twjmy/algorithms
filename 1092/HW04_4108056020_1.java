public class HW04_4108056020_1 extends One_0k_rock {
	public boolean[] one0k(final String[] str) {
		final boolean[] result = new boolean[str.length];
		for(int i=-1,j,k,l; ++i<str.length;) {
			l = str[i].length();
			if(l%2==1) continue;
			k = l>>>1;
			for(j = -1; str[i].charAt(++j)=='0' && str[i].charAt(l-1-j)=='1';);
			if(j == k) result[i] = true;
		}
		return result;
	}
}
