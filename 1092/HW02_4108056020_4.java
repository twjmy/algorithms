public class HW02_4108056020_4 extends ThreeSum{
	public int T_sum(final int[] A){
		sort(A);
		final int LEN = A.length, END = LEN-3;
		int pivot, start, end, count = 0; long sum;
		for(int i = -1; END > ++i;){
			pivot = A[i]; start = i+1; end = LEN-1;
			while(start < end){
				sum = pivot + A[start]+ A[end];
				if(sum > 0) --end;
				else {
					if(sum == 0) ++count;
					++start;
				}
			}
		}
		return count;
	}
	public static void sort(int[] a) {
		final int left = 0;
		int right = a.length - 1;
		int[] work = null;
		int workBase = 0;
		final int workLen = 0;
		if (right - left < 286) {
			sort(a, left, right, true);
			return;
		}
		final int[] run = new int[67 + 1];
		int count = 0; run[0] = left;
		for (int k = left; k < right; run[count] = k) {
			while (k < right && a[k] == a[k + 1])
			k++;
			if (k == right) break;
			if (a[k] < a[k + 1]) {
				while (++k <= right && a[k - 1] <= a[k]);
			} else if (a[k] > a[k + 1]) {
				while (++k <= right && a[k - 1] >= a[k]);
				for (int lo = run[count] - 1, hi = k; ++lo < --hi; ) {
					final int t = a[lo]; a[lo] = a[hi]; a[hi] = t;
				}
			}
			if (run[count] > left && a[run[count]] >= a[run[count] - 1]) {
				count--;
			}
			if (++count == 67) {
				sort(a, left, right, true);
				return;
			}
		}
		if (count == 0) {
			return;
		} else if (count == 1 && run[count] > right) {
			return;
		}
		right++;
		if (run[count] < right) {
			run[++count] = right;
		}
		byte odd = 0;
		for (int n = 1; (n <<= 1) < count; odd ^= 1);
		int[] b;                 
		int ao, bo;              
		final int blen = right - left; 
		if (work == null || workLen < blen || workBase + blen > work.length) {
			work = new int[blen];
			workBase = 0;
		}
		if (odd == 0) {
			System.arraycopy(a, left, work, workBase, blen);
			b = a;
			bo = 0;
			a = work;
			ao = workBase - left;
		} else {
			b = work;
			ao = 0;
			bo = workBase - left;
		}
		for (int last; count > 1; count = last) {
			for (int k = (last = 0) + 2; k <= count; k += 2) {
				final int hi = run[k], mi = run[k - 1];
				for (int i = run[k - 2], p = i, q = mi; i < hi; ++i) {
					if (q >= hi || p < mi && a[p + ao] <= a[q + ao]) {
						b[i + bo] = a[p++ + ao];
					} else {
						b[i + bo] = a[q++ + ao];
					}
				}
				run[++last] = hi;
			}
			if ((count & 1) != 0) {
				for (int i = right, lo = run[count - 1]; --i >= lo;
				b[i + bo] = a[i + ao]
				);
				run[++last] = right;
			}
			final int[] t = a; a = b; b = t;
			final int o = ao; ao = bo; bo = o;
		}
	}
	private static void sort(final int[] a, int left, int right, final boolean leftmost) {
		final int length = right - left + 1;
		if (length < 47) {
			if (leftmost) {
				for (int i = left, j = i; i < right; j = ++i) {
					final int ai = a[i + 1];
					while (ai < a[j]) {
						a[j + 1] = a[j];
						if (j-- == left) {
							break;
						}
					}
					a[j + 1] = ai;
				}
			} else {
				do {
					if (left >= right) {
						return;
					}
				} while (a[++left] >= a[left - 1]);
				for (int k = left; ++left <= right; k = ++left) {
					int a1 = a[k], a2 = a[left];
					
					if (a1 < a2) {
						a2 = a1; a1 = a[left];
					}
					while (a1 < a[--k]) {
						a[k + 2] = a[k];
					}
					a[++k + 1] = a1;
					
					while (a2 < a[--k]) {
						a[k + 1] = a[k];
					}
					a[k + 1] = a2;
				}
				final int last = a[right];
				
				while (last < a[--right]) {
					a[right + 1] = a[right];
				}
				a[right + 1] = last;
			}
			return;
		}
		final int seventh = (length >> 3) + (length >> 6) + 1;
		final int e3 = (left + right) >>> 1; 
		final int e2 = e3 - seventh;
		final int e1 = e2 - seventh;
		final int e4 = e3 + seventh;
		final int e5 = e4 + seventh;
		if (a[e2] < a[e1]) { final int t = a[e2]; a[e2] = a[e1]; a[e1] = t; }
		if (a[e3] < a[e2]) { final int t = a[e3]; a[e3] = a[e2]; a[e2] = t;
			if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
		}
		if (a[e4] < a[e3]) { final int t = a[e4]; a[e4] = a[e3]; a[e3] = t;
			if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
				if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
			}
		}
		if (a[e5] < a[e4]) { final int t = a[e5]; a[e5] = a[e4]; a[e4] = t;
			if (t < a[e3]) { a[e4] = a[e3]; a[e3] = t;
				if (t < a[e2]) { a[e3] = a[e2]; a[e2] = t;
					if (t < a[e1]) { a[e2] = a[e1]; a[e1] = t; }
				}
			}
		}
		int less  = left;  
		int great = right; 
		if (a[e1] != a[e2] && a[e2] != a[e3] && a[e3] != a[e4] && a[e4] != a[e5]) {
			final int pivot1 = a[e2];
			final int pivot2 = a[e4];
			a[e2] = a[left];
			a[e4] = a[right];
			while (a[++less] < pivot1);
			while (a[--great] > pivot2);
			outer:
			for (int k = less - 1; ++k <= great; ) {
				final int ak = a[k];
				if (ak < pivot1) { 
					a[k] = a[less];
					a[less] = ak;
					++less;
				} else if (ak > pivot2) { 
					while (a[great] > pivot2) {
						if (great-- == k) {
							break outer;
						}
					}
					if (a[great] < pivot1) { 
						a[k] = a[less];
						a[less] = a[great];
						++less;
					} else { 
						a[k] = a[great];
					}
					a[great] = ak;
					--great;
				}
			}
			a[left]  = a[less  - 1]; a[less  - 1] = pivot1;
			a[right] = a[great + 1]; a[great + 1] = pivot2;
			sort(a, left, less - 2, leftmost);
			sort(a, great + 2, right, false);
			if (less < e1 && e5 < great) {
				while (a[less] == pivot1) {
					++less;
				}
				while (a[great] == pivot2) {
					--great;
				}
				outer:
				for (int k = less - 1; ++k <= great; ) {
					final int ak = a[k];
					if (ak == pivot1) { 
						a[k] = a[less];
						a[less] = ak;
						++less;
					} else if (ak == pivot2) { 
						while (a[great] == pivot2) {
							if (great-- == k) {
								break outer;
							}
						}
						if (a[great] == pivot1) { 
							a[k] = a[less];
							a[less] = pivot1;
							++less;
						} else { 
							a[k] = a[great];
						}
						a[great] = ak;
						--great;
					}
				}
			}
			sort(a, less, great, false);
		} else {
			final int pivot = a[e3];
			for (int k = less; k <= great; ++k) {
				if (a[k] == pivot) {
					continue;
				}
				final int ak = a[k];
				if (ak < pivot) { 
					a[k] = a[less];
					a[less] = ak;
					++less;
				} else { 
					while (a[great] > pivot) {
						--great;
					}
					if (a[great] < pivot) { 
						a[k] = a[less];
						a[less] = a[great];
						++less;
					} else {
						a[k] = pivot;
					}
					a[great] = ak;
					--great;
				}
			}
			sort(a, left, less - 1, leftmost);
			sort(a, great + 1, right, false);
		}
	}
}