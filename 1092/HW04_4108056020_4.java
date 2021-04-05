public class HW04_4108056020_4 extends One_0k_rock {
	public boolean[] one0k(final String[] str) {
		final boolean[] result = new boolean[str.length];
		for(int i=-1,j,l; ++i<str.length;) {
			l= str[i].length()-1;j = l>>>1; 
			while(--j>-1 && !(str[i].charAt(l-j)=='0' || str[i].charAt(j)=='1'));
			if(j == -1) result[i] = true;
		}
		return result;
	}
}
