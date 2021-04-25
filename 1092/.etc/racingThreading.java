/**
 * This class shows how to implement and run two or more thread
 * and end all of them when one of them finished, which generally
 * use to running for more then one algorithm with the same time
 * complexity in java without import or extend any other library.
 * @author twjmy@msn.com
 */
public class racingThreading {
	/**
	 * Please add this variable to the break condition of
	 * <b>EVERY</b> loop(such as {@code for} or {@code while})
	 * in each implement {@code Runnable} of {@code Thread}
	 * with {@code ||} (<b>OR</b> logic algebra operation) since
	 * we want they check if another {@code Thread} finishied.
	 */
	volatile boolean finished = false;

	/** Example for return resault. */
	volatile int resault = 0;

	/**
	 * {@code static} modifier should add when
	 * start threads in {@code main} function.
	 * This is an example for running 2 thread.
	 */
	final Thread T[] = {
		new Thread(()->{ //algorithm 1
			while(!finished){ // or while(condition||!finished)/for(;condition||!finished;)
				System.out.println("T[0] is runing...");
				if(Math.round(Math.random())==1) break; // random demo
				//Do stuff
			}
			if(!finished) { //you can put this block to the breakpoint of the loop like *return*
				finished = true;
				resault = 327; //or set any other return variable
			}
			System.out.println("T[0] ended");
		}),
		new Thread(()->{ //algorithm 2
			while(!finished){
				System.out.println("T[1] is runing...");
				if(Math.round(Math.random())==1) break;
				//Do stuff
			}
			if(!finished) {
				finished = true;
				resault = 420; //or set any other return variable
			}
			System.out.println("T[1] ended");
		})
	};

	// 3 method to start threads below

	/** Start all threads when constructing. */
	public racingThreading(){ // --- [1] you can modify the name
		//start all thread initialized in order of Thread array T
		for(final Thread t:T) t.start();
		//wait all thread finish in order of Thread array T
		try{ for(final Thread t:T) t.join(); }
		catch(final Exception e){}
	}

	/**
	 * Start all threads when call this function.
	 * We can modify the function to pass parameter
	 * or return variable.
	 */
	public void func1(){ // --- [2]
		for(final Thread t:T) t.start();
		try{ for(final Thread t:T) t.join(); }
		catch(final Exception e){}
	}

	/**
	 * Start all threads when call this function,
	 * which returns {@code resault}.
	 */
	public int func2(){ // --- [3]
		for(final Thread t:T) t.start();
		try{ for(final Thread t:T) t.join(); }
		catch(final Exception e){}
		return resault;
	}

	/**
	 * In main function or any other java class, if we want
	 * to run {@code func1()} and {@code func2()} we declared
	 * above, we must call them after constructing it, then
	 * we can call them without put the {@code static}
	 * modifier to the method below.
	 */
	public static void main(String[] args){
		/**
		 * Notice threads can only run 1 time, if you want to run 1
		 * of 3, please remove the other 2 method and/or constructor
		 */
		racingThreading obj = new racingThreading(); // it construct this class and run all thread --- [1] you can modify the name
		System.out.println(obj.resault); //the resault is 327 if T[0] finish before T[1] else 420

		obj.func1(); // start threads by calling func1() --- [2]
		System.out.println(obj.resault);
		int resault_main = obj.func2(); // start threads by calling func2() --- [3]
		System.out.println(resault_main);

		//error occurs in:
		//func2();
		//System.out.println(func2());
		//Since main function can only run static functions
	}
}