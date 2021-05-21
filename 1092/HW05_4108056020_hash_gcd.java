public class HW05_4108056020_hash_gcd extends LLK {
	class Node{
		final int dx, dy; final Node Next;
		public Node(final int dx, final int dy, final Node Next)
		{ this.dx = dx; this.dy = dy; this.Next = Next; }
	}
	public boolean checkLLK(final int[][] A){ Node[] HashTable;
		final int AEND = A.length-1, HLEN = 1<<32-Integer.numberOfLeadingZeros(AEND), HEND = HLEN-1;
		for(int i=AEND, j, dx, dy, a, b, gcd, h; i>-1; --i){
			for(HashTable = new Node[HLEN], j=i-1; j>-1; --j){
				dx = A[i][0]-A[j][0]; dy = A[i][1]-A[j][1];
				for(gcd = dy, b = dx; b != 0; a = gcd%b, gcd = b, b = a);
				dx /= gcd; dy /= gcd; if(dx < 0){ dx = ~dx+1; dy = ~dy+1; }
				h = Integer.hashCode(dy) & HEND & 0x7fff_ffff;
				for(Node Pivot = HashTable[h]; Pivot != null; Pivot = Pivot.Next)
					if(Pivot.dx == dx && Pivot.dx == dy) return true;
				HashTable[h] = new Node(dx, dy, HashTable[h]);
			}
		}
		return false;
	}
}