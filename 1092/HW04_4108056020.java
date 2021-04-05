public class HW04_4108056020 extends One_0k_rock {
	@Override
	public boolean[] one0k(String[] str) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		args = new String[]{"110011","000000000000111111111111","00010001111111","101","10","110001","01","1010"};

		// One_0k_rock test = new HW04_4108056020_();
		// boolean[] result = test.one0k(args);
		// for(int i=-1; ++i<result.length;) System.out.printf(""+result[i]+(i==result.length-1?"":", "));

		String t = args[0]; int thl = t.length()>>>1;
		System.out.println(t.matches("0{"+thl+"}1{"+thl+"}"));
		System.out.println();

		System.out.println(Long.bitCount(Long.parseLong(args[1], 2))==args[1].length()>>>1);

		String A = args[0];
		int hl = A.length()>>>1, m = 64-hl;
		long a = Long.parseLong(A.substring(0,hl), 2);
		long b = (~Long.parseLong(A.substring(hl), 2)<<m)>>>m;
		System.out.println(a==b);
		System.out.println();

		String target = args[1];
		int len = target.length(), halfLen = len>>>1, move = 64-halfLen;

		System.out.println("length of target string: "+len);
		System.out.println();

		String first = target.substring(0,halfLen);
		System.out.println(Long.parseLong(first, 2));
		System.out.println(first);
		long first2 = ~Long.parseLong(first, 2);
		System.out.println(first2);
		System.out.println(Long.toBinaryString(first2));
		System.out.println();

		String last = target.substring(halfLen);
		System.out.println(Long.parseLong(last, 2));
		System.out.println(last);
		long last2 = ~Long.parseLong(last, 2);
		System.out.println(last2);
		System.out.println(Long.toBinaryString(last2));
		System.out.println();

		System.out.println(Long.toBinaryString((last2<<move)>>>move));
		System.out.println();

		System.out.println(Long.parseLong(first, 2)==(last2<<move)>>>move);
	}
	@Deprecated
	public boolean[] one0k_shift(String[] str) {
		boolean[] result = new boolean[str.length];
		String A; int len, hl, m; long a, b;
		for(int i = 0; i < str.length; i++){
			A = str[i]; len = A.length();
			if(len%2==1){ result[i] = false; continue; }
			hl = len>>>1; m = 64-hl;
			a = Long.parseLong(A.substring(0,hl), 2);
			b = (~Long.parseLong(A.substring(hl), 2)<<m)>>>m;
			result[i] = a==b && a==0;
		}
		return result;
	}
	@Deprecated
	public boolean[] one0k_bitCount(String[] str) {
		boolean[] result = new boolean[str.length];
		String A; int len;
		for(int i = 0; i < str.length; i++){
			A = str[i]; len = A.length();
			if(len%2==1){ result[i] = false; continue; }
			result[i] = Long.bitCount(Long.parseUnsignedLong(A, 2))==A.length()>>>1;
			result[i] &= Long.parseUnsignedLong(A.substring(0,A.length()>>>1),2)==0;
		}
		return result;
	}
	public boolean[] one0k_compress(String[] str) {
		boolean[] result = new boolean[str.length];
		for(int i=0; i< str.length; i++){
			if(str[i].length()%2==1) continue;
			else if(compress(str[i]))
				result[i] = true;
		}
		return result;
	}
	private final boolean compress(String str){
		if(str.charAt(0)<str.charAt(str.length()-1)){
			if(str.length()==2) return true;
			return compress(str.substring(1, str.length()-1));
		}
		return false;
	}
}
