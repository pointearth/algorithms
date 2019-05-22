package com.simon.algorithms;

//https://leetcode.com/problems/implement-strstr/
//https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
//https://www.zhihu.com/question/21923021

public class N028EstrStr {
    public static void main(String[] args){
        N028EstrStr ss = new N028EstrStr();
//        int[] lps = ss.getLps("abababac");
//        Arrays.stream(lps).forEach(System.out::println);

//        System.out.println(ss.N028EstrStr("hello","ll"));
        System.out.println(ss.strStr("mississippi","issipp"));

    }

    public int strStr(String haystack, String needle) {

        int txtLen = haystack.length();
        int patLen = needle.length();
        if (txtLen< patLen) return -1;
        if (needle.isEmpty()) return 0;

        int[] lps = getLps(needle);
//        Arrays.stream(lps).forEach(System.out::println);

        int i = 0, j = 0;
        while (i< txtLen ){
            if (haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            if (j == patLen){
                return i - j;
            } else if (j != 0){
                if (i < txtLen && haystack.charAt(i) != needle.charAt(j)){//easty to wrong, don't write "j < patLen"
                    j = lps[j-1];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    private int[] getLps(String pat){
        int len = pat.length();
        int[] lps = new int[len];

        int i = 1, j = 0;
        while (i < len){
            if (pat.charAt(i) == pat.charAt(j)){
                j++;
                lps[i] = j;
                i++;
            } else {
                if (j != 0){
                    j = lps[j-1];
                } else {//normally
                    i++;
                }
            }
        }
        return lps;
    }

//    public int strStrMutiple(String haystack, String needle) {
//
//        int txtLen = haystack.length();
//        int patLen = needle.length();
//        if ( txtLen < patLen) return -1;
//        if (needle.isEmpty()) return 0;
//
//        int i = 0, j = 0;
//        while (i < txtLen){
//            if (haystack.charAt(i) == needle.charAt(j)){
//                i++;
//                j++;
//            }
//            if (j == patLen){
//                j = lps[j-1];
//                System.out.println( i -j);
//            }
//
//            if (i < txtLen && haystack.charAt(i) != needle.charAt(j)){//easty to wrong, don't write "j < patLen"
//
//                if (j != 0){
//                    j = lps[j-1];
//                } else{
//                    i++;
//                }
//            }
//        }
//        return -1;
//    }
//
//    private int[] getLps(String path){
//        int len = path.length();
//        int i = 1,j = 0;
//        int[] lps = new int[len];
//
//        while (i <len){
//
//            if (path.charAt(i) == path.charAt(j)){
//                j++;
//                lps[i] = j;
//                i++;
//            } else {
//                if (j != 0){
//                    j = lps[j-1];
//                }else{
//                    lps[i] = 0;
//                    i++;
//                }
//            }
//        }
//        return lps;
//    }
}