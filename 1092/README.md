---
lang: zh-tw
tags: java # 在此輸入標籤(以","分隔)
title: 1092-algorithms-nchu # 在此輸入標題
description: NCHU CSE 1092 Term Algorithm Homework # 在此輸入描述
image: null # 在此輸入預覽圖片網址
---

<!--[TOC]-->

[HW01 - ArrayData](#HW01---ArrayData)

# 1092 演算法 ![](https://img.shields.io/badge/dynamic/json?color=aqua&query=%24.viewcount&label=%E8%A7%80%E7%9C%8B%E6%AC%A1%E6%95%B8&suffix=%E6%AC%A1&url=https%3A%2F%2Fhackmd.io%2F%40VJ%2F1092-algorithms-nchu%2Finfo) [![hackmd-github-sync-badge](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w/badge)](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w)

## HW01 - ArrayData

### Assigment

會給一個Array，分別求Array的最大值和最小值
| I/O    | Function Calling            |
| ------ | --------------------------- |
| Input  | `ArrayData(new int{1,2,3})` |
| Output | `min()` = 3, `max()` = 1    |

### [Abstract class](https://github.com/twjmy/algorithms-nchu/blob/3ccad0141bc3975f69101f366f14bac8fe7c7d57/1092/ArrayData.java#L1-L5)

```java=!
public abstract class ArrayData {
    public int [] A;
    public abstract int max();
    public abstract int min();
}
```

### Solution

由於助教沒有給定傳入陣列的方式，一開始假設助教使用 `HW01.A=測資`，所以直接實作
`min()`、`max()`

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

結果當然是報錯的，因為助教是用建構元 `ArrayData(int[])` 來建構我們的 `class` 成物件再用這個物件呼叫 `min()`、`max()`，所以應該這樣實作

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

理論上助教如果計時是在呼叫 `min()`、`max()` 前後才開始計時，這個版本相當於直接回傳答案，所以時間複雜度會是 `O(1)`。

## HW02

### Abstract class

### Assigment

### Solution

## HW03

### Abstract class

### Assigment

### Solution

## HW04

### Abstract class

### Assigment

### Solution

## HW05

### Abstract class

### Assigment

### Solution

## HW06

### Abstract class

### Assigment

### Solution

## HW07

### Abstract class

### Assigment

### Solution

## HW08

### Abstract class

### Assigment

### Solution

## HW09

### Abstract class

### Assigment

### Solution
