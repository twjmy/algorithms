---
lang: zh-tw
tags: java # 在此輸入標籤(以","分隔)
title: 1092-algorithms-nchu # 在此輸入標題
description: NCHU CSE 1092 Term Algorithm Homework # 在此輸入描述
image: null # 在此輸入預覽圖片網址
---

[TOC]  
[HW01 - ArrayData](#HW01---ArrayData)  

# 1092 演算法 ![](https://img.shields.io/badge/dynamic/json?color=aqua&query=%24.viewcount&label=%E8%A7%80%E7%9C%8B%E6%AC%A1%E6%95%B8&suffix=%E6%AC%A1&url=https%3A%2F%2Fhackmd.io%2F%40VJ%2F1092-algorithms-nchu%2Finfo) [![hackmd-github-sync-badge](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w/badge)](https://hackmd.io/fRHOXqCNSx6Wd3yEKjQf2w)  

# HW01 - ArrayData  

## [Abstract class](https://github.com/twjmy/algorithms-nchu/blob/3ccad0141bc3975f69101f366f14bac8fe7c7d57/1092/ArrayData.java#L1-L5  )  

```java=!
public abstract class ArrayData {
	public int [] A;
	public abstract int max();
	public abstract int min();
}
```