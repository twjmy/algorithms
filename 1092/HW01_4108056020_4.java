public class HW01_4108056020_4 extends ArrayData {
	volatile int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	volatile boolean finished = false;
	//multi-threading in 2 method. when the fastest finished, end up another.
	final Thread T[] = new Thread[]{
		new Thread(()->{ //method1 linear search, Time Complexity: O(n)
			if(A.length==0) return;
			int min_=Integer.MAX_VALUE, max_=Integer.MIN_VALUE;
			for(int i=-1; A.length>++i && !finished;){
				if(A[i]>max_) max_=A[i];
				if(A[i]<min_) min_=A[i];
			}
			if(!finished) {
				min = min_; max = max_;
				finished = true;
			}
		}),
		new Thread(()->{ //method2 Compare in Pairs, Time Complexity: O(n)
			if(A.length==0) return;
			int i,min_=Integer.MAX_VALUE, max_=Integer.MIN_VALUE;
			if (A.length % 2 == 1) {
				min_ = A[0]; max_ = A[0];
				i = 1;
			} else {
				if (A[0] > A[1])
				{ max_ = A[0]; min_ = A[1]; }
				else
				{ max_ = A[1]; min_ = A[0]; }
				i = 2;
			}
			while(i<A.length-1 && !finished) {
				if(A[i]>A[i+1]){
					if(A[i]>max_) max_=A[i];
					if(A[i+1]<min_) min_=A[i+1];
				}else{
					if(A[i+1]>max_) max_=A[i+1];
					if(A[i]<min_) min_=A[i];
				}
				i += 2;
			}
			if(!finished) {
				min = min_; max = max_;
				finished = true;
			}
		})
	};
	public HW01_4108056020_4(final int[] ar){
		A = ar;
		T[0].start(); T[1].start();
		try{ T[0].join();T[1].join(); }
		catch(Exception e){}
	}
	public int max(){ return max; }
	public int min(){ return min; }
}