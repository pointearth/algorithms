package com.simon.algorithms.N027ERemoveElement;

public class N027ERemoveElement_removerare {

    public static void main(String[] args) {
        N027ERemoveElement_removerare re = new N027ERemoveElement_removerare();
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int len = re.removeElement(nums, 2);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }
    public int removeElement(int[] nums, int val){

            int i = 0;
            int n = nums.length;
            while (i <n){
                if (nums[i] == val){
                    nums[i] = nums[n-1];
                    n--;
                }else{
                    i++;
                }
            }
            return n;
    }

}
