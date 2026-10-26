# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 7.01%)  
**Memory:** 48.8 MB (beats 61.04%)  
**Submitted:** 2026-10-26T06:50:44.262Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] merg=new int[n + m];
        int k=0;
        for(int i=0;i<n;i++){
            merg[k++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merg[k++]=nums2[i];
        }
        Arrays.sort(merg);
        int total=merg.length;
        if(total%2==1){
            return (double) merg[total/2];
        } else {
            int middle1=merg[total/2-1];
            int middle2=merg[total/2];
            return ((double)middle1+(double) middle2)/2.0;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)