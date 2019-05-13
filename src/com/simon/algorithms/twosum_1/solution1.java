package com.simon.algorithms.twosum_1;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        if (2>nums.length)
            return null;
        int[] indices = new int[2];
        for(int bindex=0;bindex<=nums.length-2;bindex++){
            for(int eindex = bindex+1;eindex<=nums.length-1;eindex++){
                if(target == nums[bindex]+nums[eindex]){
                    indices[0]=bindex;
                    indices[1]=eindex;
                    return indices;
                }
            }
        }
        return null;
    }
}