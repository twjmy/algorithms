public class HW05_4108056020_1 extends LLK{
	class Slot{
		final long SLOPE; final Slot NEXT;
		public Slot(final long slope, final Slot next)
		{ this.SLOPE = slope; this.NEXT = next; }
	}
	volatile boolean result; final byte CORE = 5;
	final Slot[][] HashTable = new Slot[1<<CORE][];
	final Thread[] T = new Thread[HashTable.length-1];
	public boolean checkLLK(final int[][] A){
		result = false;
		final int AEND = A.length-1, BUCKETS = 1<<32-Integer.numberOfLeadingZeros(AEND),
				TLEN = T.length, B = BUCKETS-1, FREQ = HashTable.length;
		for(byte ti=0; ti<TLEN; ++ti){ final byte t = ti; T[t] = new Thread(()->{
			for(int i=AEND-t, j, bucket; i>-1; i-=FREQ){
				for(HashTable[t] = new Slot[BUCKETS], j=i-1; j>-1;){
					final long SLOPE = Double.doubleToRawLongBits((double)(A[i][1]-A[j][1])/(A[i][0]-A[j--][0]));
					bucket = (int)SLOPE&B;
					for(Slot pivot = HashTable[t][bucket]; pivot != null; pivot = pivot.NEXT){
						if(pivot.SLOPE == SLOPE) result = true;
						if(result) return;
					}
					HashTable[t][bucket] = new Slot(SLOPE, HashTable[t][bucket]);
					if(result) return;
				}
				if(result) return;
			}
		}); T[t].setDaemon(true); T[t].start(); if(result) return true; }
		for(int i=AEND-TLEN, j, bucket; i>-1; i-=FREQ){
			for(HashTable[TLEN] = new Slot[BUCKETS], j=i-1; j>-1;){
				final long SLOPE = Double.doubleToRawLongBits((double)(A[i][1]-A[j][1])/(A[i][0]-A[j--][0]));
				bucket = (int)SLOPE&B;
				for(Slot pivot = HashTable[TLEN][bucket]; pivot != null; pivot = pivot.NEXT)
					if(pivot.SLOPE == SLOPE || result)
						return true;
				HashTable[TLEN][bucket] = new Slot(SLOPE, HashTable[TLEN][bucket]);
			}
			if(result) return true;
		}
		try{ for(final Thread t : T){ if(result) return true; t.join(); } }
		catch(final InterruptedException e){}
		return result;
	}
}