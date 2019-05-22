package com.simon.algorithms.N008Matoi;

//https://leetcode.com/problems/string-to-integer-atoi/

public class N008Matoi {
    public static void main(String[] args) {
        N008Matoi a2i = new N008Matoi();
//        int res = a2i.myAtoi("-91283472332");
//        int res = a2i.myAtoi("2147483648");
        int res = a2i.myAtoi("-54 df ");

        System.out.println(res);
    }

    public int myAtoi(String str) {
//
//
        str = str.trim();
        if (str.isEmpty()) return 0;

        int result = 0;
        int i = 0;
        int flag = 1;
        if (str.charAt(0)== '-'){
            i++;
            flag = -1;
        }else if (str.charAt(0)== '+'){
            i++;
        }

        while (i< str.length()){
            if (str.charAt(i)>= '0' && str.charAt(i) <='9'){
                int cur = str.charAt(i) - '0';
                if (result > Integer.MAX_VALUE/10 ||(result == Integer.MAX_VALUE/10) && cur > 7 ){
                    return (flag == 1)? Integer.MAX_VALUE:Integer.MIN_VALUE;
                }else{
                    result = result*10 + cur;
                }
            } else {break;}

            i++;
        }

        return flag* result;




















//        str = str.trim();
//        if (str.isEmpty()) return 0;
//
//        int result = 0;
//        int bIndex = 0;
//        int flag = 1;
//        if (str.charAt(0) == '-') {
//            bIndex++;
//            flag = -1;
//        } else if (str.charAt(0) == '+'){
//            bIndex++;
//        }
//
//        while (bIndex< str.length()){
//            if ( str.charAt(bIndex) < '0' || str.charAt(bIndex) > '9' )
//                break;
//
//            int curNum = str.charAt(bIndex) - '0';
//            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && curNum > 7)){
//                return (flag == 1) ? Integer.MAX_VALUE:Integer.MIN_VALUE;
//            }else {
//                result = result * 10 + curNum;
//            }
//            bIndex++;
//        }
//
//        return result*flag;
//
    }
}
