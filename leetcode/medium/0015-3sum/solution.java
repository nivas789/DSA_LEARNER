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