public class HW08_4108056020_4 extends Buy_Phone_v2 {
	final int[][] AUX = new int[1000][]; int a[][];

	public int[][] bestPhone(final int[][] inputArr){
		a = inputArr;
		final int TOP = mergeSort(0, a.length - 1), EX[][] = new int[TOP + 1][];
		EX[0] = a[TOP];
		int i, j, k, cnt = 1;
		boolean beat, check;
		for (i = TOP - 1, check = true; i >= 0; i--, check = true){
			for (j = 0, beat = false; j < cnt; j++, beat = false){
				for (k = 1; k < 6; k++) if (a[i][k] > EX[j][k]) beat = true;
				if (!beat){ check = false; break; }
			}
			if (check) EX[cnt++] = a[i];
		}
		final int[][] ANS = new int[cnt--][];
		for (j = 0; cnt > -1;) ANS[cnt--] = EX[j++];
		return ANS;
	}

	int mergeSort(final int lo, final int hi){
		if (lo >= hi) return lo;
		final int MID = hi + lo >>> 1, i_hi = mergeSort(lo, MID), j_hi = mergeSort(MID + 1, hi);
		int i = lo, j = MID + 1, k, h, top = i_hi + (j_hi - j) + 1;
		for (k = i; k <= i_hi; k++) AUX[k] = a[k];
		for (k = j; k <= j_hi; k++) AUX[k] = a[k];
		for (k = i; i <= i_hi || j <= j_hi;){
			if (i > i_hi) a[k++] = AUX[j++];
			else if (j > j_hi) a[k++] = AUX[i++];
			else if (AUX[i][0] > AUX[j][0]){
				if (AUX[i][1] < AUX[j][1]) a[k++] = AUX[j++];
				else if (AUX[i][2] < AUX[j][2]) a[k++] = AUX[j++];
				else if (AUX[i][3] < AUX[j][3]) a[k++] = AUX[j++];
				else if (AUX[i][4] < AUX[j][4]) a[k++] = AUX[j++];
				else if (AUX[i][5] < AUX[j][5]) a[k++] = AUX[j++];
				else{ top--; j++; }
			} else if (AUX[i][0] < AUX[j][0]){
				if (AUX[i][1] > AUX[j][1]) a[k++] = AUX[i++];
				else if (AUX[i][2] > AUX[j][2]) a[k++] = AUX[i++];
				else if (AUX[i][3] > AUX[j][3]) a[k++] = AUX[i++];
				else if (AUX[i][4] > AUX[j][4]) a[k++] = AUX[i++];
				else if (AUX[i][5] > AUX[j][5]) a[k++] = AUX[i++];
				else{ top--; i++; }
			} else{
				for (h = 1; h < 6; h++){
					if (AUX[i][h] > AUX[j][h]){
						a[k++] = AUX[j++];
						break;
					} else if (AUX[i][h] < AUX[j][h]){
						a[k++] = AUX[i++];
						break;
					}
				}
				if (h == 6){ i++; top--; }
			}
		}
		return top;
	}
}