/**<!--미안해...노정훤-->
 * NCHU CSE 1092 algorithm homework local test class
 * @version 4.29
 * @author twjmy@msn.com
 */
public class Test{
	public static void main(final String[] args){
		final Test test = new Test(5,true,false,false,System.getProperty("user.dir"));

		test.loadData_Buy_Phone();
		test.timing(new HW07_4108056020_1());
		test.timing(new HW07_4108056020_2());
		test.timing(new HW07_4108056020_3());
		test.timing(new HW07_4108056020_4());
		// test.timing(new HW07_4108056020_5());
		test.checkFastest();

		// test.generateData_LLK(64); // test.loadData_LLK();
		// test.timing(new HW05_4108056001_1());
		// test.timing(new HW05_4108056007_1());
		// test.timing(new HW05_4108056007_2());
		// test.timing(new HW05_4108056007_3());
		// test.timing(new HW05_4108056007_4());
		// test.timing(new HW05_4108056012_1());
		// test.timing(new HW05_4108056012_3());
		// test.timing(new HW05_4108056012_4());
		// test.timing(new HW05_4108056012__4());
		// test.timing(new HW05_4108056020_hash_gcd());
		// test.timing(new HW05_4108056020_1());
		// test.timing(new HW05_4108056020_2());
		// test.timing(new HW05_4108056020_3());
		// test.timing(new HW05_4108056020_4());
		// test.timing(new HW05_4108056020_5());
		// test.timing(new HW05_4108056021_1());
		// test.timing(new HW05_4108056021_2());
		// test.timing(new HW05_4108056038_1_());
		// test.timing(new HW05_4108056038_1());
		// test.timing(new PCL4107056019_2021());
		// test.timing(new PCL4107056019__2021());
		// test.timing(new PCL4107056019_2021());
		// test.timing(new PCL4107056019());

		// test.generateData_One_0k_rock(20); // test.loadData_One_0k_rock();
		// test.timing(new HW04_4108056007_4());
		// test.timing(new HW04_4108056007_4_());
		// test.timing(new HW04_4108056020_1());
		// test.timing(new HW04_4108056020_2());
		// test.timing(new HW04_4108056020_3());
		// test.timing(new HW04_4108056020_4());
		// test.timing(new HW04_4108056020_5());
		// test.timing(new HW04_4108056020_RE());

		// test.generateData_HillFinding(30000); // test.loadData_HillFinding();
		// test.timing(new HW03_4108056001_2());
		// test.timing(new HW03_4108056020_1());
		// test.timing(new HW03_4108056020_2());
		// test.timing(new HW03_4108056020_3());
		// test.timing(new HW03_4108056020_4());
		// test.timing(new HW03_4108056020_5());

		// final int[] TSumTD = test.loadData_ThreeSum();
		// test.timing(new HW02_4108056001_1(), TSumTD);
		// test.timing(new HW02_4108056020_1(), TSumTD);
		// test.timing(new HW02_4108056020_2(), TSumTD);
		// test.timing(new HW02_4108056020_5(), TSumTD);
		// test.timing(new HW02_4108056020_4(), TSumTD);
		// test.timing(new HW02_4108056021_1(), TSumTD);
		// test.timing(new HW02_4108056021_2(), TSumTD);
		// test.timing(new HW02_4108056036_2(), TSumTD);
		// test.timing(new HW02_4108056036_3(), TSumTD);
	}

	/**
	 * The test data for {@link #timing(Buy_Phone)} while not assigned.
	 *
	 * @since 4.14
	 * @see #timing(Buy_Phone)
	 */
	public int[][] Buy_Phone_test_data = null;

	/**
	 * Timing class {@link Buy_Phone} by specific test data. If not assign, Load test data
	 * automatically from {@code LLK_data_ans.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param BP {@link Buy_Phone}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #timing(Buy_Phone, int[])
	 * @see #loadData_Buy_Phone()
	 * @see #generateData_Buy_Phone()
	 */
	public int[][] timing(final Buy_Phone BP){
		if(Buy_Phone_test_data == null) loadData_LLK();
		return timing(BP, Buy_Phone_test_data);
	}

	/**
	 * @param BP {@link Buy_Phone}
	 * @param TD test data of {@link Buy_Phone}
	 * @return the result of last timing
	 * @since 4.14
	 * @see #timing(Buy_Phone)
	 */
	public int[][] timing(final Buy_Phone BP, final int[][] TD) {
		System.out.println("Start to timing "+BP.getClass()+" function bestPhone()...");
		double totalCost = 0;
		double time;
		int[][] td, result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = BP.bestPhone(td);
			time = (System.nanoTime()+time)/1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+BP.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			// if(CHECK_ANS) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		"\t"+BP.getClass()+" function bestPhone() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = BP;
			}
			System.out.printf(
			"\t"+BP.getClass()+" function bestPhone() "+
			"average running time: %.6fs\n",averageTime);
			if(CHECK_ANS){
				final StringBuffer SB = new StringBuffer("\tResault: [");
				for(final int[] i:result){
					if(i==null) SB.append(",");
					else SB.append(String.format("[%d,%d],",i[0],i[1]));
				}
				System.out.println(new StringBuffer(SB.substring(0,SB.length()-1)+"]"));
			}
		}
		System.out.println("End of timing "+BP.getClass()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link Buy_Phone} and set {@link #Buy_Phone_test_data}.
	 * <p>File {@code Buy_Phone_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself
	 *
	 * @return test data of {@link Buy_Phone}
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #generateData_Buy_Phone(int, int, String)
	 * @see #loadData_Buy_Phone()
	 * @see #timing(Buy_Phone, int[])
	 */
	public int[][] generateData_Buy_Phone(){
		return generateData_Buy_Phone(1000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link Buy_Phone}
	 * @since 4.14
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
		System.out.println("Buy_Phone test data generating by size: " + LEN + ", range: 0 ~ " + (RANGE-1) + "...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1, x, y; LEN > ++i;){
			x = (int)(Math.random()*RANGE); y = (int)(Math.random()*RANGE);
			test_data.add(new Integer[]{x, y});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			System.out.println("Buy_Phone test data saving on: "+PATH+"\\Buy_Phone_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
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
		System.out.println("Buy_Phone test data and answer generated.");
		return result;
	}

	/**
	 * Load test data of {@link Buy_Phone} from specific directory(defaultly
	 * {@link #PATH}) and set {@link #Buy_Phone_test_data}. The name of the file must be
	 * {@code Buy_Phone_test_data.txt}.
	 *
	 * @return test data of {@link Buy_Phone}
	 * @since 4.14
	 * @see #Buy_Phone_test_data
	 * @see #loadData_Buy_Phone(String)
	 * @see #generateData_Buy_Phone()
	 * @see #timing(Buy_Phone, int[])
	 */
	public int[][] loadData_Buy_Phone(){
		return loadData_Buy_Phone(PATH);
	}

	/**
	 * @param PATH the directory of {@code Buy_Phone_test_data.txt}
	 * @return loaded test data of {@link Buy_Phone}
	 * @see #loadData_Buy_Phone()
	 */
	public int[][] loadData_Buy_Phone(final String PATH){
		System.out.println("Buy_Phone test data loading from: " + PATH + "\\Buy_Phone_test_data.txt");
		java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH + "\\Buy_Phone_test_data.txt")));
			String[] line; Integer[] xy;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				xy = new Integer[]{ Integer.valueOf(line[0]), Integer.valueOf(line[1]) };
				data.add(xy);
			}
			br.close();
		} catch (final java.io.IOException e) {
			System.out.println("\"Buy_Phone_test_data.txt\" file not found.");
			System.exit(0);
		}
		Buy_Phone_test_data = new int[data.size()][2];
		for(int i = -1; data.size() > ++i;){
			Buy_Phone_test_data[i][0] = data.get(i)[0].intValue(); Buy_Phone_test_data[i][1] = data.get(i)[1].intValue();
			if(SHOW_TEST_DATA) System.out.println("("+Buy_Phone_test_data[i][0]+","+Buy_Phone_test_data[i][1]+")");
		}
		System.out.println("Buy_Phone test data initialized. Array length: "+Buy_Phone_test_data.length);
		return Buy_Phone_test_data;
	}

	/**
	 * The test data for {@link #timing(LLK, int[])} while not assigned.
	 *
	 * @since 3.31
	 * @see #timing(LLK)
	 */
	public int[][] LLK_test_data = null;

	/**
	 * Timing class {@link LLK} by specific test data. If not assign, Load test data
	 * automatically from {@code LLK_data_ans.txt} under {@link #PATH} setting while
	 * construct.
	 * <h3>When {@link #CHECK_ANS} ON only show result.</h3>
	 *
	 * @param llk {@link LLK}
	 * @return the result of last timing
	 * @since 3.31
	 * @see #LLK_test_data
	 * @see #timing(LLK, int[])
	 * @see #loadData_LLK()
	 * @see #generateData_LLK()
	 */
	public boolean timing(final LLK llk){
		if(LLK_test_data == null) loadData_LLK();
		return timing(llk, LLK_test_data);
	}

	/**
	 * @param Llk {@link LLK}
	 * @param TD test data of {@link LLK}
	 * @return the result of last timing
	 * @since 3.31
	 * @see #timing(LLK)
	 */
	public boolean timing(final LLK Llk, final int[][] TD) {
		System.out.println("Start to timing "+Llk.getClass()+" function checkLLK()...");
		double totalCost = 0;
		double time;
		int[][] td; boolean result = false;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = Llk.checkLLK(td);
			time = (System.nanoTime()+time)/1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+Llk.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			// if(CHECK_ANS) if(!result) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		"\t"+Llk.getClass()+" function checkLLK() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = Llk;
			}
			System.out.printf(
			"\t"+Llk.getClass()+" function checkLLK() "+
			"average running time: %.6fs\n",averageTime);
			if(CHECK_ANS) System.out.println("\tResault: "+result);
		}
		System.out.println("End of timing "+Llk.getClass()+".\n");
		return result;
	}

	/**
	 * Generate test data of {@link LLK} and set {@link #LLK_test_data}.
	 * <p>File {@code LLK_test_data.txt} will create or replace to the specific
	 * directory(defaultly {@link #PATH}) automatically. It will NOT generate the
	 * corresponding answer.
	 * <h2>Check the answer by yourself
	 *
	 * @return test data of {@link LLK}
	 * @since 3.31
	 * @see #LLK_test_data
	 * @see #generateData_LLK(int, int, String)
	 * @see #loadData_LLK()
	 * @see #timing(LLK, int[])
	 */
	public int[][] generateData_LLK(){
		return generateData_LLK(10000);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @return test data of {@link LLK}
	 * @since 3.31
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
		return generateData_LLK(LEN, RANGE, PATH);
	}

	/**
	 * @param LEN  the length of the array to generate
	 * @param RANGE  {@code -RANGE ~ RANGE-1} in the array to generate
	 * @param PATH  the directory for file {@code LLK_test_data.txt} to save
	 * @return test data of {@link LLK}
	 * @see #generateData_LLK()
	 */
	public int[][] generateData_LLK(final int LEN, final int RANGE, final String PATH){
		System.out.println("LLK test data generating by size: " + LEN + ", range: -" + RANGE + " ~ " + (RANGE-1) + "...");
		final java.util.List<Integer[]> test_data = new java.util.ArrayList<Integer[]>(LEN);
		for(int i = -1, x, y; LEN > ++i;){
			x = (int)(Math.random()*RANGE); y = (int)(Math.random()*RANGE);
			if(Math.random()<0.5) x = ~x; if(Math.random()<0.5) y = ~y;
			test_data.add(new Integer[]{x, y});
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			System.out.println("LLK test data saving on: "+PATH+"\\LLK_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\LLK_test_data.txt"))
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
		System.out.println("LLK test data and answer generated.");
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
	 * @see #timing(LLK, int[])
	 */
	public int[][] loadData_LLK(){
		return loadData_LLK(PATH);
	}

	/**
	 * @param PATH the directory of {@code LLK_test_data.txt}
	 * @return loaded test data of {@link LLK}
	 * @see #loadData_LLK()
	 */
	public int[][] loadData_LLK(final String PATH){
		System.out.println("LLK test data loading from: " + PATH + "\\LLK_test_data.txt");
		java.util.ArrayList<Integer[]> data = new java.util.ArrayList<Integer[]>();
		try {
			final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH + "\\LLK_test_data.txt")));
			String[] line; Integer[] xy;
			while(br.ready() && (line = br.readLine().split(" ")) != null){
				xy = new Integer[]{ Integer.valueOf(line[0]), Integer.valueOf(line[1]) };
				data.add(xy);
			}
			br.close();
		} catch (final java.io.IOException e) {
			System.out.println("\"LLK_test_data.txt\" file not found.");
			System.exit(0);
		}
		LLK_test_data = new int[data.size()][2];
		for(int i = -1; data.size() > ++i;){
			LLK_test_data[i][0] = data.get(i)[0].intValue(); LLK_test_data[i][1] = data.get(i)[1].intValue();
			if(SHOW_TEST_DATA) System.out.println("("+LLK_test_data[i][0]+","+LLK_test_data[i][1]+")");
		}
		System.out.println("LLK test data initialized. Array length: "+LLK_test_data.length);
		return LLK_test_data;
	}

	/**
	 * The answer for check and break loop in
	 * {@link #timing(HillFinding, int[])} while switch
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
	 * @param O0r {@link One_0k_rock}
	 * @return the result of last timing
	 * @since 3.24
	 * @see #One_0k_rock_ans
	 * @see #timing(One_0k_rock, int[])
	 * @see #loadData_One_0k_rock()
	 * @see #generateData_One_0k_rock()
	 */
	public boolean[] timing(final One_0k_rock O0r) {
		if(One_0k_rock_test_data==null) loadData_One_0k_rock();
		return timing(O0r, One_0k_rock_test_data);
	}

	/**
	 * @param O0r {@link One_0k_rock}
	 * @param TD test data of {@link One_0k_rock}
	 * @return the result of last timing
	 * @since 3.24
	 * @see #timing(One_0k_rock)
	 */
	public boolean[] timing(final One_0k_rock O0r, final String[] TD) {
		System.out.println("Start timing "+O0r.getClass()+" function one0k()...");
		double totalCost = 0;
		double time = 0;
		String[] td; boolean[] result = null;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			td = java.util.Arrays.copyOf(TD,TD.length);
			time = -System.nanoTime();
			result = O0r.one0k(td);
			time = (System.nanoTime()+time)/1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+O0r.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			if(CHECK_ANS && One_0k_rock_ans != null)
			 for(int c = -1; ++c < One_0k_rock_ans.length;)
			  if(result[c] != One_0k_rock_ans[c]){
				totalCost = -1;
				break;
			  }
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
					"\t" + O0r.getClass() + " function one0k() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = O0r;
			}
			System.out.printf(
			"\t"+O0r.getClass()+" function one0k() "+
			"average running time: %.6fs\n",averageTime);
		}
		if(CHECK_ANS) System.out.println("\tResault: " + java.util.Arrays.toString(result) + "\n\tCorrect: "
					+ java.util.Arrays.toString(One_0k_rock_ans));
		System.out.println("End of timing "+O0r.getClass()+".\n");
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
		System.out.println("One_0k_rock test data generating by size: " + LEN + ", max length: " + MAX + "...");
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
			System.out.println("One_0k_rock test data saving on: "+PATH+"\\One_0k_rock_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\One_0k_rock_test_data.txt"))
			);
			for(int i = -1; LEN > ++i;)
				bw.write(One_0k_rock_test_data[i]+(i==LEN-1?"":"\r\n"));
			bw.flush(); bw.close();
			System.out.println("One_0k_rock test data answer saving on: "+PATH+"\\One_0k_rock_test_data_ans.txt");
			bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\One_0k_rock_test_data_ans.txt"))
			);
			for(int i = -1; LEN > ++i;)
				bw.write(One_0k_rock_ans[i]+(i==LEN-1?"":"\r\n"));
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		System.out.println("One_0k_rock test data and answer generated.");
		return One_0k_rock_test_data;
	}

	/**
	 * Load test data of {@link One_0k_rock} from parameter specific directory and
	 * set {@link #One_0k_rock_ans}, {@link #One_0k_rock_test_data}. The name of the file must be
	 * {@code One_0k_rock_test_data.txt} and {@code One_0k_rock_test_data_ans.txt}
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
		System.out.println("One_0k_rock test data loading from: " + PATH + "\\One_0k_rock_test_data.txt");
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

		System.out.println("One_0k_rock test data answer loading from: "+PATH+"\\One_0k_rock_test_data_ans.txt");
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
		System.out.println("One_0k_rock test data initialized. Array length: "+One_0k_rock_test_data.length);
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
	 * @param HF {@link HillFinding}
	 * @return the result of last timing
	 * @since 3.17
	 * @see #HillFinding_ans
	 * @see #timing(HillFinding, int[])
	 * @see #loadData_HillFinding()
	 * @see #generateData_HillFinding()
	 */
	public int timing(final HillFinding HF) {
		if(HillFinding_test_data==null) loadData_HillFinding();
		return timing(HF, HillFinding_test_data);
	}

	/**
	 * @param HF {@link HillFinding}
	 * @param TD test data of {@link HillFinding}
	 * @return the result of last timing
	 * @since 3.17
	 * @see #timing(HillFinding)
	 */
	public int timing(final HillFinding HF, final int[] TD) {
		System.out.println("Start timing "+HF.getClass()+" function H_Finding()...");
		double totalCost = 0;
		double time = 0;
		int result = -2;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			if(CHECK_ANS && HillFinding_ans == -2 && i==0){
				System.out.println("HillFinding test data answer loading from: "+PATH+"\\HillFinding_test_data_ans.txt");
				try {
					final java.io.BufferedReader br = new java.io.BufferedReader(
					new java.io.InputStreamReader(new java.io.FileInputStream(PATH+"\\HillFinding_test_data_ans.txt")));
					String line;
					while(br.ready() && (line = br.readLine()) != null){
						System.out.println("Correct answer: "+line);
						HillFinding_ans = Integer.valueOf(line);
					}
					br.close();
				} catch (final java.io.FileNotFoundException e) {
					System.out.println("\"HillFinding_test_data_ans.txt\" file not found.");
					System.exit(0);
				} catch (final java.io.IOException e) {
				}
			}
			time = -System.nanoTime();
			result = HF.H_Finding(TD);
			time = (System.nanoTime()+time)/1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+HF.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			if(CHECK_ANS) if(HillFinding_ans != -2 && result != HillFinding_ans) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		"\t"+HF.getClass()+" function H_Finding() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = HF;
			}
			System.out.printf(
			"\t"+HF.getClass()+" function H_Finding() "+
			"average running time: %.6fs\n",averageTime);
		}
		if(CHECK_ANS) System.out.println("\tResault: "+result+", Correct: "+HillFinding_ans);
		System.out.println("End of timing "+HF.getClass()+".\n");
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
		System.out.println("HillFinding test data generating by size: " + LEN + ", range: -" + RANGE + " ~ " + (RANGE-1) + "...");
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
			System.out.println("HillFinding test data saving on: "+PATH+"\\HillFinding_test_data.txt");
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
			System.out.println("HillFinding test data answer saving on: "+PATH+"\\HillFinding_test_data_ans.txt");
			bw = new java.io.BufferedWriter(
				new java.io.FileWriter(new java.io.File(
					PATH+"\\HillFinding_test_data_ans.txt"))
			);
			bw.write(""+(to-1));
			bw.flush(); bw.close();
		} catch (final java.io.IOException e) {
		}
		System.out.println("HillFinding test data and answer generated.");
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
		System.out.println("HillFinding test data loading from: " + PATH + "\\HillFinding_test_data.txt");
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
		System.out.println("HillFinding test data answer loading from: "+PATH+"\\HillFinding_test_data_ans.txt");
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
		System.out.println("HillFinding test data initialized. Array length: "+HillFinding_test_data.length);
		return HillFinding_test_data;
	}

	/**
	 * Timing class {@link ThreeSum} by specific test data
	 *
	 * @param TS  {@link ThreeSum}
	 * @param TD test data of {@link ThreeSum}
	 * @return the result of last timing
	 * @since 3.10
	 * @see #loadData_ThreeSum()
	 */
	public int timing(final ThreeSum TS, final int[] TD) {
		System.out.println("Start timing "+TS.getClass()+" function T_Sum()...");
		double totalCost = 0;
		double time = 0;
		int result = -1;
		for (int i = -1; RUN_TIME > ++i && totalCost != -1;) {
			time = -System.nanoTime();
			result = TS.T_sum(TD);
			time = (System.nanoTime() + time) / 1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+TS.getClass()+" running count..."+(i+1)+"\tTime: %.7fs\n",time);
			// if(CHECK_ANS) if(result != 1338261) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(totalCost == -1) System.out.println(
		"\t"+TS.getClass()+" function T_Sum() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = TS;
			}
			System.out.printf(
			"\t"+TS.getClass()+" function T_Sum() "+
			"average running time: %.7fs\n",averageTime);
		}
		if(CHECK_ANS) System.out.println("\tResault: "+TS.T_sum(TD));// +", Correct: 1338261");
		System.out.println("End of timing "+TS.getClass()+".\n");
		return result;
	}

	/**
	 * Load test data of {@link ThreeSum} from specific directory The name of the
	 * file must be {@code ThreeSum_test_data.txt}
	 *
	 * @return loaded test data of {@link ThreeSum}
	 * @since 3.10
	 * @see #loadData_ThreeSum(String)
	 * @see #timing(ThreeSum, int[])
	 */
	public int[] loadData_ThreeSum() {
		return loadData_ThreeSum(PATH);
	}

	/**
	 * @param PATH the directory of {@code ThreeSum_test_data.txt}
	 * @return loaded test data of {@link ThreeSum}
	 * @see #loadData_ThreeSum()
	 */
	public int[] loadData_ThreeSum(String PATH) {
		PATH += "\\ThreeSum_test_data.txt";
		System.out.println("ThreeSum test data loading from: " + PATH);
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
			System.out.println("\"ThreeSum_test_data.txt\" file not found.");
			System.exit(0);
		} catch (final java.io.IOException e) {
		}
		int[] ThreeSum_test_data = data.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("ThreeSum test data initialized. Array length: "+ThreeSum_test_data.length);
		return ThreeSum_test_data;
	}

	/**
	 * @deprecated
	 * <h2>This method is unimplemented</h2> Since TA build the
	 * {@link Class} by {@code ArrayData(int[])}, the constructor may
	 * run before calling function {@link ArrayData#min()} or
	 * {@link ArrayData#max()}. We cannot pass the {@link Class} to the
	 * timeing method. {@link #timing(ArrayData, int[])}
	 *
	 * @param AD  {@link ArrayData}
	 * @param TD test data of {@link ArrayData}
	 * @return the result of last timing
	 * @since 3.3
	 * @see #generateData_ArrayData()
	 */
	@Deprecated(since = "2.24")
	public int timing(final ArrayData AD, final int[] TD) {
		System.out.println("Start timing "+AD.getClass()+" function min()...");
		double totalCost = 0;
		double time = 0; int result = 0;
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			time = -System.nanoTime();
			result = AD.min();
			time = (System.nanoTime()+time)/1000000000.0;
			if(SHOW_COUNT) System.out.printf(
			"\t"+AD.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			// if(CHECK_ANS) if(a != -1-1-1) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(CHECK_ANS && totalCost == -1) System.out.println(
		"\t"+AD.getClass()+" function min() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = AD;
			}
			System.out.printf(
			"\t"+AD.getClass()+" function min() "+
			"average running time: %.6fs\n",averageTime);
		}
		System.out.println("\tResault: "+AD.min());

		System.out.println("Start timing "+AD.getClass()+" function max()...");
		for(int i = -1; RUN_TIME > ++i && totalCost != -1;){
			time = -System.nanoTime();
			result = AD.max();
			time = (System.nanoTime()+time)/1e9;
			if(SHOW_COUNT) System.out.printf(
			"\t"+AD.getClass()+" running count..."+(i+1)+"\tTime: %.6fs\n",time);
			// if(CHECK_ANS) if(a != -1-1-1) totalCost = -1;
			if(totalCost != -1) totalCost += time;
		}
		if(CHECK_ANS && totalCost == -1) System.out.println(
		"\t"+AD.getClass()+" function max() Wrong Answer.");
		else {
			double averageTime = totalCost/RUN_TIME;
			if(Fastest_Cost>averageTime) {
				Fastest_Cost = averageTime;
				Fastest = AD;
			}
			System.out.printf(
			"\t"+AD.getClass()+" function max() "+
			"average running time: %.6fs\n",averageTime);
		}
		System.out.println("\tResault: "+AD.max());
		System.out.println("End of timing "+AD.getClass()+".\n");
		return result;
	}

	int[] ArrayData_test_data;
	/**
	 * Generate test data of {@link ArrayData}
	 *
	 * @return test data of {@link ArrayData}
	 * @since 3.3
	 * @see #timing(ArrayData, int[])
	 */
	public int[] generateData_ArrayData(final int LEN){
		System.out.println("Generating ArrayData test data...");
		ArrayData_test_data = new int[LEN];
		StringBuffer str = new StringBuffer("[");
		for(int e=-1;ArrayData_test_data.length>++e;){
			ArrayData_test_data[e] = (int)(Math.random()*(Integer.MAX_VALUE));
			if(Math.random()<0.5) ArrayData_test_data[e] = ~ArrayData_test_data[e];
			str.append(ArrayData_test_data[e]); str.append(", ");
		}
		try {
			final java.io.File file = new java.io.File(PATH);
			file.createNewFile();
			System.out.println("ArrayData test data saving on: "+PATH+"\\ArrayData_test_data.txt");
			java.io.BufferedWriter bw = new java.io.BufferedWriter(
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
		System.out.println("ArrayData test data and answer generated.");
		str.replace(str.length()-2, str.length(), "]");
		if(SHOW_TEST_DATA) System.out.println(str);
		return ArrayData_test_data;
	}

	/**
	 * Print the fastest class after timing.
	 * @return {@link #Fastest}
	 * @since 4.4
	 * @see #Fastest
	 * @see #Fastest_Cost
	 */
	public Object checkFastest(){
		if(Fastest == null) return null;
		System.out.printf("["+java.time.LocalDate.now() + " " + java.time.LocalTime.now() + "] "
				+ Fastest.getClass() + " is the fastest, cost: %.6fs\n", Fastest_Cost);
		return Fastest;
	}

	/**
	 * Fastest class to save
	 * @see #Fastest_Cost
	 * @see #checkFastest()
	 */
	public Object Fastest = null;

	/**
	 * Fastest average cost to save
	 * @see #Fastest
	 * @see #checkFastest()
	 */
	public Double Fastest_Cost = Double.MAX_VALUE;

	/** The times of running for calculating average running time */
	public final int RUN_TIME;
	/** Switch of show answer and break timming loop when wrong answer */
	public final boolean CHECK_ANS;
	/** Switch of show the cost of every running */
	public final boolean SHOW_COUNT;
	/** Switch of show the test data you use */
	public final boolean SHOW_TEST_DATA;
	/** The path of file handling */
	public final String PATH;

	/**
	 * Use the example below to built {@link Test} by setting the <b>parameters</b>.
	 * <p>
	 * Setting the parameters directly after class built is forbidden
	 * <p>
	 * Notice that if we pass only one boolean value, all the switches will turn on
	 * or off.
	 * <hr>
	 * <h3>Build / Construct Examples</h3> <blackquote>
	 *
	 * <pre>
	 * Test t1 = new Test();
	 * Test t2 = new Test(20);
	 * Test t3 = new Test(true);
	 * Test t4 = new Test("C:\\");
	 * Test t5 = new Test(20, true);
	 * Test t6 = new Test(true, "C:\\");
	 * Test t7 = new Test(20, true, "C:\\");
	 * Test t8 = new Test(true, false, true);
	 * Test t9 = new Test(20, true, false, true);
	 * Test t10 = new Test(true, false, true, "C:\\");
	 * Test t11 = new Test(20, true, false, true, "C:\\");
	 * </pre>
	 *
	 * </blackquote>
	 * <hr>
	 * <h3>Default Value of Parameter when not assign</h3> <blackquote>
	 *
	 * <pre>
	 * final int RUN_TIME = 10;
	 * final boolean CHECK_ANS = false;
	 * final boolean SHOW_COUNT = false;
	 * final boolean SHOW_TEST_DATA = false;
	 * final String PATH = System.getProperty("user.dir");// current workspace.
	 * </pre>
	 *
	 * </blackquote>
	 *
	 * @since 3.20
	 * @see #RUN_TIME
	 * @see #CHECK_ANS
	 * @see #SHOW_COUNT
	 * @see #SHOW_TEST_DATA
	 * @see #PATH
	 * @see #Test(int,boolean,boolean,boolean,String)
	 */
	public Test(){ this(false); }

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME){ this(RUN_TIME, false); }

	/**
	 * @param ALL the value to be set for all the value of {@link #CHECK_ANS},
	 * {@link #SHOW_COUNT}, and {@link #SHOW_TEST_DATA}
	 * @see #Test()
	 */
	public Test(final boolean ALL){ this(10, ALL); }

	/**
	 * @param PATH {@link #PATH}
	 * @see #Test()
	 */
	public Test(final String PATH){ this(10, false, PATH); }

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @param ALL the value to be set for all the value of {@link #CHECK_ANS},
	 * {@link #SHOW_COUNT}, and {@link #SHOW_TEST_DATA}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME, final boolean ALL){
		this(RUN_TIME, ALL, ALL, ALL);
	}

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @param PATH the value to be set for {@link #PATH}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME, final String PATH){
		this(RUN_TIME, false, PATH);
	}

	/**
	 * @param ALL the value to be set for all of {@link #CHECK_ANS},
	 * {@link #SHOW_COUNT}, and {@link #SHOW_TEST_DATA}
	 * @param PATH the value to be set for {@link #PATH}
	 * @see #Test()
	 */
	public Test(final boolean ALL, final String PATH){
		this(10, ALL, PATH);
	}

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @param ALL the value to be set for all the value of {@link #CHECK_ANS},
	 * {@link #SHOW_COUNT}, and {@link #SHOW_TEST_DATA}
	 * @param PATH the value to be set for {@link #PATH}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME, final boolean ALL, final String PATH){
		this(RUN_TIME, ALL, ALL, ALL, PATH);
	}

	/**
	 * @param CHECK_ANS the value to be set for {@link #CHECK_ANS}
	 * @param SHOW_COUNT the value to be set for {@link #SHOW_COUNT}
	 * @param SHOW_TEST_DATA the value to be set for {@link #SHOW_TEST_DATA}
	 * @see #Test()
	 */
	public Test(final boolean CHECK_ANS, final boolean SHOW_COUNT, final boolean SHOW_TEST_DATA){
		this(10,CHECK_ANS, SHOW_COUNT, SHOW_TEST_DATA);
	}

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @param CHECK_ANS the value to be set for {@link #CHECK_ANS}
	 * @param SHOW_COUNT the value to be set for {@link #SHOW_COUNT}
	 * @param SHOW_TEST_DATA the value to be set for {@link #SHOW_TEST_DATA}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME, final boolean CHECK_ANS, final boolean SHOW_COUNT, final boolean SHOW_TEST_DATA){
		this(RUN_TIME,CHECK_ANS, SHOW_COUNT, SHOW_TEST_DATA, System.getProperty("user.dir"));
	}

	/**
	 * @param CHECK_ANS the value to be set for {@link #CHECK_ANS}
	 * @param SHOW_COUNT the value to be set for {@link #SHOW_COUNT}
	 * @param SHOW_TEST_DATA the value to be set for {@link #SHOW_TEST_DATA}
	 * @param PATH the value to be set for {@link #PATH}
	 * @see #Test()
	 */
	public Test(final boolean CHECK_ANS, final boolean SHOW_COUNT, final boolean SHOW_TEST_DATA, final String PATH){
		this(10,CHECK_ANS, SHOW_COUNT, SHOW_TEST_DATA,PATH);
	}

	/**
	 * @param RUN_TIME the value to be set for {@link #RUN_TIME}
	 * @param CHECK_ANS the value to be set for {@link #CHECK_ANS}
	 * @param SHOW_COUNT the value to be set for {@link #SHOW_COUNT}
	 * @param SHOW_TEST_DATA the value to be set for {@link #SHOW_TEST_DATA}
	 * @param PATH the value to be set for {@link #PATH}
	 * @see #Test()
	 */
	public Test(final int RUN_TIME, final boolean CHECK_ANS, final boolean SHOW_COUNT, final boolean SHOW_TEST_DATA, final String PATH){
		this.RUN_TIME=RUN_TIME; this.PATH=PATH;
		this.CHECK_ANS=CHECK_ANS; this.SHOW_COUNT=SHOW_COUNT; this.SHOW_TEST_DATA=SHOW_TEST_DATA;
		System.out.println(this.getClass()+": Path: " + PATH);
		System.out.println(this.getClass()+": Run times of every function: "+RUN_TIME);
		if(SHOW_COUNT) System.out.println(this.getClass()+": Show count status.");
		if(CHECK_ANS) System.out.println(this.getClass()+": Check answers.");
	}
}