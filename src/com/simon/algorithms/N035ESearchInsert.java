package com.simon.algorithms;
public class N035ESearchInsert {
    
    public static void main(String[] args) {
        N035ESearchInsert si = new N035ESearchInsert();
        int[] nums = new int[]{1,3,5,7};
        System.out.println( si.searchInsert(nums,6));
    }
    public int searchInsert(int[] nums, int target) {
        
        int l =0;
        int r = nums.length-1;
        while( l  <= r ){
           int  mid = (l+r)/2;
            if (target < nums[mid]){
                r = mid -1;
            } else if ( nums[mid]< target){
                l = mid +1;
            } else {
                return mid;
            }
        }
        return  l;
    }


}