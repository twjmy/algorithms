/**
 * Use the example below to build {@link Test} class by constructor
 * {@link #Test(int, String, boolean, boolean, String)}:
 * <pre> Test example = new Test(10, "min", false, true, "C:\\JavaProjects"); </pre>
 * The parameters is for setting the {@code final} variable for the object by the order below:
 * <p> {@link #RUN_TIME}, {@link #CHECK_ANS}, {@link #SHOW_COUNT}, {@link #SHOW_TEST_DATA}, {@link #PATH}
 * <p> Setting the parameters directly after class built is <b>forbidden</b>.
 *
 * @version 6.3
 * @author twjmy@msn.com
 * @apiNote NCHU CSE 1092 algorithm homework local test class.
 */
public class Test{
	public static void main(final String...미안해_노정훤){ // System.getProperty("user.dir") // the directory Test.java located at
		final Test test = new Test(1,"min",false,false,"C:\\OneDrive - 中興大學\\courses\\Alg\\1092");

		for(final int __ : new int[10]) // simulate the same way TA runs
			for(final String n : new String[]{"10","1000","20000","10_1","1","20000_1","20000_2","15","12","20000_3"})
				for(final SortingArray e : new SortingArray[]{
					// new HW10_4108056001_1(),
					// new HW10_4108056001_2(),
					// new HW10_4108056001_3(),
					// new HW10_4108056020_1(),
					new HW10_4108056020_2(),
					new HW10_4108056020_3(),
					new HW10_4108056020_4(),
					new HW10_4108056020_5(),
				}){
					final int[] TD = test.loadData_SortingArray(test.PATH+"\\SortingArray_test_data_"+n+".txt");
					final int[] ANS = java.util.Arrays.copyOf(TD,TD.length);
					java.util.Arrays.sort(ANS);
					test.timing(e, new int[][]{TD,ANS});
				}
		test.checkAverageFastest();

/* 
		for(final int __ : new int[10]) // simulate the same way TA runs
			for(final int n : new int[]{7694,788,598,398})
				for(final LSD e : new LSD[]{
					// new HW09_4108056026_2(),
					// new HW09_4108056020_1(),
					new HW09_4108056020_2(),
					new HW09_4108056020_3(),
					new HW09_4108056020_4(),
					new HW09_4108056020_5(),
					// new HW09_4108056020_repeat(),
				}) test.timing(e, test.loadData_LSD(test.PATH+"\\LSD_test_data_"+n+".txt"));
				// now we can load data via absolute path of the file
		test.checkAverageFastest();
 */
/* 
		// test.loadData_Buy_Phone_v2();// test.generateData_Buy_Phone_v2();
		test.Buy_Phone_v2_test_data = new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
		for(final Buy_Phone_v2 e : new Buy_Phone_v2[]{
			new HW08_4108056016_3(),
			new HW08_4108056016__3(),
			new HW08_4108056016_3_(),
			new HW08_4108056020_1(),
			new HW08_4108056020_2(),
			new HW08_4108056020_3(),
			new HW08_4108056020_4(),
			// new HW08_4108056020_5(),
		}) test.timing(e);
		test.checkFastest();
 */
/* 
		test.loadData_Buy_Phone();
		for(final Buy_Phone e : new Buy_Phone[]{
			new HW07_4108056020_1(),
			new HW07_4108056020_2(),
			new HW07_4108056020_3(),
			new HW07_4108056020_4(),
			// new HW07_4108056020_5(),
		}) test.timing(e);
		test.checkFastest();
 */
/* 
		test.loadData_LLK(); // test.generateData_LLK(64);
		for(final LLK e : new LLK[]{
			new HW05_4108056001_1(),
			new HW05_4108056007_1(),
			new HW05_4108056007_2(),
			new HW05_4108056007_3(),
			new HW05_4108056007_4(),
			new HW05_4108056012_1(),
			new HW05_4108056012_3(),
			new HW05_4108056012_4(),
			new HW05_4108056012__4(),
			new HW05_4108056020_1(),
			new HW05_4108056020_2(),
			new HW05_4108056020_3(),
			new HW05_4108056020_4(),
			new HW05_4108056020_5(),
			new HW05_4108056020_hash_gcd(),
			new HW05_4108056021_1(),
			new HW05_4108056021_2(),
			new HW05_4108056038_1_(),
			new HW05_4108056038_1(),
			new PCL4107056019(),
			new PCL4107056019_2021(),
			new PCL4107056019__2021(),
		}) test.timing(e);
		test.checkFastest();
 */
/* 
		test.loadData_One_0k_rock(); // test.generateData_One_0k_rock(20);
		for(final One_0k_rock e : new One_0k_rock[]{
			new HW04_4108056007_4(),
			new HW04_4108056007_4_(),
			new HW04_4108056020_1(),
			new HW04_4108056020_2(),
			new HW04_4108056020_3(),
			new HW04_4108056020_4(),
			new HW04_4108056020_5(),
			new HW04_4108056020_RE(),
		}) test.timing(e);
 */
/* 
		// test.loadData_HillFinding(); // test.generateData_HillFinding(30000);
		test.HillFinding_test_data = new int[]{2,3,4,1};
		test.HillFinding_ans = 0;
		for(final HillFinding e : new HillFinding[]{
			// new HW03_4108056001_2(),
			new HW03_4108056020_1(),
			new HW03_4108056020_2(),
			new HW03_4108056020_3(),
			new HW03_4108056020_4(),
			new HW03_4108056020_5(),
		}) test.timing(e);
		test.checkFastest();
 */
/* 
		final int[] TSumTD = test.loadData_ThreeSum();
		for(final ThreeSum e : new ThreeSum[]{
			new HW02_4108056001_1(),
			new HW02_4108056020_1(),
			new HW02_4108056020_2(),
			new HW02_4108056020_4(),
			new HW02_4108056020_5(),
			new HW02_4108056021_1(),
			new HW02_4108056021_2(),
			new HW02_4108056036_2(),
			new HW02_4108056036_3(),
		}) test.timing(e, TSumTD);
		test.checkFastest();
 */
	}

	public int[] timing(final SortingArray HW, final int[][] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start to timing "+HW.getClass()+" function sorting()...");
		double totalCost = 0;
		double time;
		int[] result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			time = -System.nanoTime();
			result = HW.sorting(TD[0]);
			time += System.nanoTime();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min")&&SHOW_COUNT) System.out.printf(
						"\t" + HW.getClass().getName() + " running count..." + (i + 1) + "\tTime: "
						+ (time > 1e3 ? "%.6f " : "%.3f m") + "s\tResult: " + result + "\n",
						time * (time > 1e3 ? 1000 : 1));
			if(CHECK_ANS!=null) for(int j = -1; result.length > ++j && totalCost != -1;)
			if(result[j] != TD[1][j]) totalCost = -1; //judge if "a" right
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println("\t"+HW.getClass()+" function sorting() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			((CHECK_ANS!=null&&!CHECK_ANS.equals("min"))?"\t":"")+HW.getClass().getName()+" method Distance() "
			+"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"
			+(CHECK_ANS!=null&&!CHECK_ANS.equals("min")?("\tResult: "+java.util.Arrays.toString(result)):"")+"\n",averageTime/(averageTime>1e9?1e9:1e6));
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	public int[][] generateData_SortingArray() {
		return generateData_SortingArray((int)(Math.random()*20000)+1, PATH);
	}

	public int[][] generateData_SortingArray(final String PATH) {
		return generateData_SortingArray((int)(Math.random()*20000)+1, PATH);
	}

	public int[][] generateData_SortingArray(final int SIZE) {
		return generateData_SortingArray(SIZE, PATH);
	}

	public int[][] generateData_SortingArray(final int SIZE, final String PATH) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("SortingArray test data generating by size " + SIZE + "...");
		final int[][] data = new int[2][SIZE];
		try {
			new java.io.File(PATH).createNewFile();
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
			new java.io.FileWriter(new java.io.File(
			PATH+"\\SortingArray_test_data.txt")));
			//final java.util.Random r = new java.util.Random();
			for(int i = -1; SIZE > ++i;){
				//data[0][i] = r.nextInt();
				switch((int)(Math.random()*2)){
					case 0:
					data[0][i] = (int)(Math.random()*Integer.MAX_VALUE);
					break;
					case 1:
					data[0][i] = (int)(Math.random()*Integer.MIN_VALUE);
					break;
				}
				bw.write(data[0][i]+((i == SIZE-1)?"":"\r\n"));
			}
			bw.flush(); bw.close();
			final int[] ans = data[0];
			java.util.Arrays.sort(ans);
			new java.io.File(PATH).createNewFile();
			bw = new java.io.BufferedWriter(new java.io.FileWriter(
			new java.io.File(PATH+"\\SortingArray_test_data_ans.txt")));
			for(int i = -1; SIZE > ++i;){
				data[1][i] = ans[i];
				bw.write(ans[i]+((i == SIZE-1)?"":"\r\n"));
			}
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min")&&SHOW_TEST_DATA) for(int i = -1; SIZE > ++i;)
			System.out.println(data[0][i]+""+data[1][i]);
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("SortingArray test data generated.");
		return data;
	}

	public int[] loadData_SortingArray(){
		return loadData_SortingArray(PATH+"\\SortingArray_test_data.txt");
	}

	public int[] loadData_SortingArray(final String PATH) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("SortingArray test data initializing from: "+PATH);
		java.util.ArrayList<Integer> data = new java.util.ArrayList<>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
			new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String line;
			while(br.ready() && (line = br.readLine()) != null){
				data.add(Integer.valueOf(line));
				if(SHOW_TEST_DATA) System.out.println(line);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("SortingArray test data initialized.");
		return data.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * The test data for {@link #timing(LSD, int[][])} while not assigned.
	 *
	 * @since 5.12
	 * @see #timing(LSD)
	 */
	public int[][] LSD_test_data = null;

	/**
	 * Timing class {@link LSD} by specific test data. If not assign, Load test data
	 * automatically from {@code LSD_test_data.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param HW {@link LSD}
	 * @return the result of last timing
	 * @since 5.12
	 * @see #LSD_test_data
	 * @see #timing(LSD, int)
	 * @see #loadData_LSD()
	 * @see #generateData_LSD()
	 */
	public int timing(final LSD HW){
		if(LSD_test_data == null) loadData_LSD();
		return timing(HW, LSD_test_data);
	}

	/**
	 * @param HW {@link LSD}
	 * @param TD test data of {@link LSD}
	 * @return the result of last timing
	 * @since 5.12
	 * @see #timing(LSD)
	 */
	public int timing(final LSD HW, final int[][] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method Distance() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time;
		int td[][], result = 0;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = new int[TD.length][];
			for(int j = 0; j< TD.length; j++)
				td[j] = java.util.Arrays.copyOf(TD[j], 2);
			time = -System.nanoTime();
			result = HW.Distance(td);
			time += System.nanoTime();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min")&&SHOW_COUNT) System.out.printf(
						"\t" + HW.getClass().getName() + " running count..." + (i + 1) + "\tTime: "
						+ (time > 1e3 ? "%.6f " : "%.3f m") + "s\tResult: " + result + "\n",
						time * (time > 1e3 ? 1000 : 1));
			// if(CHECK_ANS!=null) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method Distance() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			((CHECK_ANS!=null&&!CHECK_ANS.equals("min"))?"\t":"")+HW.getClass().getName()+" method Distance() "
			+"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"
			+(CHECK_ANS!=null?("\tResult: "+result+
			(CHECK_ANS.equals("min")?("\tArray length: "+TD.length):"")):"")+"\n",averageTime/(averageTime>1e9?1e9:1e6));
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link LSD} and set {@link #LSD_test_data}.
	 * <p>File {@code LSD_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself</h2>
	 *
	 * @return test data of {@link LSD}
	 * @since 5.12
	 * @see #LSD_test_data
	 * @see #generateData_LSD(int, int, String)
	 * @see #loadData_LSD()
	 * @see #timing(LSD, int[][])
	 */
	public int[][] generateData_LSD(){
		return generateData_LSD(1000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link LSD}
	 * @see #generateData_LSD()
	 */
	public int[][] generateData_LSD(final int LEN){
		return generateData_LSD(LEN, 50001);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @return test data of {@link LSD}
	 * @see #generateData_LSD()
	 */
	public int[][] generateData_LSD(final int LEN, final int RANGE){
		return generateData_LSD(LEN, RANGE, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @param PATH  the directory for file {@code LSD_test_data.txt} to save
	 * @return test data of {@link LSD}
	 * @see #generateData_LSD()
	 */
	public int[][] generateData_LSD(final int LEN, final int RANGE, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LSD test data generating by size: " + LEN + ", range: 0 ~ " + (RANGE-1) + "...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1; LEN > ++i;){
			test_data.add(new Integer[]{
				(int)(Math.random()*RANGE), (int)(Math.random()*RANGE)
			});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LSD test data saving on: "+PATH+"\\LSD_test_data.txt");
			final java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\LSD_test_data.txt"))
			);
			LSD_test_data = new int[LEN][];
			for(int i = -1; LEN > ++i;){
				LSD_test_data[i] = new int[]{
					test_data.get(i)[0], test_data.get(i)[1]
				};
				bw.write(
					LSD_test_data[i][0]+" "+LSD_test_data[i][1]+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		final int[][] result = new int[test_data.size()][];
		for(int i = -1; test_data.size() > ++i;){
			result[i] = new int[]{
				test_data.get(i)[0], test_data.get(i)[1]
			};
			if(SHOW_TEST_DATA) System.out.println(
				result[i][0]+" "+result[i][1]
			);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LSD test data and answer generated.");
		return result;
	}

	/**
	 * Load test data of {@link LSD} from specific directory(defaultly
	 * {@link #PATH}) and set {@link #LSD_test_data}. If not assign, the
	 * name of the file must be {@code LSD_test_data.txt}.
	 *
	 * @return test data of {@link LSD}
	 * @since 5.12
	 * @see #LSD_test_data
	 * @see #loadData_LSD(String)
	 * @see #generateData_LSD()
	 * @see #timing(LSD, int[][])
	 */
	public int[][] loadData_LSD(){
		return loadData_LSD(PATH + "\\LSD_test_data.txt");
	}

	/**
	 * @param PATH the absolute path of test data file to load
	 * @return loaded test data of {@link LSD}
	 * @see #loadData_LSD()
	 */
	public int[][] loadData_LSD(final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LSD test data loading from: " + PATH);
		final java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String[] line;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				data.add(new Integer[]{
					Integer.valueOf(line[0]), Integer.valueOf(line[1])
				});
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		LSD_test_data = new int[data.size()][];
		for(int i = -1; data.size() > ++i;){
			LSD_test_data[i] = new int[]{
				data.get(i)[0].intValue(), data.get(i)[1].intValue()
			};
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min") && SHOW_TEST_DATA) System.out.println(
				LSD_test_data[i][0]+" "+LSD_test_data[i][1]
			);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LSD test data initialized. Array length: "+LSD_test_data.length);
		return LSD_test_data;
	}

	/**
	 * The test data for {@link #timing(Buy_Phone_v2, int[][])} while not assigned.
	 *
	 * @since 4.14
	 * @see #timing(Buy_Phone_v2)
	 */
	public int[][] Buy_Phone_v2_test_data = null;

	/**
	 * Timing class {@link Buy_Phone_v2} by specific test data. If not assign, Load test data
	 * automatically from {@code Buy_Phone_v2_test_data.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param HW {@link Buy_Phone_v2}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #Buy_Phone_v2_test_data
	 * @see #timing(Buy_Phone_v2, int[][])
	 * @see #loadData_Buy_Phone_v2()
	 * @see #generateData_Buy_Phone_v2()
	 */
	public int[][] timing(final Buy_Phone_v2 HW){
		if(Buy_Phone_v2_test_data == null) loadData_Buy_Phone_v2();
		return timing(HW, Buy_Phone_v2_test_data);
	}

	/**
	 * @param HW {@link Buy_Phone_v2}
	 * @param TD test data of {@link Buy_Phone_v2}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #timing(Buy_Phone_v2)
	 */
	public int[][] timing(final Buy_Phone_v2 HW, final int[][] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method bestPhone() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time;
		int[][] td, result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = new int[TD.length][];
			for(int j = 0; j< TD.length; j++)
				td[j] = java.util.Arrays.copyOf(TD[j], 6);
			time = -System.nanoTime();
			result = HW.bestPhone(td);
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: "+(time>1e9?"%.6f ":"%.3f m")+"s\n",time*(time>1e9?1e9:1e6));
			// if(CHECK_ANS!=null) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method bestPhone() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
				(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName() + " method bestPhone() average running time: "
					+ (averageTime > 1e3 ? "%.6f " : "%.3f m") + "s" + (CHECK_ANS.equals("min") ? "" : "\n"),
					averageTime/(averageTime>1e9?1e9:1e6));
			switch(CHECK_ANS){
				case "matrix","row": 
					final StringBuffer SB = new StringBuffer("\tResult: \n");
					for(final int[] i:result){
						SB.append("\t\t");
						if(i==null) SB.append("null");
						else for(final int j:i) SB.append(j+" ");
						SB.append("\n");
					}
					System.out.println(SB);
					break;
				case "min","default": System.out.println("\tResult: "+java.util.Arrays.deepToString(result));
			}
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link Buy_Phone_v2} and set {@link #Buy_Phone_v2_test_data}.
	 * <p>File {@code Buy_Phone_v2_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself</h2>
	 *
	 * @return test data of {@link Buy_Phone_v2}
	 * @since 4.14
	 * @see #Buy_Phone_v2_test_data
	 * @see #generateData_Buy_Phone_v2(int, int, String)
	 * @see #loadData_Buy_Phone_v2()
	 * @see #timing(Buy_Phone_v2, int[][])
	 */
	public int[][] generateData_Buy_Phone_v2(){
		return generateData_Buy_Phone_v2(1000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link Buy_Phone_v2}
	 * @see #generateData_Buy_Phone_v2()
	 */
	public int[][] generateData_Buy_Phone_v2(final int LEN){
		return generateData_Buy_Phone_v2(LEN, 50001);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @return test data of {@link Buy_Phone_v2}
	 * @see #generateData_Buy_Phone_v2()
	 */
	public int[][] generateData_Buy_Phone_v2(final int LEN, final int RANGE){
		return generateData_Buy_Phone_v2(LEN, RANGE, PATH+"\\Buy_Phone_v2_test_data.txt");
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @param PATH  the directory for file {@code Buy_Phone_v2_test_data.txt} to save
	 * @return test data of {@link Buy_Phone_v2}
	 * @see #generateData_Buy_Phone_v2()
	 */
	public int[][] generateData_Buy_Phone_v2(final int LEN, final int RANGE, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone_v2 test data generating by size: " + LEN + ", range: 0 ~ " + (RANGE-1) + "...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1; LEN > ++i;){
			test_data.add(new Integer[]{
				(int)(Math.random()*RANGE), (int)(Math.random()*RANGE),
				(int)(Math.random()*RANGE), (int)(Math.random()*RANGE),
				(int)(Math.random()*RANGE), (int)(Math.random()*RANGE)
			});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone_v2 test data saving on: "+PATH);
			final java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH))
			);
			Buy_Phone_v2_test_data = new int[LEN][];
			for(int i = -1; LEN > ++i;){
				Buy_Phone_v2_test_data[i] = new int[]{
					test_data.get(i)[0], test_data.get(i)[1], test_data.get(i)[2],
					test_data.get(i)[3], test_data.get(i)[4], test_data.get(i)[5]
				};
				bw.write(
					Buy_Phone_v2_test_data[i][0]+" "+Buy_Phone_v2_test_data[i][1]+" "+
					Buy_Phone_v2_test_data[i][2]+" "+Buy_Phone_v2_test_data[i][3]+" "+
					Buy_Phone_v2_test_data[i][4]+" "+Buy_Phone_v2_test_data[i][5]+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		final int[][] result = new int[test_data.size()][];
		for(int i = -1; test_data.size() > ++i;){
			result[i] = new int[]{
				test_data.get(i)[0], test_data.get(i)[1],
				test_data.get(i)[2], test_data.get(i)[3],
				test_data.get(i)[4], test_data.get(i)[5]
			};
			if(SHOW_TEST_DATA) System.out.println(
				result[i][0]+" "+result[i][1]+" "+result[i][2]+" "+
				result[i][3]+" "+result[i][4]+" "+result[i][5]
			);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone_v2 test data and answer generated.");
		return result;
	}

	/**
	 * Load test data of {@link Buy_Phone_v2} from specific directory(defaultly
	 * {@link #PATH}) and set {@link #Buy_Phone_v2_test_data}. If not assign,
	 * the name of the file must be {@code Buy_Phone_v2_test_data.txt}.
	 *
	 * @return test data of {@link Buy_Phone_v2}
	 * @since 4.14
	 * @see #Buy_Phone_v2_test_data
	 * @see #loadData_Buy_Phone_v2(String)
	 * @see #generateData_Buy_Phone_v2()
	 * @see #timing(Buy_Phone_v2, int[][])
	 */
	public int[][] loadData_Buy_Phone_v2(){
		return loadData_Buy_Phone_v2(PATH + "\\Buy_Phone_v2_test_data.txt");
	}

	/**
	 * @param PATH the absolute path of test data file to load
	 * @return loaded test data of {@link Buy_Phone_v2}
	 * @see #loadData_Buy_Phone_v2()
	 */
	public int[][] loadData_Buy_Phone_v2(final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone_v2 test data loading from: " + PATH);
		final java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String[] line;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				data.add(new Integer[]{
					Integer.valueOf(line[0]), Integer.valueOf(line[1]),
					Integer.valueOf(line[2]), Integer.valueOf(line[3]),
					Integer.valueOf(line[4]), Integer.valueOf(line[5])
				});
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		Buy_Phone_v2_test_data = new int[data.size()][];
		for(int i = -1; data.size() > ++i;){
			Buy_Phone_v2_test_data[i] = new int[]{
				data.get(i)[0].intValue(), data.get(i)[1].intValue(),
				data.get(i)[2].intValue(), data.get(i)[3].intValue(),
				data.get(i)[4].intValue(), data.get(i)[5].intValue()
			};
			if(SHOW_TEST_DATA) System.out.println(
				Buy_Phone_v2_test_data[i][0]+" "+Buy_Phone_v2_test_data[i][1]+" "+
				Buy_Phone_v2_test_data[i][2]+" "+Buy_Phone_v2_test_data[i][3]+" "+
				Buy_Phone_v2_test_data[i][4]+" "+Buy_Phone_v2_test_data[i][5]+" "
			);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone_v2 test data initialized. Array length: "+Buy_Phone_v2_test_data.length);
		return Buy_Phone_v2_test_data;
	}

	/**
	 * The test data for {@link #timing(Buy_Phone, int[][])} while not assigned.
	 *
	 * @since 4.14
	 * @see #timing(Buy_Phone)
	 */
	public int[][] Buy_Phone_test_data = null;

	/**
	 * Timing class {@link Buy_Phone} by specific test data. If not assign, Load test data
	 * automatically from {@code Buy_Phone_test.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param HW {@link Buy_Phone}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #timing(Buy_Phone, int[][])
	 * @see #loadData_Buy_Phone()
	 * @see #generateData_Buy_Phone()
	 */
	public int[][] timing(final Buy_Phone HW){
		if(Buy_Phone_test_data == null) loadData_LLK();
		return timing(HW, Buy_Phone_test_data);
	}

	/**
	 * @param HW {@link Buy_Phone}
	 * @param TD test data of {@link Buy_Phone}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #timing(Buy_Phone)
	 */
	public int[][] timing(final Buy_Phone HW, final int[][] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method bestPhone() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time;
		int[][] td, result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = new int[TD.length][];
			for(int j = 0; j< TD.length; j++)
				td[j] = java.util.Arrays.copyOf(TD[j], 6);
			time = -System.nanoTime();
			result = HW.bestPhone(td);
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: "+(time>1e9?"%.6f ":"%.3f m")+"s\n",time*(time>1e9?1e9:1e6));
			// if(CHECK_ANS!=null) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method bestPhone() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName() + " method bestPhone() average running time: "
					+ (averageTime > 1e3 ? "%.6f " : "%.3f m") + "s" + (CHECK_ANS.equals("min") ? "" : "\n"),
					averageTime / (averageTime > 1e3?1e3:1));
			switch(CHECK_ANS){
				case "matrix","row": 
					final StringBuffer SB = new StringBuffer("\tResult: \n");
					for(final int[] i:result){
						SB.append("\t\t");
						if(i==null) SB.append("null");
						else for(final int j:i) SB.append(j+" ");
						SB.append("\n");
					}
					System.out.println(SB);
					break;
				case "min","default": System.out.println("\tResult: "+java.util.Arrays.deepToString(result));
			}
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link Buy_Phone} and set {@link #Buy_Phone_test_data}.
	 * <p>File {@code Buy_Phone_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself</h2>
	 *
	 * @return test data of {@link Buy_Phone}
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #generateData_Buy_Phone(int, int, String)
	 * @see #loadData_Buy_Phone()
	 * @see #timing(Buy_Phone, int[][])
	 */
	public int[][] generateData_Buy_Phone(){
		return generateData_Buy_Phone(1000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link Buy_Phone}
	 * @see #generateData_Buy_Phone()
	 */
	public int[][] generateData_Buy_Phone(final int LEN){
		return generateData_Buy_Phone(LEN, 50001);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @return test data of {@link Buy_Phone}
	 * @see #generateData_Buy_Phone()
	 */
	public int[][] generateData_Buy_Phone(final int LEN, final int RANGE){
		return generateData_Buy_Phone(LEN, RANGE, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code 0 ~ RANGE-1} in the array to generate
	 * @param PATH  the directory for file {@code Buy_Phone_test_data.txt} to save
	 * @return test data of {@link Buy_Phone}
	 * @see #generateData_Buy_Phone()
	 */
	public int[][] generateData_Buy_Phone(final int LEN, final int RANGE, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone test data generating by size: "+LEN+", range: 0 ~ "+(RANGE-1)+"...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1, x, y; LEN > ++i;){
			x = (int)(Math.random()*RANGE); y = (int)(Math.random()*RANGE);
			test_data.add(new Integer[]{x, y});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone test data saving on: "+PATH+"\\Buy_Phone_test_data.txt");
			final java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\Buy_Phone_test_data.txt"))
			);
			Buy_Phone_test_data = new int[LEN][2];
			for(int i = -1; LEN > ++i;){
				Buy_Phone_test_data[i] = new int[]{test_data.get(i)[0], test_data.get(i)[1]};
				bw.write(Buy_Phone_test_data[i][0]+" "+Buy_Phone_test_data[i][1]+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		final int[][] result = new int[test_data.size()][];
		for(int i = -1; test_data.size() > ++i;){
			result[i] = new int[]{test_data.get(i)[0], test_data.get(i)[1]};
			if(SHOW_TEST_DATA) System.out.println(result[i][0]+" "+result[i][1]);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone test data and answer generated.");
		return result;
	}

	/**
	 * Load test data of {@link Buy_Phone} from specific directory(defaultly
	 * {@link #PATH}) and set {@link #Buy_Phone_test_data}. If not assign,
	 * the name of the file must be {@code Buy_Phone_test_data.txt}.
	 *
	 * @return test data of {@link Buy_Phone}
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #loadData_Buy_Phone(String)
	 * @see #generateData_Buy_Phone()
	 * @see #timing(Buy_Phone, int[][])
	 */
	public int[][] loadData_Buy_Phone(){
		return loadData_Buy_Phone(PATH + "\\Buy_Phone_test_data.txt");
	}

	/**
	 * @param PATH the absolute path of test data file to load
	 * @return loaded test data of {@link Buy_Phone}
	 * @see #loadData_Buy_Phone()
	 */
	public int[][] loadData_Buy_Phone(final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone test data loading from: " + PATH);
		final java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String[] line; Integer[] xy;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				xy = new Integer[]{ Integer.valueOf(line[0]), Integer.valueOf(line[1]) };
				data.add(xy);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		Buy_Phone_test_data = new int[data.size()][2];
		for(int i = -1; data.size() > ++i;){
			Buy_Phone_test_data[i][0] = data.get(i)[0].intValue(); Buy_Phone_test_data[i][1] = data.get(i)[1].intValue();
			if(SHOW_TEST_DATA) System.out.println("("+Buy_Phone_test_data[i][0]+","+Buy_Phone_test_data[i][1]+")");
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Buy_Phone test data initialized. Array length: "+Buy_Phone_test_data.length);
		return Buy_Phone_test_data;
	}

	/**
	 * The test data for {@link #timing(LLK, int[][])} while not assigned.
	 *
	 * @since 3.31
	 * @see #timing(LLK)
	 */
	public int[][] LLK_test_data = null;

	/**
	 * Timing class {@link LLK} by specific test data. If not assign, Load test data
	 * automatically from {@code LLK_test_data.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param llk {@link LLK}
	 * @return the result of last timing
	 * @since 3.31
	 * @see #LLK_test_data
	 * @see #timing(LLK, int[][])
	 * @see #loadData_LLK()
	 * @see #generateData_LLK()
	 */
	public boolean timing(final LLK llk){
		if(LLK_test_data == null) loadData_LLK();
		return timing(llk, LLK_test_data);
	}

	/**
	 * @param HW {@link LLK}
	 * @param TD test data of {@link LLK}
	 * @return the result of last timing
	 * @since 3.31
	 * @see #timing(LLK)
	 */
	public boolean timing(final LLK HW, final int[][] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method checkLLK() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time;
		int[][] td; boolean result = false;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = new int[TD.length][];
			for(int j = 0; j< TD.length; j++)
				td[j] = java.util.Arrays.copyOf(TD[j], 2);
			time = -System.nanoTime();
			result = HW.checkLLK(td);
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: "+(time>1e9?"%.6f ":"%.3f m")+"s\n",time*(time>1e9?1e9:1e6));
			// if(CHECK_ANS!=null) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method checkLLK() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method checkLLK() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"+(CHECK_ANS.equals("min")?"":"\n"),averageTime/(averageTime>1e9?1e9:1e6));
			if(CHECK_ANS!=null) System.out.println("\tResult: "+result);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link LLK} and set {@link #LLK_test_data}.
	 * <p>File {@code LLK_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself</h2>
	 *
	 * @return test data of {@link LLK}
	 * @since 3.31
	 * @see #LLK_test_data
	 * @see #generateData_LLK(int, int, String)
	 * @see #loadData_LLK()
	 * @see #timing(LLK, int[][])
	 */
	public int[][] generateData_LLK(){
		return generateData_LLK(10000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link LLK}
	 * @see #generateData_LLK()
	 */
	public int[][] generateData_LLK(final int LEN){
		return generateData_LLK(LEN, Integer.MAX_VALUE);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code -RANGE ~ RANGE-1} in the array to generate
	 * @return test data of {@link LLK}
	 * @see #generateData_LLK()
	 */
	public int[][] generateData_LLK(final int LEN, final int RANGE){
		return generateData_LLK(LEN, RANGE, PATH+"\\LLK_test_data.txt");
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code -RANGE ~ RANGE-1} in the array to generate
	 * @param PATH  the directory for file {@code LLK_test_data.txt} to save
	 * @return test data of {@link LLK}
	 * @see #generateData_LLK()
	 */
	public int[][] generateData_LLK(final int LEN, final int RANGE, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LLK test data generating by size: "+LEN+", range: -"+RANGE+" ~ "+(RANGE-1)+"...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1, x, y; LEN > ++i;){
			x = (int)(Math.random()*RANGE); y = (int)(Math.random()*RANGE);
			if(Math.random()<0.5) x = ~x; if(Math.random()<0.5) y = ~y;
			test_data.add(new Integer[]{x, y});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LLK test data saving on: "+PATH);
			final java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(PATH))
			);
			LLK_test_data = new int[LEN][2];
			for(int i = -1; LEN > ++i;){
				LLK_test_data[i] = new int[]{test_data.get(i)[0], test_data.get(i)[1]};
				bw.write(LLK_test_data[i][0]+" "+LLK_test_data[i][1]+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		final int[][] result = new int[test_data.size()][];
		for(int i = -1; test_data.size() > ++i;){
			result[i] = new int[]{test_data.get(i)[0], test_data.get(i)[1]};
			if(SHOW_TEST_DATA) System.out.println(result[i][0]+" "+result[i][1]);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LLK test data and answer generated.");
		return result;
	}

	/**
	 * Load test data of {@link LLK} from specific directory(defaultly
	 * {@link #PATH}) and set {@link #LLK_test_data}. The name of the file must be
	 * {@code LLK_test_data.txt}.
	 *
	 * @return test data of {@link LLK}
	 * @since 3.31
	 * @see #LLK_test_data
	 * @see #loadData_LLK(String)
	 * @see #generateData_LLK()
	 * @see #timing(LLK, int[][])
	 */
	public int[][] loadData_LLK(){
		return loadData_LLK(PATH + "\\LLK_test_data.txt");
	}

	/**
	 * @param PATH the absolute path of test data file to load
	 * @return loaded test data of {@link LLK}
	 * @see #loadData_LLK()
	 */
	public int[][] loadData_LLK(final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LLK test data loading from: " + PATH);
		final java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String[] line; Integer[] xy;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				xy = new Integer[]{ Integer.valueOf(line[0]), Integer.valueOf(line[1]) };
				data.add(xy);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		LLK_test_data = new int[data.size()][2];
		for(int i = -1; data.size() > ++i;){
			LLK_test_data[i][0] = data.get(i)[0].intValue(); LLK_test_data[i][1] = data.get(i)[1].intValue();
			if(SHOW_TEST_DATA) System.out.println("("+LLK_test_data[i][0]+","+LLK_test_data[i][1]+")");
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("LLK test data initialized. Array length: "+LLK_test_data.length);
		return LLK_test_data;
	}

	/**
	 * The answer for check and break loop in
	 * {@link #timing(One_0k_rock, String[])} while switch
	 * {@link #CHECK_ANS} on.
	 * @since 3.24
	 * @see #timing(One_0k_rock, String[])
	 */
	public boolean[] One_0k_rock_ans = null;

	/**
	 * The test data for {@link #timing(One_0k_rock, String[])} while not assigned.
	 *
	 * @since 3.24
	 * @see #timing(One_0k_rock, String[])
	 */
	public String[] One_0k_rock_test_data = null;

	/**
	 * Timing class {@link One_0k_rock} by specific test data. load test data
	 * automatically if not assign.
	 * <p>
	 * If you turn the switch {@link #CHECK_ANS} on and generate test data manually,
	 * please set {@link #One_0k_rock_ans} manually also, or the loop may break by
	 * checking {@code One_0k_rock_test_data_ans.txt} under {@link #PATH} setting
	 * while construct.
	 *
	 * @param HW {@link One_0k_rock}
	 * @return the result of last timing
	 * @since 3.24
	 * @see #One_0k_rock_ans
	 * @see #timing(One_0k_rock, int[])
	 * @see #loadData_One_0k_rock()
	 * @see #generateData_One_0k_rock()
	 */
	public boolean[] timing(final One_0k_rock HW) {
		if(One_0k_rock_test_data==null) loadData_One_0k_rock();
		return timing(HW, One_0k_rock_test_data);
	}

	/**
	 * @param HW {@link One_0k_rock}
	 * @param TD test data of {@link One_0k_rock}
	 * @return the result of last timing
	 * @since 3.24
	 * @see #timing(One_0k_rock)
	 */
	public boolean[] timing(final One_0k_rock HW, final String[] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method one0k() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time = 0;
		String[] td; boolean[] result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = HW.one0k(td);
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: "+(time>1e9?"%.6f ":"%.3f m")+"s\n",time*(time>1e9?1e9:1e6));
			if(CHECK_ANS != null && One_0k_rock_ans != null)
			 for(int c = -1; ++c < One_0k_rock_ans.length;)
			  if(result[c] != One_0k_rock_ans[c]){
				totalCost = -1;
				break;
			  }
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
					(CHECK_ANS.equals("min")?"":"\t") + HW.getClass().getName() + " method one0k() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method one0k() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"+(CHECK_ANS.equals("min")?"":"\n"),averageTime/(averageTime>1e9?1e9:1e6));
		}
		if(CHECK_ANS!=null) System.out.println("\tResult: " + java.util.Arrays.toString(result) + (CHECK_ANS.equals("min")?"":("\tCorrect: "
					+ java.util.Arrays.toString(One_0k_rock_ans))));
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link One_0k_rock} and set {@link #One_0k_rock_ans} to
	 * the correct answer of the generated test data {@link #One_0k_rock_test_data}.
	 * <p> File {@code One_0k_rock_test_data.txt} and
	 * {@code One_0k_rock_test_data_ans.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically.
	 *
	 * @return test data of {@link One_0k_rock}
	 * @since 3.17
	 * @see #One_0k_rock_ans
	 * @see #One_0k_rock_test_data
	 * @see #generateData_One_0k_rock(int, int, String)
	 * @see #loadData_One_0k_rock()
	 * @see #timing(One_0k_rock, int[])
	 */
	public String[] generateData_One_0k_rock(){
		return generateData_One_0k_rock(5, (int)(Math.pow(2, 16))-1, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link One_0k_rock}
	 * @see #generateData_One_0k_rock()
	 */
	public String[] generateData_One_0k_rock(final int LEN){
		return generateData_One_0k_rock(LEN, (int)(Math.pow(2, 16))-1, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param MAX  the maximum length of a single {@link String} in the array to generate
	 * @return test data of {@link One_0k_rock}
	 * @see #generateData_One_0k_rock()
	 */
	public String[] generateData_One_0k_rock(final int LEN, final int MAX){
		return generateData_One_0k_rock(LEN, MAX>2?MAX:2, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param MAX  the maximum length of a single {@link String} in the array to generate
	 * @param PATH the directory for file {@code One_0k_rock_test_data.txt} and
	 *             {@code One_0k_rock_test_data_ans.txt} to save
	 * @return test data of {@link One_0k_rock}
	 * @see #generateData_One_0k_rock()
	 */
	public String[] generateData_One_0k_rock(final int LEN, final int MAX, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data generating by size: " + LEN + ", max length: " + MAX + "...");
		One_0k_rock_test_data = new String[LEN];
		One_0k_rock_ans = new boolean[LEN];
		final Thread[] T = new Thread[5];
		for(int ti=-1; ++ti<5;){
			final int t = ti;
			T[t]=new Thread(()->{
				char[] charr;
				for(int i=t; LEN > i; i+=5){
					int rn; boolean next = Math.random() < 0.5;
					if(next){
						rn = ((int)(Math.random()*(MAX-2))+2)>>>1;
						charr = (new String(new char[rn]).replace('\0', '0')+new String(new char[rn]).replace('\0', '1')).toCharArray();
						next = Math.random() < 0.5;
						if(!next){
							rn = (int)((charr.length>>>1)*Math.random());
							if(Math.random() < 0.5) charr[rn] = '1';
							else charr[charr.length-1-rn] = '0';
							if(Math.random() < 0.5){
								charr[rn] = '1';
								charr[charr.length-1-rn] = '0';
							}
						}
					} else {
						charr = new char[(int)(Math.random()*(MAX-1))+1];
						for(int j = -1; charr.length > ++j;){
							charr[j] = Math.random()<0.5?'0':'1';
						}
						rn = (int)((charr.length>>>1)*Math.random());
						if(Math.random() < 0.5) charr[rn] = '1';
						else charr[charr.length-1-rn] = '0';
						if(Math.random() < 0.5){
							charr[rn] = '1';
							charr[charr.length-1-rn] = '0';
						}
					}
					One_0k_rock_test_data[i] = new String(charr);
					One_0k_rock_ans[i] = next;
					if(SHOW_TEST_DATA) System.out.println(""+One_0k_rock_ans[i]+'\t'+One_0k_rock_test_data[i]);
				}
			});
			T[t].start();
		}
		try{ for(final Thread t:T) t.join(); }
		catch(final InterruptedException e){}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data saving on: "+PATH+"\\One_0k_rock_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\One_0k_rock_test_data.txt"))
			);
			for(int i = -1; LEN > ++i;)
				bw.write(One_0k_rock_test_data[i]+(i==LEN-1?"":"\r\n"));
			bw.flush(); bw.close();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data answer saving on: "+PATH+"\\One_0k_rock_test_data_ans.txt");
			bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\One_0k_rock_test_data_ans.txt"))
			);
			for(int i = -1; LEN > ++i;)
				bw.write(One_0k_rock_ans[i]+(i==LEN-1?"":"\r\n"));
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data and answer generated.");
		return One_0k_rock_test_data;
	}

	/**
	 * Load test data of {@link One_0k_rock} from parameter specific directory and
	 * set {@link #One_0k_rock_ans}, {@link #One_0k_rock_test_data}. The name of
	 * the file must be {@code One_0k_rock_test_data.txt} and
	 * {@code One_0k_rock_test_data_ans.txt}
	 *
	 * @return test data of {@link One_0k_rock}
	 * @since 3.17
	 * @see #One_0k_rock_ans
	 * @see #One_0k_rock_test_data
	 * @see #loadData_One_0k_rock(String)
	 * @see #generateData_One_0k_rock()
	 * @see #timing(One_0k_rock, int[])
	 */
	public String[] loadData_One_0k_rock(){
		return loadData_One_0k_rock(PATH);
	}

	/**
	 * @param PATH the directory of {@code One_0k_rock_test_data.txt} and
	 *             {@code One_0k_rock_test_data_ans.txt}
	 * @return loaded test data of {@link One_0k_rock}
	 * @see #loadData_One_0k_rock()
	 */
	public String[] loadData_One_0k_rock(final String PATH) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data loading from: " + PATH + "\\One_0k_rock_test_data.txt");
		java.util.List<String> data = new java.util.ArrayList<>(), ans = new java.util.ArrayList<>();
		try {
			data = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(PATH + "\\One_0k_rock_test_data.txt"));
		} catch (final java.io.IOException e) {
			System.out.println("\"One_0k_rock_test_data.txt\" file not found.");
			System.exit(0);
		}
		final String[] result = data.toArray(String[]::new);
		One_0k_rock_test_data = result;
		if(SHOW_TEST_DATA)
		 for(int i = -1; ++i < result.length;)
		 	System.out.println(result[i]);

		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data answer loading from: "+PATH+"\\One_0k_rock_test_data_ans.txt");
		try {
			ans = java.nio.file.Files.readAllLines(java.nio.file.Paths.get(PATH + "\\One_0k_rock_test_data_ans.txt"));
		} catch (final java.io.IOException e) {
			System.out.println("\"One_0k_rock_test_data_ans.txt\" file not found.");
			System.exit(0);
		}
		final String[] answ =  ans.toArray(String[]::new);
		One_0k_rock_ans = new boolean[answ.length];

		if(SHOW_TEST_DATA) System.out.println("Correct answer:");
		for(int i = -1; ++i < answ.length;){
			One_0k_rock_ans[i] = Boolean.parseBoolean(answ[i]);
			if(SHOW_TEST_DATA) System.out.println(""+One_0k_rock_ans[i]);
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("One_0k_rock test data initialized. Array length: "+One_0k_rock_test_data.length);
		return One_0k_rock_test_data;
	}

	/**
	 * The answer for check and break loop in
	 * {@link #timing(HillFinding, int[])} while switch
	 * {@link #CHECK_ANS} on.
	 * @since 3.17
	 * @see #timing(HillFinding)
	 */
	public int HillFinding_ans = -2;

	/**
	 * The test data for {@link #timing(HillFinding, int[])} while not assigned.
	 *
	 * @since 3.17
	 * @see #timing(HillFinding)
	 */
	public int[] HillFinding_test_data = null;

	/**
	 * Timing class {@link HillFinding} by specific test data. Load test data
	 * automatically if not assign.
	 * <p>
	 * If you turn the switch {@link #CHECK_ANS} on and generate test data manually,
	 * please set {@link #HillFinding_ans} manually also, or the loop may break by
	 * checking {@code HillFinding_test_data_ans.txt} under {@link #PATH} setting
	 * while construct.
	 *
	 * @param HW {@link HillFinding}
	 * @return the result of last timing
	 * @since 3.17
	 * @see #HillFinding_ans
	 * @see #timing(HillFinding, int[])
	 * @see #loadData_HillFinding()
	 * @see #generateData_HillFinding()
	 */
	public int timing(final HillFinding HW) {
		if(HillFinding_test_data==null) loadData_HillFinding();
		return timing(HW, HillFinding_test_data);
	}

	/**
	 * @param HW {@link HillFinding}
	 * @param TD test data of {@link HillFinding}
	 * @return the result of last timing
	 * @since 3.17
	 * @see #timing(HillFinding)
	 */
	public int timing(final HillFinding HW, final int[] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method H_Finding() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time = 0;
		int result = -2, td[];
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = HW.H_Finding(td);
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: "+(time>1e9?"%.6f ":"%.3f m")+"s\n",time*(time>1e9?1e9:1e6));
			if(CHECK_ANS!=null) if(HillFinding_ans != -2 && result != HillFinding_ans) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method H_Finding() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method H_Finding() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"+(CHECK_ANS.equals("min")?"":"\n"),averageTime/(averageTime>1e9?1e9:1e6));
		}
		if(CHECK_ANS!=null) System.out.println("\tResult: "+result+", Correct: "+HillFinding_ans);
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link HillFinding} and set {@link #HillFinding_ans} to
	 * the correct answer of the generated test data.
	 * <p> File {@code HillFinding_test_data.txt} and
	 * {@code HillFinding_test_data_ans.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically.
	 *
	 * @return test data of {@link HillFinding}
	 * @since 3.17
	 * @see #HillFinding_ans
	 * @see #generateData_HillFinding(int, int, int, String)
	 * @see #loadData_HillFinding()
	 * @see #timing(HillFinding)
	 */
	public int[] generateData_HillFinding(){
		return generateData_HillFinding((int)(Math.random()*(18+1)+2));
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link HillFinding}
	 * @see #generateData_HillFinding()
	 */
	public int[] generateData_HillFinding(final int LEN){
		return generateData_HillFinding(LEN, Integer.MAX_VALUE);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code -RANGE ~ RANGE-1} in the array to generate
	 * @return test data of {@link HillFinding}
	 * @see #generateData_HillFinding()
	 */
	public int[] generateData_HillFinding(final int LEN, final int RANGE){
		return generateData_HillFinding(LEN, RANGE, PATH );
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code -RANGE ~ RANGE-1} in the array to generate
	 * @param PATH the directory for file {@code HillFinding_test_data.txt} and
	 *             {@code HillFinding_test_data_ans.txt} to save
	 * @return test data of {@link HillFinding}
	 * @see #generateData_HillFinding()
	 */
	public int[] generateData_HillFinding(final int LEN, final int RANGE, final String PATH){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data generating by size: "+LEN+", range: -"+RANGE+" ~ "+(RANGE-1)+"...");
		final java.util.List<Integer> sortedArray = new java.util.ArrayList<Integer>(LEN);
		java.util.List<Integer> test_data = null;
		for(int i = -1; LEN > ++i;){
			int pivot = (int)(Math.random()*RANGE);
			if(Math.random()<0.5) pivot = ~pivot;
			final int index = java.util.Collections.binarySearch(sortedArray, pivot);
			sortedArray.add(index > -1 ? index : - index - 1, pivot);
		}
		final int to = (int)(Math.random()*(LEN-1)+1);
		test_data = sortedArray.subList(to, LEN);
		test_data.addAll(sortedArray.subList(0, to));
		HillFinding_ans = to-1;
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data saving on: "+PATH+"\\HillFinding_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\HillFinding_test_data.txt"))
			);
			HillFinding_test_data = new int[LEN];
			for(int i = -1; LEN > ++i;){
				HillFinding_test_data[i] = test_data.get(i);
				bw.write(test_data.get(i)+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data answer saving on: "+PATH+"\\HillFinding_test_data_ans.txt");
			bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\HillFinding_test_data_ans.txt"))
			);
			bw.write(""+(to-1));
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data and answer generated.");
		final int[] result = test_data.stream().mapToInt(i -> i).toArray();
		if(SHOW_TEST_DATA) System.out.println(test_data+"\nAnswer: "+HillFinding_ans);
		return result;
	}

	/**
	 * Load test data of {@link HillFinding} from parameter specific directory and
	 * set {@link #HillFinding_ans}. The name of the file must be
	 * {@code HillFinding_test_data.txt} and {@code HillFinding_test_data_ans.txt}
	 *
	 * @return loaded test data of {@link HillFinding}
	 * @since 3.17
	 * @see #HillFinding_ans
	 * @see #loadData_HillFinding(String)
	 * @see #generateData_HillFinding()
	 * @see #timing(HillFinding)
	 */
	public int[] loadData_HillFinding(){
		return loadData_HillFinding(PATH);
	}

	/**
	 * @param PATH the directory of {@code HillFinding_test_data.txt} and
	 *             {@code HillFinding_test_data_ans.txt}
	 * @return loaded test data of {@link HillFinding}
	 * @see #loadData_HillFinding()
	 */
	public int[] loadData_HillFinding(final String PATH) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data loading from: " + PATH + "\\HillFinding_test_data.txt");
		final java.util.ArrayList<Integer> data = new java.util.ArrayList<>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
			new java.io.InputStreamReader(new java.io.FileInputStream(PATH + "\\HillFinding_test_data.txt")));
			String line;
			while(br.ready() && (line = br.readLine()) != null){
				data.add(Integer.valueOf(line));
				if(SHOW_TEST_DATA) System.out.println(line);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println("\"HillFinding_test_data.txt\" file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data answer loading from: "+PATH+"\\HillFinding_test_data_ans.txt");
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
			new java.io.InputStreamReader(new java.io.FileInputStream(PATH+"\\HillFinding_test_data_ans.txt")));
			String line;
			while(br.ready() && (line = br.readLine()) != null){
				if(SHOW_TEST_DATA) System.out.println("Correct answer: "+line);
				HillFinding_ans = Integer.valueOf(line);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println("\"HillFinding_test_data_ans.txt\" file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		HillFinding_test_data = data.stream().mapToInt(Integer::intValue).toArray();
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("HillFinding test data initialized. Array length: "+HillFinding_test_data.length);
		return HillFinding_test_data;
	}

	/**
	 * Timing class {@link ThreeSum} by specific test data
	 *
	 * @param HW  {@link ThreeSum}
	 * @param TD test data of {@link ThreeSum}
	 * @return the result of last timing
	 * @since 3.10
	 * @see #loadData_ThreeSum()
	 */
	public int timing(final ThreeSum HW, final int[] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method T_Sum() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time = 0;
		int result = -1, td[];
		for (int i = -1; RUN_TIME > ++i && totalCost != -1;) {
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = HW.T_sum(td);
			time = (System.nanoTime() + time) / 1e6;
			if(SHOW_COUNT) System.out.printf(
			"\t"+HW.getClass().getName()+" running count..."+(i+1)+"\tTime: %.7fs\n",time);
			// if(CHECK_ANS!=null) if(result != 1338261) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method T_Sum() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method T_Sum() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s"+(CHECK_ANS.equals("min")?"":"\n"),averageTime);
		}
		if(CHECK_ANS!=null) System.out.println("\tResult: "+result);// +", Correct: 1338261");
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	/**
	 * Load test data of {@link ThreeSum} from specific directory.
	 * If not assign, the name of the file must be {@code ThreeSum_test_data.txt}
	 *
	 * @return loaded test data of {@link ThreeSum}
	 * @since 3.10
	 * @see #loadData_ThreeSum(String)
	 * @see #timing(ThreeSum, int[])
	 */
	public int[] loadData_ThreeSum() {
		return loadData_ThreeSum(PATH + "\\ThreeSum_test_data.txt");
	}

	/**
	 * @param PATH the directory of {@code ThreeSum_test_data.txt}
	 * @return loaded test data of {@link ThreeSum}
	 * @see #loadData_ThreeSum()
	 */
	public int[] loadData_ThreeSum(final String PATH) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("ThreeSum test data loading from: " + PATH);
		final java.util.ArrayList<Integer> data = new java.util.ArrayList<>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
			new java.io.InputStreamReader(new java.io.FileInputStream(PATH)));
			String line;
			while(br.ready() && (line = br.readLine()) != null){
				data.add(Integer.valueOf(line));
				if(SHOW_TEST_DATA) System.out.println(line);
			}
			br.close();
		} catch (final java.io.FileNotFoundException e) {
			System.out.println(PATH + " file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		final int[] ThreeSum_test_data = data.stream().mapToInt(Integer::intValue).toArray();
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("ThreeSum test data initialized. Array length: "+ThreeSum_test_data.length);
		return ThreeSum_test_data;
	}

	/**
	 * @deprecated
	 * <h2>This method is unimplemented</h2>
	 * Since TA build the {@link Class} by {@code ArrayData(int[])},
	 * the constructor may run before calling method {@link ArrayData#min()}
	 * or {@link ArrayData#max()}. We cannot pass the {@link Class} to the
	 * timeing method {@link #timing(ArrayData, int[])}
	 *
	 * @param HW  {@link ArrayData}
	 * @param TD test data of {@link ArrayData}
	 * @return the result of last timing
	 * @since 3.3
	 * @see #generateData_ArrayData()
	 */
	@Deprecated(since = "2.24")
	public int timing(final ArrayData HW, final int[] TD) {
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing method min() of "+HW.getClass().getName()+"...");
		double totalCost = 0;
		double time = 0; int result = 0;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			time = -System.nanoTime();
			result = HW.min();
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
						(CHECK_ANS.equals("min") ? "" : "\t") + HW.getClass().getName() + " running count..." + (i + 1)
								+ "\tTime: " + (time > 1e3 ? "%.6f " : "%.3f m") + "s"
								+ (CHECK_ANS.equals("min") ? "" : "\n"),
						time * (time > 1e3 ? 1000 : 1));
			// if(CHECK_ANS!=null) if(a != -1-1-1) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(CHECK_ANS != null && totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method min() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method min() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s\n",averageTime/(averageTime>1e9?1e9:1e6));
		}
		System.out.println("\tResult: "+result);

		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Start timing "+HW.getClass().getName()+" method max()...");
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			time = -System.nanoTime();
			result = HW.max();
			time += System.nanoTime();
			if(SHOW_COUNT) System.out.printf(
						(CHECK_ANS.equals("min") ? "" : "\t") + HW.getClass().getName() + " running count..." + (i + 1)
								+ "\tTime: " + (time > 1e3 ? "%.6f " : "%.3f m") + "s"
								+ (CHECK_ANS.equals("min") ? "" : "\n"),
						time * (time > 1e3 ? 1000 : 1));
			// if(CHECK_ANS!=null) if(a != -1-1-1) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(CHECK_ANS != null && totalCost == -1) System.out.println(
		(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method max() Wrong Answer.");
		else {
			final double averageTime = totalCost/RUN_TIME;
			timed(HW, averageTime);
			System.out.printf(
			(CHECK_ANS.equals("min")?"":"\t")+HW.getClass().getName()+" method max() "+
			"average running time: "+(averageTime>1e9?"%.6f ":"%.3f m")+"s\n",averageTime/(averageTime>1e9?1e9:1e6));
		}
		System.out.println("\tResult: "+result);
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("End of timing "+HW.getClass().getName()+".\n");
		return result;
	}

	public int[] ArrayData_test_data;
	/**
	 * Generate test data of {@link ArrayData}
	 *
	 * @return test data of {@link ArrayData}
	 * @since 3.3
	 * @see #timing(ArrayData, int[])
	 */
	public int[] generateData_ArrayData(final int LEN){
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("Generating ArrayData test data...");
		ArrayData_test_data = new int[LEN];
		final StringBuffer str = new StringBuffer("[");
		for(int e=-1;ArrayData_test_data.length>++e;){
			ArrayData_test_data[e] = (int)(Math.random()*(Integer.MAX_VALUE));
			if(Math.random()<0.5) ArrayData_test_data[e] = ~ArrayData_test_data[e];
			str.append(ArrayData_test_data[e]); str.append(", ");
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("ArrayData test data saving on: "+PATH+"\\ArrayData_test_data.txt");
			final java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\ArrayData_test_data.txt"))
			);
			for(int i = -1; LEN > ++i;){
				bw.write(ArrayData_test_data[i]+(i==LEN-1?"":"\r\n"));
			}
			bw.flush(); bw.close();
			// System.out.println("ArrayData test data answer saving on: "+PATH+"\\ArrayData_test_data_ans.txt");
			// bw = new java.io.BufferedWriter(
			// 	new java.io.FileWriter(new java.io.File(
			// 		PATH+"\\ArrayData_test_data_ans.txt"))
			// );
			// bw.write(...); bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		if(CHECK_ANS!=null&&!CHECK_ANS.equals("min"))System.out.println("ArrayData test data and answer generated.");
		str.replace(str.length()-2, str.length(), "]");
		if(SHOW_TEST_DATA) System.out.println(str);
		return ArrayData_test_data;
	}

	/**
	 * Compare the cost then replace {@link #fastest} and {@link #fastest_cost} if
	 * the cost is faster than before. 
	 * 
	 * @param HW          the timed object
	 * @param averageTime the average cost in a single timing of the object
	 * @see #MAP
	 * @see #fastest
	 * @see #fastest_cost
	 * @see #checkFastest()
	 * @see #checkAverageFastest()
	 */
	private void timed(final Object HW, final double averageTime){
		if(fastest_cost >= averageTime) {
			fastest_cost = averageTime;
			fastest = HW;
		}
		if(MAP.containsKey(HW.getClass().getName())) MAP.get(HW.getClass().getName()).add(averageTime);
		else {
			final java.util.ArrayList<Object> newList = new java.util.ArrayList<Object>();
			newList.add(HW);
			newList.add(averageTime);
			MAP.put(HW.getClass().getName(),newList);
		}
	}

	/**
	 * A hash map record all class and cost while calling all timing method. It is
	 * use for finding the fastest class and average cost after all timing method
	 * while calling {@link #checkAverageFastest()}.
	 * 
	 * @since 5.27
	 * @see #fastest
	 * @see #fastest_cost
	 * @see #checkFastest()
	 * @see 
	 * @see #timed(Object, double)
	 */
	final public java.util.HashMap<String, java.util.ArrayList<Object>> MAP = new java.util.HashMap<String, java.util.ArrayList<Object>>();

	/**
	 * Print the fastest class and average cost after all timing method calling,
	 * then reset {@link #fastest} and {@link #fastest_cost}.
	 * 
	 * @return {@link #fastest}
	 * @since 5.27
	 * @see #MAP
	 * @see #fastest
	 * @see #fastest_cost
	 * @see #checkFastest()
	 * @see #timed(Object, double)
	 */
	public Object checkAverageFastest(){
		fastest = null;
		fastest_cost = Double.MAX_VALUE;
		MAP.forEach((final String hashcode, final java.util.ArrayList<Object> list) -> {
			final Object HW = list.remove(0);
			final double averageTime = list.stream().mapToDouble(d->(double)d).average().orElse(Double.NaN);
			if(fastest_cost >= averageTime) {
				fastest = HW;
				fastest_cost = averageTime;
			}
			System.out.printf(HW.getClass().getName() + " average cost: "
					+ (averageTime>1e9?"%.6f ":"%.3f m")+"s\n", averageTime/(averageTime>1e9?1e9:1e6));
		});
		MAP.clear();
		return checkFastest();
	}

	/**
	 * Print the fastest class and average cost for each single timing method
	 * calling, then reset {@link #fastest} and {@link #fastest_cost}.
	 * 
	 * @return {@link #fastest}
	 * @since 4.4
	 * @see #fastest
	 * @see #fastest_cost
	 * @see #checkAverageFastest()
	 * @see #timed(Object, double)
	 */
	public Object checkFastest(){
		if(fastest == null){
			System.out.printf("You haven't start timing any class yet!");
			return null;
		}
		System.out.printf("["+java.time.LocalDate.now() + " " + java.time.LocalTime.now() + "] "
				+ fastest.getClass().getName() + " is the fastest, cost: "
				+ (fastest_cost>1e9?"%.6f ":"%.3f m")+"s\n\n", fastest_cost/(fastest_cost>1e9?1e9:1e6));
		Object tmp = fastest;
		fastest = null;
		fastest_cost = Double.MAX_VALUE;
		return tmp;
	}

	/**
	 * Fastest class to save
	 * @since 4.4
	 * @see #fastest_cost
	 * @see #checkFastest()
	 */
	public Object fastest = null;

	/**
	 * Fastest average cost to save
	 * @since 4.4
	 * @see #fastest
	 * @see #checkFastest()
	 */
	public double fastest_cost = Double.MAX_VALUE;

	/** The times of running for calculating average running time */
	public final int RUN_TIME;
	/** Switch of show the cost of every running */
	public final boolean SHOW_COUNT;
	/** Switch of show the test data you use */
	public final boolean SHOW_TEST_DATA;
	/**
	 * The format of showing result. Will compare the answer for answer-implemented
	 * method.
	 * <h3>Options:</h3>
	 * <ol>
	 * <li>{@code null}: no show
	 * <li>{@code "default"}: java built-in print way
	 * <li>{@code "matrix"}: print as matrix for 2d-array
	 * <li>{@code "row"}: same as {@code "matrix"}
	 * <li>{@code "min"}: shows only 1 line each timing
	 */
	public final String CHECK_ANS;
	/** The path of file handling */
	public final String PATH;

	/**
	 * <p> There are default values of <b>parameters</b> while not assigned(<b>build by {@link #Test()}</b>).
	 * 
	 * @param rt   setting: {@link #RUN_TIME} default: {@code 10}
	 * @param ca   setting: {@link #CHECK_ANS} default: {@code null} Options: "default","matrix","row","min"
	 * @param sc   setting: {@link #SHOW_COUNT} default: {@code false}
	 * @param std  setting: {@link #SHOW_TEST_DATA} default: {@code false}
	 * @param path setting: {@link #PATH} default: {@code System.getProperty("user.dir"))}
	 * @since 3.20
	 */
	public Test(final int rt, final String ca, final boolean sc, final boolean std, final String path){
		this.RUN_TIME=rt; this.PATH=path;
		this.SHOW_COUNT=sc; this.SHOW_TEST_DATA=std;
		System.out.println(this.getClass().getName()+": Path: " + path);
		System.out.println(this.getClass().getName()+": Run times of every method: "+rt);
		if(sc) System.out.println(this.getClass().getName()+": Show count status.");
		if(ca==null) this.CHECK_ANS=null;
		else switch(ca.toLowerCase()){
			case "default","matrix","row","min":
				System.out.println(
					this.getClass().getName()+": Check answers in format '"
					+(this.CHECK_ANS=ca.toLowerCase())+"'."
				);
				break;
			default: this.CHECK_ANS=null;
		}
	}

	/**
	 * Default Value of Parameter while not assign:
	 * <blackquote><pre>
	 * final int RUN_TIME = 10;
	 * final String CHECK_ANS = null;
	 *  // Options: "default","matrix","row","min"
	 * final boolean SHOW_COUNT = false;
	 * final boolean SHOW_TEST_DATA = false;
	 * final String PATH = System.getProperty("user.dir");
	 *  // current workspace.
	 * </pre></blackquote>
	 * 
	 * @see #RUN_TIME
	 * @see #CHECK_ANS
	 * @see #SHOW_COUNT
	 * @see #SHOW_TEST_DATA
	 * @see #PATH
	 * @see #Test(int, String, boolean, boolean, String)
	 */
	public Test(){ this(10,null,false,false,System.getProperty("user.dir")); }
}
abstract class GroupCounting {
	public abstract int count(String[] A, String[] B);
}
abstract class SortingArray {
	public abstract int[] sorting(int[] A);
}
abstract class LSD{
	public abstract int Distance(int[][] array);
}
abstract class Buy_Phone_v2{
	public abstract int[][] bestPhone(int[][] inputArr);
}
abstract class Buy_Phone{
	public abstract int[][] bestPhone(int[][] inputArr);
}
abstract class Dessert_Desert{
	public abstract int[] maxBlocks(int[][] inputArr);
}
abstract class LLK{
	public abstract boolean checkLLK(int[][] array);
}
abstract class One_0k_rock {
	public abstract boolean[] one0k(String[] str);
}
abstract class HillFinding {
	public abstract int H_Finding(int[] A);
}
abstract class ThreeSum {
	public abstract int T_sum(int[] A);
}
abstract class ArrayData {
	public int [] A;
	public abstract int max();
	public abstract int min();
}