package com.simon.algorithms.N011MContainerWithMostWater;

public class N011MContainerWithMostWater{

    public static void main(String[] args) {
        N011MContainerWithMostWater a = new N011MContainerWithMostWater();
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(a.maxArea(height));
    }

    public int maxArea(int[] height) {

        int n = height.length;
        if (n < 2) return 0;
        int l = 0, r = n - 1;
        int maxArea = 0;
        while (l < r) {

            int curArea = (r - l) * Math.min(height[l], height[r]);
            if (maxArea < curArea) {
                maxArea = curArea;
            }
            if (height[l] < height[r]) {
                l++;
            } else r--;
        }
        return maxArea;
    }
}
