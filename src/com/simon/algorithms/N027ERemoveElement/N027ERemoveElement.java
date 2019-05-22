package com.simon.algorithms.N027ERemoveElement;

public class N027ERemoveElement {
    public static void main(String[] args) {
        N027ERemoveElement re = new N027ERemoveElement();
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int len = re.removeElement(nums,0);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

    public int removeElement(int[] nums, int val){

        if (nums.length == 0) return 0;

        int len = 0;

        int curPoint = 0;
        for (int i = 0;i<nums.length;i++){
            if (nums[i] != val) {
                nums[curPoint++] = nums[i];
                len++;
            }
        }
        return len;
    }

}
