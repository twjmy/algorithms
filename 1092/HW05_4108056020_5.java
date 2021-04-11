public class HW05_4108056020_5 extends LLK{
	class Slot{
		final long SLOPE; final Slot NEXT;
		public Slot(final long slope, final Slot next)
		{ this.SLOPE = slope; this.NEXT = next; }
	} Slot[] HashTable;
	public boolean checkLLK(final int[][] A){
		final int AEND = A.length-1, BUCKETS = 1<<32-Integer.numberOfLeadingZeros(AEND), B = BUCKETS-1;
		for(int i=AEND, j, bucket; i>-1; --i){
			for(HashTable = new Slot[BUCKETS], j=i-1; j>-1;){
				final long SLOPE = Double.doubleToRawLongBits((double)(A[i][1]-A[j][1])/(A[i][0]-A[j--][0]));
				bucket = (int)SLOPE&B;
				for(Slot pivot = HashTable[bucket]; pivot != null; pivot = pivot.NEXT)
					if(pivot.SLOPE == SLOPE) return true;
				HashTable[bucket] = new Slot(SLOPE, HashTable[bucket]);
			}
		}
		return false;
	}
}