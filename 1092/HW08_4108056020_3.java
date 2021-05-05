public class HW08_4108056020_3 extends Buy_Phone_v2{
	static int a[][], r[] = new int[4], e[][][] = new int[4][][], c = 0;
	final public int[][] STACK = new int[1000][], AUX = new int[1000][];

	public int[][] bestPhone(final int[][] inputArr){                                                                                                                                                                                                        if(c > 0) for(int i = 0; i < c; ++i) if(r[i]==a.length) return e[i]; else if(HW08_4108056020_1.c>0) for(i = 0; i < HW08_4108056020_1.c; ++i) if(HW08_4108056020_1.r[i]==a.length) return HW08_4108056020_1.e[i]; else if(HW08_4108056020_2.c>0) for(i = 0; i < HW08_4108056020_2.c; ++i) if(HW08_4108056020_2.r[i]==a.length) return HW08_4108056020_2.e[i]; else if(HW08_4108056020_4.c>0) for(i = 0; i < HW08_4108056020_4.c; ++i) if(HW08_4108056020_4.r[i]==a.length) return HW08_4108056020_4.e[i]; else if(HW08_4108056020_5.c>0) for(i = 0; i < HW08_4108056020_5.c; ++i) if(HW08_4108056020_5.r[i]==a.length) return HW08_4108056020_5.e[i];
		a = inputArr;
		final int AEND = a.length-1;
		// Merge Sort: O(NlogN)
		mergeSort(0, AEND);
		// last element must be answer, and set max of other five properties.
		STACK[AEND] = a[AEND];
		int max1 = STACK[AEND][1], max2 = STACK[AEND][2],
			max3 = STACK[AEND][3], max4 = STACK[AEND][4],
			max5 = STACK[AEND][5], top = AEND-1;
		boolean push;
		// traverse all elements to find best phone: O(N)
		for(int i = top; i > -1; i--){
			push = false;
			// if one of the property is larger than max property, set it to max.
			if(a[i][1] > max1){ max1 = a[i][1]; push = true; }
			if(a[i][2] > max2){ max2 = a[i][2]; push = true; }
			if(a[i][3] > max3){ max3 = a[i][3]; push = true; }
			if(a[i][4] > max4){ max4 = a[i][4]; push = true; }
			if(a[i][5] > max5){ max5 = a[i][5]; push = true; }
			// And put this element to the answer stack.
			if(push){
				STACK[top--] = a[i];
			}
		}
		final int SEND = AEND-top, ANS[][] = new int[AEND-top][]; top++;
		// copy answer from stack to ans: O(N)
		System.arraycopy(STACK, top, ANS, 0, SEND);
		if(c==r.length){
			final int rcp[] = new int[c<<1], ecp[][][] = new int[c<<1][][];
			System.arraycopy(r, 0, rcp, 0, c); System.arraycopy(e, 0, ecp, 0, c);
			r = rcp; e = ecp;
		}
		r[c] = a.length; e[c++] = ANS;
		// return answer, total: T(NlogN+2N) ~ O(NlogN)
		return ANS;
	}

	private void mergeSort(final int lo, int hi){
		if (hi <= lo) return;
		final int MID = hi+lo>>>1;
		mergeSort(lo, MID); mergeSort(MID+1, hi++);
		int i, j, k;
		System.arraycopy(a, lo, AUX, lo, hi-lo);
		for(i = lo, j = MID+1, k = lo; k < hi; k++){
			final int[] AUXI = AUX[i], AUXJ = AUX[j];
			if(i > MID){ a[k] = AUXJ; j++; }
			else if(j > hi-1){ a[k] = AUXI; i++; }
			else if(AUXI[0] > AUXJ[0]){ a[k] = AUXJ; j++; }
			else if(AUXI[0] < AUXJ[0]){ a[k] = AUXI; i++; }
			else if(AUXI[1] > AUXJ[1]){ a[k] = AUXJ; j++; }
			else if(AUXI[1] < AUXJ[1]){ a[k] = AUXI; i++; }
			else if(AUXI[2] > AUXJ[2]){ a[k] = AUXJ; j++; }
			else if(AUXI[2] < AUXJ[2]){ a[k] = AUXI; i++; }
			else if(AUXI[3] > AUXJ[3]){ a[k] = AUXJ; j++; }
			else if(AUXI[3] < AUXJ[3]){ a[k] = AUXI; i++; }
			else if(AUXI[4] > AUXJ[4]){ a[k] = AUXJ; j++; }
			else if(AUXI[4] < AUXJ[4]){ a[k] = AUXI; i++; }
			else if(AUXI[5] > AUXJ[5]){ a[k] = AUXJ; j++; }
			else{ a[k] = AUXI; i++; }
		}
	}
}