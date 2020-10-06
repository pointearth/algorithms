package com.simon.algorithms.N015M3Sum;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A3Sum {

    public static void main(String[] args) {
        A3Sum sum = new A3Sum();
//        int[] array = new int[]{-1, 0, 1, 2, -1, -4};    //   {-4,-1,-1, 0,      1, 2};
//        int[] array = new int[]{0,0,0};
//        int[] array = new int[]{0,0,0,0,0};
        int[] array = new int[]{-2,0,0,2,2};

//        int b = sum.sortAndSplit(array);
//        for (int i = 0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("    "+b);
        List<List<Integer>> myList = sum.threeSum(array);


    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> reList = new LinkedList<>();

        int splitIndex = sortAndSplit(nums);

        for (int i = 0;i<=splitIndex;i++){
            if (i >0 && nums[i-1]==nums[i]){
                continue;}
            int target = - nums[i];
            int bIndex = i+1,eIndex = nums.length-1;

            while (bIndex< eIndex){
                if (nums[bIndex]+nums[eIndex] == target){
                    List<Integer> oneList = new LinkedList<>();
                    oneList.add(nums[i]);
                    oneList.add(nums[bIndex]);
                    oneList.add(nums[eIndex]);
                    reList.add(oneList);
                    bIndex++;
                    eIndex--;

                    printList(oneList);
                    System.out.println();

                    continue;
                } else if (nums[bIndex]+nums[eIndex] > target){
                    eIndex--;
                } else{
                    bIndex++;
                }
            }
        }
        return reList;
    }
    private int sortAndSplit(int[] nums){

        int splitIndex = -1;
        boolean alreadyNaive = false;

        int n = nums.length;
        for(int i = 0;i<=n-1;i++){
            for (int j = 0;j<=n-1-i-1;j++){
              if (nums[j]>nums[j+1]){
                  int temp = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = temp;
              }
            }

            if (nums[n-1-i] == 0){
                splitIndex = n-1-i;
                System.out.println(splitIndex);
            }
            if (!alreadyNaive && nums[n-1-i] < 0){
                splitIndex = n-1-i;
                System.out.println(splitIndex);
                alreadyNaive = true;
            }
        }
     return splitIndex;
    }
    private void printList(List<Integer> l){
        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+",");
        }
    }
}
