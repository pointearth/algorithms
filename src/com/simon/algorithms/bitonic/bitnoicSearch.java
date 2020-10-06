package com.simon.algorithms.bitonic;

public class bitnoicSearch {
    public static void main(String[] args) {

        int [] sourceArray = new int[]{-1, 2, 7, 8, 6, 3, -6};
        int topIndex = findTopIndex(sourceArray);
        searchkey(sourceArray,-6);
        //int[] arr = new int[]{-1, 2, 6,90,100,80,60,35,25,0,-1};
        //int [] o1 = new int[]{-1, 2, 6,90,100, 110,200,300,400};
       // int keyIndex = searchIncreaseArray(o1,0,o1.length-1,90);

//        int [] o2 = new int[]{-1, -2, -6,-90,-100, -110,-200,-300,-400};
//         int keyIndex = searchDecreaseArray(o2,0,o2.length-1,-90);
//        System.out.println(keyIndex);

//        int topIndex = findTopIndex(arr);
//        if (-1 == topIndex) {
//            System.out.println(topIndex);
//        }
//        else {
//            System.out.println(topIndex + " " + arr[topIndex]);
//        }



    }
    public static int searchkey(int[] sourceArry, int key ){
        int topIndex = findTopIndex(sourceArry);
        int leftIndex = searchIncreaseArray(sourceArry,0,topIndex,key);
        if (-1 == leftIndex){
            int rightIndex = searchDecreaseArray(sourceArry,topIndex+1,sourceArry.length-1,key);
            return rightIndex;
        } else {
            return leftIndex;
        }
    }
    public static int findTopIndex(int[] sourceArry){

        int low = 0;
        int high = sourceArry.length-1;

        while (low<=high){
            int mid = (low + high)/2;
            //System.out.println("low = " + low + " high = "+ high + " mid = " + mid );
            if ( (sourceArry[mid-1]< sourceArry[mid]) && (sourceArry[mid] > sourceArry[mid+1])){
                return mid;
            } else if ( (sourceArry[mid-1]< sourceArry[mid]) && (sourceArry[mid] < sourceArry[mid+1])) {
                low = mid +1;
                //System.out.println("low = "+ low);
            } else if ( (sourceArry[mid-1] > sourceArry[mid]) && (sourceArry[mid] > sourceArry[mid+1])) {
                high = mid -1;
            } else {
                return -1;
            }
        }
        return -1;
    }
    public static int searchIncreaseArray(int[] sourceArry, int lowIndex,int highIndex,int key){

        while (lowIndex<=highIndex){
            int mid = (lowIndex+highIndex)/2;
            if (sourceArry[mid] == key){
                return mid;
            } else if (key < sourceArry[mid]){
                highIndex = mid -1;
//                System.out.println("high = "+ highIndex);
                return searchIncreaseArray(sourceArry,lowIndex,highIndex,key);
            } else {
                lowIndex = mid + 1;
//                System.out.println("low = "+ lowIndex);
                return searchIncreaseArray(sourceArry,lowIndex,highIndex,key);
            }
        }
        return -1;
    }
    public static int searchDecreaseArray(int[] sourceArry, int lowIndex,int highIndex,int key){

        while (lowIndex<=highIndex){
            int mid = (lowIndex+highIndex)/2;
            if (sourceArry[mid] == key){
                return mid;
            } else if (key < sourceArry[mid]){
                lowIndex = mid + 1;
//                System.out.println("low = "+ lowIndex);
                return searchDecreaseArray(sourceArry,lowIndex,highIndex,key);
            } else {
                highIndex = mid -1;
//                System.out.println("high = "+ highIndex);
                return searchDecreaseArray(sourceArry,lowIndex,highIndex,key);
            }
        }
        return -1;
    }
}
