---
lang: zh-tw
tags: java, algorithm # 在此輸入標籤(以","分隔)
description: NCHU CSE 1092 Term Algorithm Homework # 在此輸入描述
image: null # 在此輸入預覽圖片網址
---

# 1092 演算法 [![hackmd-github-sync-badge](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w/badge)](https://hackmd.io/@VJ/1092-algorithms-nchu/edit?both) [![](https://img.shields.io/badge/dynamic/json?color=aqua&query=%24.viewcount&label=%E9%BB%9E%E6%93%8A%E6%AC%A1%E6%95%B8&suffix=%E6%AC%A1&url=https%3A%2F%2Fhackmd.io%2F%40VJ%2F1092-algorithms-nchu%2Finfo)](https://hackmd.io/@VJ/1092-algorithms-nchu/edit?both)

::: spoiler 目錄
[TOC]
:::

+ [HW01 - ArrayData](#HW01---ArrayData)
+ [HW02 - ThreeSum](#HW02---ThreeSum)
+ [HW03 - HillFinding](#HW03---HillFinding)
+ [HW04 - One 0K Rock](#HW04---One-0K-Rock)
+ [HW05 - LLK](#HW05---LLK)
+ [HW06 - Dessert Desert](#HW06---Dessert-Desert)
+ [HW07 - Buy Phone](#HW07---Buy-Phone)
+ [HW08 - Buy Phone v2](#HW08---Buy-Phone-v2)
+ [HW09 - LSD](#HW09---LSD)

---

<!--
## HW - 

### Assignment

### Abstract class

### Solution

施工中...:gear:

---

-->

## HW09 - LSD

### Assignment

Your program will take a two-dimensional integer array as input.

Each element in the array represents nodes lined together

Please return the longest shortest-path in the given graph.

Given a graph G = (V, E), find max<sub>u,v</sub> d(u, v), where d(u,v) denotes the shortest path length between node u and node v, for all possible u, v

(In this home work, You may use `java.util.collections`、 `java.util.ArrayList` 、 `java.util.Stack`, but  `java.util.*`  is not allowed.)

| Example | Method Calling / Return                    |
| ------- | ------------------------------------------ |
| Input   | `Distance(new int[][]{{0,1},{0,2},{0,4},{1,3},{1,4},{2,5},{6,7}})` |
| Output  | `Distance(int[][]) = (int) 4` |

### Abstract class

```java!=
public abstract class LSD{
    public abstract int Distance(int[][] array);
}
```

### Solution

施工中...:gear:

---

## HW08 - Buy Phone v2

### Assignment

Your program will take a six-dimensional integer array as input. 

Each element represents a smartphone model which contains two features (e.g., screen size and performance ranking).

Please return an sorted array containing a list of unbeatable smartphone models (In other words, filter out the phone models that can be beaten by some model).

The return array should be sorted by the first element of each array in the output.
{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}}
{{7,5,6,9,8,9},{8,7,7,4,2,1}}

| Example | Method Calling / Return                    |
| ------- | ------------------------------------------ |
| Input   | `bestPhone(new int[][]{{8,7,7,4,2,1},{2,4,4,6,2,1},{4,0,5,1,3,2},{5,2,4,3,7,3},{7,5,6,9,8,9}})` |
| Output  | `bestPhone(int[][]) = (int[][]) {{7,5,6,9,8,9},{8,7,7,4,2,1}}` |

### Abstract class

```java!=
public abstract class Buy_Phone_v2{
    public abstract int[][] bestPhone(int[][] inputArr);
}
```

### Solution

施工中...:gear:

---

## HW07 - Buy Phone

### Assignment

Your program will take a two-dimensional integer array as input. 

Each element represents a smartphone model which contains two features (e.g., screen size and performance ranking).

Please return an array containing a list of unbeatable smartphone models (In other words, filter out the phone models that can be beat by some model).

Given two items A =(X<sub>a</sub>, Y<sub>a</sub>) and B =(X<sub>b</sub>, Y<sub>b</sub>), Item A beats Item B iff x<sub>a</sub>≥x<sub>b</sub> and y<sub>a</sub>≥y<sub>b</sub>

| Example | Method Calling / Return                    |
| ------- | ------------------------------------------ |
| Input   | `bestPhone(new int[][]{{1,1},{2,4},{2,10},{5,4},{4,8},{5,5},{8,4},{10,2},{10,1}})` |
| Output  | `bestPhone(int[][]) = (int[][]) {{2,10},{4,8},{5,5},{8,4},{10,2}}` |

### Abstract class

```java!=
public abstract class Buy_Phone{
    public abstract int[][] bestPhone(int[][] inputArr);
}
```

### Solution

施工中...:gear:

---

## HW06 - Dessert Desert

### Assignment

Your program will take an integer arrays as input.

Please return the maximum possible number of blocks in a valid partitioning.

A valid partitioning of the integer array is defined as follows. 

+ The numbers are split into blocks — groups of consecutive numbers. The block<sub>i,j</sub> consists of number n<sub>i</sub>, n<sub>i+1</sub>, ..., n<sub>j</sub>. A block can have only a single number.
+ Every number belongs to one block only.
+ The partitioning should satisfy the condition that after each block is sorted, the whole sequence becomes sorted as well.

| Example | Method Calling / Return                    |
| ------- | ------------------------------------------ |
| Input   | `maxBlocks(new int[][]{{1,1,1,1,1,1,1},{1,3,5,7,9},{1,2,3},{5,4,3,2,1},{2,1,3,2}})` |
| Output  | `maxBlocks(int[][]) = (int[]) {7,5,3,1,2}` |

### Abstract class

```java!=
public abstract class Dessert_Desert{
    public abstract int[] maxBlocks(int[][] inputArr);
}
```

### Solution

施工中...:gear:

---

## HW05 - LLK

### Assignment

Your program will take a set that consists of two-dimensional points as input. Please determine whether the given set containing three points lie in a line.

Here is our sample testdata: `[[1,1],[2,2],[3,6]]`

| Example | Method Calling / Return                    |
| ------- | ------------------------------------------ |
| Input   | `checkLLK(new int[][]{{1,1},{2,2},{3,6}})` |
| Output  | `checkLLK(int[][]) = (boolean) false`      |

### Abstract class

```java!=
public abstract class LLK{
    public abstract boolean checkLLK(int[][] array);
}
```

### Solution

施工中...:gear:

---

## HW04 - One 0K Rock

### Assignment
Your program will take a bunch of string arrays as input.
Please determine whether a given array comes from { 0<sup>k</sup>1<sup>k</sup> \| k ∈ Z<sup>+</sup> }
( the input arrays do not contain empty string and non 0,1 characters)

For example,

1. Input: `["0011","00111"]` , Output: `[true,false]`
2. Input: `["01","1100","1111"]` , Output: `[true,false,false]`

| Example  | Method Calling / Return                            |
| -------- | -------------------------------------------------- |
| Input 1  | `one0k(new String[]{"0011","00111"})`              |
| Output 1 | `one0k(String[]) = (boolean[]) {true,false}`       |
| Input 2  | `one0k(new String[]{"01","1100","1111"})`          |
| Output 2 | `one0k(String[]) = (boolean[]) {true,false,false}` |

### Abstract class

```java!=
public abstract class One_0k_rock {
    public abstract boolean[] one0k(String[] str);
}
```

### Solution

施工中...:gear:

---

## HW03 - HillFinding

### Assignment

**Input**: An array. In this mission we find the peak of the array, then find out which cutting position of the array which could produce a sorted array.

**Final return**: Cutting position of the array 

<details>
 <summary>Please refer to the attached .jpg file to see the example</summary>
 <img src="https://lms.nchu.edu.tw/sysdata/attach/exercise.30426/2390c9e66e43ce6dabe3b00596cc3e52.jpg" alt="Example 1">
 <img src="https://lms.nchu.edu.tw/sysdata/attach/exercise.30426/8798c80c1fad0655d38c5e51c9c20ae8.jpg" alt="Example 2">
</details>

TestCase(input) will not include arrays like:

1. All same: `8,8,8,8,8,8`
2. Whole ascending: `1,2,3,4,5,6,7`

| Example  | Method Calling / Return               |
| -------- | ------------------------------------- |
| Input 1  | `H_Finding(new int[]{5,6,7,1,2,3,4})` |
| Output 1 | `H_Finding(int[]) = (int) 3`          |
| Input 2  | `H_Finding(new int[]{5,7,8,8,1,3,4})` |
| Output 2 | `H_Finding(int[]) = (int) 2`          |

### Abstract class

```java=!
public abstract class HillFinding {
    public abstract int H_Finding(int[] A);
}
```

### Solution

#### Brute-force

因為題目說不會有 `1,2,3,4,5,6,7` 的情況，可以這樣實作

```java=!
public class HW03_1 extends HillFinding {
    public int H_Finding(int[] A){
        int i = 0;
        for(i=0; A[i]<=A[++i];);
        return A.length-1-i;
    }
}
```

暴力解，時間複雜度是 `O(N)`。

#### Binary search

同樣，參考老師的[投影片](https://www.dropbox.com/s/cxrvhuj9mnk2uio/%E6%BC%94%E7%AE%97%E6%B3%95%E8%AC%9B%E7%BE%A92020.pdf) Lecture 2 第 40 頁裡的程式碼，修改一下

```java=!
public class HW03_4108056020_1 extends HillFinding {
    public int H_Finding(final int[] A) {
        final int END = A.length-1;
        int lo = 0, hi=END;
        for(mid=hi>>>1; lo <= hi; mid = lo+hi>>>1){
            if(mid < END && A[mid+1] < A[mid])
                return END-i-1;
            else if(mid > lo && A[mid-1] > A[mid])
                return END-i;
            else if(A[hi]>A[mid]) hi = mid-1;
            else lo = mid+1;
        }
        int i;
        for(i=0; A[i]<=A[++i];); // 最後手段
        return END-i;
    }
}
```

在 `for()` 迴圈裡找不到答案會是例外狀況，所以我加了最後手段，這樣時間複雜度是 `O(lgN)`。

---

## HW02 - ThreeSum

### Assignment

計算陣列中任意三個數字相加為零的組合數 (數組中不會有重複的數字)

| Example | Method Calling / Return           |
| ------- | --------------------------------- |
| Input   | `T_sum(new int[]{-1,1,2,4,8,-3})` |
| Output  | `T_sum(int[]) = (int) 2`          |

分別是 (1,2,-3) 以及 (-1,4,-3) 2組

### Abstract class

```java=!
public abstract class ThreeSum {
    public abstract int T_sum(int[] A);
}
```

### Solution

#### Brute-force

```java=!
public class HW02_1 extends ThreeSum{
    public int T_sum(int[] A){
        int count = 0;
        for(int i = 0; i < N; i++)
            for(int j = i+1; j < N; j++)
                for(int k = j+1; k < N; k++)
                    if(a[i]+a[j]+a[k] == 0)
                        count++;
        return count;
    }
}
```

暴力解，時間複雜度是 `O(N³)`。

#### Binary search

參考老師的[投影片](https://www.dropbox.com/s/cxrvhuj9mnk2uio/%E6%BC%94%E7%AE%97%E6%B3%95%E8%AC%9B%E7%BE%A92020.pdf) Lecture 2 第 40,42 頁裡的程式碼，整合、修改一下

```java=!
import java.util.Arrays;
public class HW02_1 extends ThreeSum{
    public int T_sum(int[] a){
        Arrays.sort(a);
        int N = a.length-2;
        int cnt = 0;
        for(int i = 0; i < N; i++){
            int key = -a[i];
            int lo = i+1, hi = a.length-1;
            while(lo < hi){ 
                int sum = a[lo] + a[hi];
                if(key < sum) hi--;
                else if (key > sum) lo++;
                else{ hi--; lo++; cnt++; }
            }
        }
        return cnt;
    }
}
```

這樣時間複雜度是 `O(N²)`。另外由於老師不讓我們 `import` ，所以我們要自己實作 `sort(int[])`。

---

## HW01 - ArrayData

### Assignment

會給一個Array，分別求Array的最大值和最小值

| Example | Method Calling / Return            |
| ------- | ---------------------------------- |
| Input   | `ArrayData(new int{1,2,3})`        |
| Output  | `min() = (int) 3, max() = (int) 1` |

### Abstract class

```java=!
public abstract class ArrayData {
    public int [] A;
    public abstract int max();
    public abstract int min();
}
```

### Solution

由於助教沒有給定傳入陣列的方式，一開始假設助教使用 `HW01.A=測資`，所以直接實作
`max()`、`min()`

```java=!
public class HW01_1 extends ArrayData{
    public int max(){
        int max = A[0];
        for(int i = 1; i < A.length; i++)
            if(A[i]>max) max=A[i];
    }
    public int min(){
        int min = A[0];
        for(int i = 1; i < A.length; i++)
            if(A[i]<min)min=A[i];
    }
}
```

結果當然是報錯的，因為助教是用建構元 `ArrayData(int[])` 來建構我們的 `class` 成物件再用這個物件呼叫 `max()`、`min()`，所以應該這樣實作

```java=!
public class HW01_2 extends ArrayData{
    public HW01_2(final int[] A) {
        this.A = A;
    }
    public int max(){
        int max = A[0];
        for(int i = 1; i < A.length; i++)
            if(A[i]>max) max=A[i];
    }
    public int min(){
        int min = A[0];
        for(int i = 1; i < A.length; i++)
            if(A[i]<min)min=A[i];
    }
}
```

這樣實作的時間複雜度會是 `O(N)`。但既然助教在建構元就傳入陣列了，我們可以在建構的時候就找出最大、最小值再呼叫

```java=!
public class HW01_3 extends ArrayData{
    public int max, min;
    public HW01_3(final int[] A){
        max = min = A[0];
        for(int i = 1; i < A.length; i++)
            if(A[i]>max) max = A[i];
            if(A[i]<min) min = A[i];
        }
    }
    public int max(){ return max; }
    public int min(){ return min; }
}
```

理論上助教如果計時是在呼叫 `max()`、`min()` 前後才開始計時，這個版本相當於直接回傳答案，所以時間複雜度會是 `O(1)`。