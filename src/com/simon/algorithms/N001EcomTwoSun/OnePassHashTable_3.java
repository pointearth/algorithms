package com.simon.algorithms.N001EcomTwoSun;

import java.util.HashMap;
import java.util.Map;

class OnePassHashTable_3 {
    public static void main(String[] args) {
        OnePassHashTable_3 s = new OnePassHashTable_3();
        int [] result = s.twoSum(new int[]{2,7,11,15},9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
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