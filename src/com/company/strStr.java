package com.company;

import java.util.Arrays;

public class strStr {
    public static void main(String[] args){
        strStr ss = new strStr();
//        int[] lps = ss.getLps("abababac");
//        Arrays.stream(lps).forEach(System.out::println);

//        System.out.println(ss.strStr("hello","ll"));
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
                if (i < txtLen && haystack.charAt(i) != needle.charAt(j)){
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
                } else {
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