package com.simon.algorithms.twosum_1;

import java.util.HashMap;

public class SolutionHash {
    public int[] twoSum(int[] nums, int target) {
        if (2>nums.length)
            return null;
        
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
        for(int i= 0;i<nums.length;i++){
            int complement =target - nums[i];
            if (hs.containsKey(complement) && hs.get(complement) != i){
                return new int[]{i,hs.get(complement)};
            }
        }
        return null;
    }
}