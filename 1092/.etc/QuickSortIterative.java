/**
 * Copy from https://www.geeksforgeeks.org/iterative-quick-sort/
 * <h1>Modified
 */
class QuickSortIterative {
	public static void main(String args[]) {
		double arr[] = { 4, 3, 5, 2, 1, 3, 2, 3 };

		// Function calling
		sort(arr);

		StringBuffer str = new StringBuffer("[");
		for (double i : arr) { str.append(i); str.append(", "); }
		str.replace(str.length()-2, str.length(), "]");
		System.out.print(str);
	}

	/** @param arr Array to be sorted */
	static void sort(double arr[]) {
		// Create an auxiliary stack, initialize top of stack
		int stack[] = new int[arr.length], top = 0,
			// variable would use below
			i, j, h, l = 0;
		double p, t;
		// push the value of array length to stack
		stack[++top] = h = arr.length-1;

		// Keep popping from stack while is not empty
		while (top > -1) {
			// Pop h and l
			h = stack[top--]; l = stack[top--];

			/*
			 * Partition start: take last element as pivot, places the pivot element at its
			 * correct position in sorted array, and places all smaller (smaller than pivot)
			 * to left of pivot and all greater elements to right of pivot
			 */
			p = arr[h];

			// index of smaller element
			for (i = l - 1, j = l; j < h; j++) {
				// If current element is smaller than or equal to pivot
				if (arr[j] < p) {
					// swap arr[i] and arr[j]
					t = arr[++i]; arr[i] = arr[j]; arr[j] = t;
				}
			}

			// swap arr[i+1] and arr[high] (or pivot)
			t = arr[i + 1]; arr[i + 1] = arr[h]; arr[h] = t;

			// End of partition: Set pivot element at its correct position in sorted array
			p = i + 1;

			// If there are elements on left side of pivot, then push left side to stack
			if (p - 1 > l) { stack[++top] = l; stack[++top] = (int)(p - 1); }

			// If there are elements on right side of pivot, then push right side to stack
			if (p + 1 < h) { stack[++top] = (int)(p + 1); stack[++top] = h; }
		}
	}
}