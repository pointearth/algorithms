package com.simon.algorithms.twosum_1;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.twoSum("babad", target)
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