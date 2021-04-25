/**<!--생일 축하해. 미안해 노정훤. 되게 보고 싶던데.. 무슨 짓을 해도... 생각나던데...-->
 * This class shows how to implement and run two or more thread by partitioning
 * an array, which generally use for decrease the running time complexity from n
 * to n/t, where t depend on the number of thread you use. While, if the length
 * of the data we split is smaller than a specific value or the time complexity
 * is equal or lower than the data length, the running time may not decrease but
 * increase.
 * 
 * @version 4.4.3.27
 * @author twjmy@msn.com
 */
public class partitionThreading {
	final int CORE = 5; // e.g. open 5 thread
	/**
	 * For showing the resault, build a java build-in linked list without import.
	 * The "volatile" modifier can let us not to care about the synchronous problem
	 * to this variable. The "static" modifier is for printing in the main function.
	 */
	volatile static java.util.LinkedList<String> result;

	public partitionThreading(String array[]) { // or any other method(here is a constructor)
		/**
		 * Here we prevent the length of array is smaller then the number of thread, but
		 * generally we should find the specific size that runs algorithm linearly
		 * faster than run threads before. Think of you just run your algorithm for an
		 * array with size 5 and run 5 threads for each data, the time to initialize
		 * threads and launch them is wasted.
		 */
		final Thread T[] = new Thread[(CORE < array.length) ? CORE : array.length];
		for (int ti = 0; ti < T.length; ti++) {
			final int t = ti;
			T[t] = new Thread(() -> { // Java 8 : lambda expression for Runnable interface: https://www.w3schools.com/java/java_lambda.asp
				/**
				 * Here's the most important thing for partitioning the array by variable i below.
				 * In this example, every t+5k index launch the algorithm in the for-loop below.
				 */
				for (int i = t; i < array.length; i += T.length) {
					/**
					 * Here you can do any other stuff to your algorithm, but remember that we run
					 * threads faster only when the time complexity is more than n.
					 */
					for (int j = 0, sum = 0; j < array[i].length(); j++, sum = 0){ // Here is n^2.. or n*m, m is the length of each string.
						sum += Integer.parseInt("" + array[i].charAt(j)); // sum up all digits of the numbers
						if (sum % 2 == 0) {
							/**
							 * Save the number when the sum of the digits of the number is even, or you can
							 * show something else through variable sum. Since we modified variable "result"
							 * to "volatile", the "synchronized block" below can be removed.
							 */
							synchronized(result){
								result.add(array[i]); // but for saving result, this line is needed
							}
							/**
							 * Note that turn off output is faster and clean. And if we do so, the time
							 * complexity is more complicated, since java is a virtual machine and the cost
							 * for printing strings to the terminal is use more time than other language.
							 */
							// System.out.println(array[i]);
						}
					}
				}
			});
			T[t].start();
		}
		try { for (final Thread t:T)t.join(); }
		catch (final InterruptedException e) {}
	}

	public static void main(String[] args) {
		final String array[] = new String[500000]; // initialize array by size 500000
		for (int i = 0; i < array.length; i++)
			array[i] = "" + (i + 1); // {"0" ~ "LEN"}
		// System.out.println(java.util.Arrays.toString(array)); // check the array
		// partitionThreading obj = new partitionThreading(array); // it launched.

		// timing running with no threads
		double no_thread_time = 0;
		no_thread_time = -System.nanoTime();
		result = new java.util.LinkedList<String>();
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[i].length(); j++)
				sum += Integer.parseInt("" + array[i].charAt(j));
			if (sum % 2 == 0) {
				result.add(array[i]);
				/** Note that turn off output is faster and clean. */
				// System.out.println(array[i]);
			}
		}
		no_thread_time = (System.nanoTime() + no_thread_time) / Math.pow(10, 9);
		// System.out.println(result); // print result

		// timing running with threads
		double thread_time = 0;
		thread_time = -System.nanoTime();
		result = new java.util.LinkedList<String>();
		new partitionThreading(array);
		thread_time = (System.nanoTime() + thread_time) / Math.pow(10, 9);
		// System.out.println(result); // print result

		// print timing result
		System.out.printf("Cost of running with no threads:\t%.6fs\n", no_thread_time);
		System.out.printf("Cost of running with threads:\t\t%.6fs\n", thread_time);
		System.out.printf("Running with threads is faster than no threads by:\t%.6fs\n", no_thread_time - thread_time);
	}
}