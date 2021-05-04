---
lang: zh-tw
tags: java # 在此輸入標籤(以","分隔)
title: 1092-algorithms-nchu # 在此輸入標題
description: NCHU CSE 1092 Term Algorithm Homework # 在此輸入描述
image: null # 在此輸入預覽圖片網址
---

# 1092 演算法 ![](https://img.shields.io/badge/dynamic/json?color=aqua&query=%24.viewcount&label=%E8%A7%80%E7%9C%8B%E6%AC%A1%E6%95%B8&suffix=%E6%AC%A1&url=https%3A%2F%2Fhackmd.io%2F%40VJ%2F1092-algorithms-nchu%2Finfo) [![hackmd-github-sync-badge](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w/badge)](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w)

:::spoiler 目錄
[TOC]
:::

+ [HW01 - ArrayData](#HW01---ArrayData)
+ [HW02 - ThreeSum](#HW02---ThreeSum)

## HW02 - ThreeSum

### Assigment

計算陣列中任意三個數字相加為零的組合數 (數組中不會有重複的數字)

| Example | Method Calling                  |
| ------- | ------------------------------- |
| Input   | `T_sum(new int{-1,1,2,4,8,-3})` |
| Output  | `T_sum(int[])` = 2              |

(分別是(1,2,-3)以及(-1,4,-3)2組)

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

這樣時間複雜度是 `O(N²)`，另外由於老師不讓我們 `import` ，所以我們要自己實作 `sort(int[])`。

---

## HW01 - ArrayData

### Assigment

會給一個Array，分別求Array的最大值和最小值

| Example | Method Calling              |
| ------- | --------------------------- |
| Input   | `ArrayData(new int{1,2,3})` |
| Output  | `min()` = 3, `max()` = 1    |

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