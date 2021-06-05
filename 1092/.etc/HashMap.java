/**
 * @author twjmy@msn.com
 */
public class HashMap{
	final class Slot{
		final Slot NEXT; // linked list
		final String K;  // key
		final int V;     // value
		Slot(final Slot next, final String k, final int v){
			this.NEXT = next;
			this.V = v;
			this.K = k;
		}
	}
	final Slot[] BUCKET; final int BUCKEND; // capacity: number of BUCKET
	public HashMap(final int LEN){
		// ~0 means ...0000 , 0~ means 0000...
		// 1~ means 1111... , ?~ means ????...
		BUCKEND = (1<<32-Integer.numberOfLeadingZeros((LEN<<1)-1))-1;
		// LEN:~00??~ => ~0100~ -1 (or exactly ~0010~ -1)
		// ~0100~ -1 = ~0011~
		BUCKET = new Slot[BUCKEND+1];
		// ~0011~ +1 = ~0100~
	}
	public void put(final String k, final int v){
		final int BN = BUCKEND & k.hashCode(); // faster
		// ~0011~ & ~????~ = ~00??~
		// for keep the code in postive range: 0~BUCKEND
		// ...or `BN = (k.hashCode() & 0x7fffffff) % BUCKEND` for non-power-of-2-number
		//    if not using `BUCKEND = (1<<32-Integer.numberOfLeadingZeros((LEN<<1)-1))-1`
		BUCKET[BN] = new Slot(BUCKET[BN], k, v);
	}
	public int get(final String k){
		final int BN = BUCKEND & k.hashCode();
		for(Slot pivot = BUCKET[BN]; pivot!=null; pivot=pivot.NEXT)
			if(pivot.K.equals(k)) return pivot.V;
		return -1; // not found
	}
	public static void main(final String...args){ // demo
		final String[] A = new String[]{"사","랑","해","요","노","정","훤"};
		final int[] B = new int[]{9, 4, 2, 0, 327, 159, 45};

		final HashMap hashmap = new HashMap(A.length);

		for(int i = 0; i < A.length; ++i)
			hashmap.put(A[i], B[i]);

		int get_result = hashmap.get("노");
		System.out.println(get_result);
	}
}