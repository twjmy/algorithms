public class HW04_4108056020_RE extends One_0k_rock {
	public boolean[] one0k(final String[] str) {
		final boolean[] result = new boolean[str.length];
		for(int i = 0,l,half; i < str.length; i++){
			l = str[i].length();
			if(l%2 == 1) continue;
			half = l>>>1;
			if(str[i].matches("0{"+half+"}1{"+half+"}"))
				result[i] = true;
		}
		return result;
	}
}
