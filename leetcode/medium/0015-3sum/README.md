# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

 

 **Example 1:** 

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

```

 **Example 2:** 

```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

```

 **Example 3:** 

```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

```

 

 **Constraints:** 

- 3 <= nums.length <= 3000
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 35 ms (beats 43.56%)  
**Memory:** 58.7 MB (beats 86.26%)  
**Submitted:** 2026-11-02T04:40:42.527Z  

```java
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1,h=n-1;
            while(l<h){
                int s=nums[i]+nums[l]+nums[h];
                if(s==0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    while(l<h&&nums[l]==nums[l+1]) l++;
                    while(l<h&&nums[h]==nums[h-1]) h--;
                    l++; h--;
                }else if(s<0) l++;
                else h--;
            }
        }
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/3sum/)