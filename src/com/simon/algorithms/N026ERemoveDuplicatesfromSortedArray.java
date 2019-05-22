package com.simon.algorithms;

class N026ERemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        N026ERemoveDuplicatesfromSortedArray rdfs = new N026ERemoveDuplicatesfromSortedArray();
        System.out.println(rdfs.removeDuplicates(new int []{1,1,2}));
    }
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0 ) return 0;
        int count = 0;
        for(int i = 1;i< nums.length;i++){
            if (nums[i-count-1] == nums[i]){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        return nums.length - count;
    }
}