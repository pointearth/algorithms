package com.simon.algorithms.Q001EcomTwoSun;

class BruceForce {

    public static void main(String[] args) {
        BruceForce s = new BruceForce();

        int [] result = s.twoSum(new int[]{2,7,11,15},9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
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