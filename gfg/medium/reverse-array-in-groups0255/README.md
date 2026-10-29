# reverse-array-in-groups0255

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T04:18:39.965Z  

```java
class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        for(int i=0;i<arr.length;i+=k){
            int st=i;
            int end=Math.min(arr.length-1,i+k-1);
            while(st<=end){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1)