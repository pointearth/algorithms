package com.simon.algorithms.N003ELongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

//find the index dumplicate, skip i to the index directly.
public class SlidingWindowOptimized03 {
    public static void main(String[] args) {
        SlidingWindowOptimized03 sw = new SlidingWindowOptimized03();
//        System.out.println(sw.lengthOfLongestSubstring("abcabcdabcbb"));
        System.out.println(sw.lengthOfLongestSubstring("tmmzuxt"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int count=0,i =0,j=0;
//        System.out.println("i:"+i);
        while ( j < n){
            if (map.containsKey(s.charAt(j))){
                int dotJ = map.get(s.charAt(j));
                System.out.println("         "+s.charAt(j)+ " -> "+dotJ);
                i = Math.max(dotJ,i);
            }
            count = Math.max(count,j-i+1);
            map.put(s.charAt(j),j+1);//skip to j+1, because j is dumplicate.
            System.out.println(s.charAt(j)+ " <- "+(j+1));
            j++;
//            System.out.println("    j:"+j);
        }
        return count;
    }


//    public int lengthOfLongestSubstring(String s) {
//        Map<Character,Integer> map = new HashMap<>();
//        int n = s.length();
//        int count =0,i=0,j=0;
//        while (j< n){
//            if (map.containsKey(s.charAt(j))){
//                int dotJ = map.get(s.charAt(j));
//                System.out.println("         "+s.charAt(j)+ " -> "+dotJ);
//                i = Math.max(i,dotJ);
//            }
//            map.put(s.charAt(j),j+1);
//            System.out.println(s.charAt(j)+ " <- "+(j+1));
//            count = Math.max(count,j-i+1);
//            j++;
//
//        }
//        return count;
//    }




//
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>(); // current index of character
//        // try to extend the range [i, j]
////        for (int j = 0, i = 0; j < n; j++) {
//        int j = 0, i = 0;
//        while(j < n) {
//            if (map.containsKey(s.charAt(j))) {
//                int dotJ = map.get(s.charAt(j));
//                i = Math.max(dotJ, i);//some dotJ is before i.
//            }
//            ans = Math.max(ans, j - i + 1);
//            map.put(s.charAt(j), j + 1);// skip old char
//            j++;
//        }
//        return ans;
//    }

}
