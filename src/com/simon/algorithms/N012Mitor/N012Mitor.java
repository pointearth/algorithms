package com.simon.algorithms.N012Mitor;

//https://leetcode.com/problems/integer-to-roman/

public class N012Mitor {
    public static void main(String[] args) {

        N012Mitor itor = new N012Mitor();
        System.out.println(itor.intToRoman(1994));
    }

    public String intToRoman(int num) {

        String result = "";
        int[] keys = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] values = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for (int i = 0;i<=keys.length-1;i++){

            if ( num > keys[i]) {
                int quotient = num / keys[i] ;
                num = num - quotient* keys[i];

                for (int j = 0;j<= quotient-1;j++) {
                    result += values[i];
                }
            }

        }
        return result;


















//        int[] keys =    new int[]   {1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] values = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        String result = "";
//
//       for (int i = 0;i< keys.length;i++) {
//           if (num >= keys[i]){
//               int quotient =  num/keys[i];
//               num = num - quotient * keys[i];
//               for (int j = 0;j<= quotient-1;j++){
//                   result += values[i];
//               }
//           }
//
//       }
//        return result;
    }


}
