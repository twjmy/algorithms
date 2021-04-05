public class HW04_4108056020_5 extends One_0k_rock {
	volatile boolean[] result;
	final int CORE = 32;
	final Thread[] T = new Thread[CORE];

	public boolean[] one0k(final String[] str) {
		result = new boolean[str.length];
		for(int ti = -1; ++ti < CORE;){
			final int t = ti;
			T[t] = new Thread(()->{
				for(int i = t, j, l; i < str.length; i+=CORE+1) {
					l = str[i].length();
					if(l%2==1) continue;
					for(j = l>>>1; --j > -1 && str[i].charAt(j)=='0' && str[i].charAt(l-1-j)=='1';);
					if(j == -1) result[i] = true;
				}
			});
			T[t].start();
		}
		for(int i = CORE, j, l; i < str.length; i+=CORE+1) {
			l = str[i].length();
			if(l%2==1) continue;
			for(j = l>>>1; --j > -1 && str[i].charAt(j)=='0' && str[i].charAt(l-1-j)=='1';);
			if(j == -1) result[i] = true;
		}
		try{ for(final Thread t:T) t.join(); }
		catch(final InterruptedException e){}
		return result;
	}
}
