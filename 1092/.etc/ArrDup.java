public class ArrDup{
    public static void main(final String[] args){
        final ArrDup object = new ArrDup();
        int[][] test_data;
        test_data = new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
        System.out.println("\ntest_data before run: "+java.util.Arrays.deepToString(test_data));
        System.out.println("Result: "+java.util.Arrays.deepToString(object.method1__copy_array(test_data)));
        System.out.println("test_data after run: "+java.util.Arrays.deepToString(test_data));

        test_data = new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
        System.out.println("\ntest_data before run: "+java.util.Arrays.deepToString(test_data));
        System.out.println("method2: change_array_pointerResult: "+java.util.Arrays.deepToString(object.method2__change_array_pointer(test_data)));
        System.out.println("test_data after run: "+java.util.Arrays.deepToString(test_data));
        
        test_data = new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
        System.out.println("\ntest_data before run: "+java.util.Arrays.deepToString(test_data));
        System.out.println("method3.1: change all (correct), Result: "+java.util.Arrays.deepToString(object.method3_1__change_all_correct(test_data)));
        System.out.println("test_data after run: "+java.util.Arrays.deepToString(test_data));
        
        test_data = new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}};
        System.out.println("\ntest_data before run: "+java.util.Arrays.deepToString(test_data));
        System.out.println("method3.2: change all (incorrect), Result: "+java.util.Arrays.deepToString(object.method3_2__change_all_incorrect(test_data)));
        System.out.println("test_data after run: "+java.util.Arrays.deepToString(test_data));
    }

    int[][] method1__copy_array(final int[][] A){
        final int R = 100, N = A.length, END = N-1, AUX[][] = new int[N][], CNT[] = new int[R+1];
        int i, j, k, len = N; boolean beat;
        for (i = 0; i < N;) CNT[A[i++][0]+1]++;             // LSD
        for (i = 0; i < R;) CNT[i+1] += CNT[i++];           // radix
        for (i = 0; i < N;) AUX[CNT[A[i][0]]++] = A[i++];   // sort in AUX
        for (i = 0; i < END; ++i){
            for (j = END; j > i; --j){  // O(n^2)
                if (AUX[j] == null) continue;
                else if (AUX[i] == null){ --len; break; }
                else{
                    for(beat=true,k=0;beat&&k<6;beat&=AUX[i][k]<=AUX[j][k++]);
                    if(beat){ AUX[i] = null; --len; break; }    // once the phone i beaten by phone j, then discard it
                }
            }
        }
        if(len==AUX.length) return AUX;
        final int[][] ANS = new int[len][];
        for (i = j = 0; i < N; ++i) if (AUX[i] != null) ANS[j++] = AUX[i];
        return ANS;
    }

    int[][] method2__change_array_pointer(final int[][] A){
        final int R = 100, N = A.length, END = N-1, AUX[][] = new int[N][], CNT[] = new int[R+1];
        int i, j, k, len = N; boolean beat;
        for (i = 0; i < N;) CNT[A[i++][0]+1]++;             // LSD
        for (i = 0; i < R;) CNT[i+1] += CNT[i++];           // radix
        for (i = 0; i < N;) AUX[CNT[A[i][0]]++] = A[i++];   // sort in AUX
        for (i = 0; i < N; i++) A[i] = AUX[i];        // replace array pointer (may equal to the pointer change before, but the position changed)
        for (i = 0; i < END; ++i){
            for (j = END; j > i; --j){  // O(n^2)
                if (AUX[j] == null) continue;
                else if (AUX[i] == null){ --len; break; }
                else{
                    for(beat=true,k=0;beat&&k<6;beat&=AUX[i][k]<=AUX[j][k++]);
                    if(beat){ AUX[i] = null; --len; break; }    // once the phone i beaten by phone j, then discard it
                }
            }
        }
        if(len==AUX.length) return AUX;
        final int[][] ANS = new int[len][];
        for (i = j = 0; i < N; ++i) if (AUX[i] != null) ANS[j++] = AUX[i];
        return ANS;
    }

    int[][] method3_1__change_all_correct(final int[][] A){
        final int R = 100, N = A.length, END = N-1, AUX[][] = new int[N][], CNT[] = new int[R+1];
        int i, j, k, len = N; boolean beat;
        for (i = 0; i < N;) CNT[A[i++][0]+1]++;             // LSD
        for (i = 0; i < R;) CNT[i+1] += CNT[i++];           // radix
        for (i = 0; i < N;) AUX[CNT[A[i][0]]++] = A[i++];   // sort in AUX
        for (i = 0; i < N; i++)                     // replace all array properties
            for(j = 0; j < 6; j++)
                A[i][j] = AUX[i][j];
        for (i = 0; i < END; ++i){
            for (j = END; j > i; --j){  // O(n^2)
                if (AUX[j] == null) continue;
                else if (AUX[i] == null){ --len; break; }
                else{
                    for(beat=true,k=0;beat&&k<6;beat&=AUX[i][k]<=AUX[j][k++]);
                    if(beat){ AUX[i] = null; --len; break; }    // once the phone i beaten by phone j, then discard it
                }
            }
        }
        if(len==AUX.length) return AUX;
        final int[][] ANS = new int[len][];
        for (i = j = 0; i < N; ++i) if (AUX[i] != null) ANS[j++] = AUX[i];
        return ANS;
    }

    int[][] method3_2__change_all_incorrect(final int[][] A){
        final int R = 100, N = A.length, END = N-1, AUX[][] = new int[N][], CNT[] = new int[R+1];
        int i, j, k, len = N; boolean beat;
        for (i = 0; i < N;) CNT[A[i++][0]+1]++;             // LSD
        for (i = 0; i < R;) CNT[i+1] += CNT[i++];           // radix
        for (i = 0; i < N;) AUX[CNT[A[i][0]]++] = A[i++];   // sort in AUX
        for (i = 0; i < N; i++)                     // replace all array properties
            for(j = 0; j < 6; j++)
                A[i][j] = AUX[i][5-j];  // simulate the situation that we change single property
        for (i = 0; i < END; ++i){
            for (j = END; j > i; --j){  // O(n^2)
                if (AUX[j] == null) continue;
                else if (AUX[i] == null){ --len; break; }
                else{
                    for(beat=true,k=0;beat&&k<6;beat&=AUX[i][k]<=AUX[j][k++]);
                    if(beat){ AUX[i] = null; --len; break; }    // once the phone i beaten by phone j, then discard it
                }
            }
        }
        if(len==AUX.length) return AUX;
        final int[][] ANS = new int[len][];
        for (i = j = 0; i < N; ++i) if (AUX[i] != null) ANS[j++] = AUX[i];
        return ANS;
    }
}