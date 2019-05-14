package com.simon.algorithms.twosum_1;

import java.util.HashMap;
import java.util.Map;

class OnePassHashTable {
    public static void main(String[] args) {
        OnePassHashTable s = new OnePassHashTable();
        s.twoSum(new int []{2,7,11,15}, 9);
    }
    public int[] twoSum(int[] nums, int target) {
        if (2>nums.length)
            return null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}