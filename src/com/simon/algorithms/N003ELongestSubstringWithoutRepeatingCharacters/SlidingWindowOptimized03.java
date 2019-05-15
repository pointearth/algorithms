package com.simon.algorithms.N003ELongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

//find the index dumplicate, skip i to the index directly.
public class SlidingWindowOptimized03 {
    public static void main(String[] args) {
        SlidingWindowOptimized03 sw = new SlidingWindowOptimized03();
        System.out.println(sw.lengthOfLongestSubstring("abcabcdabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int count=0,i =0,j=0;
        while ( j < n){
            if (!map.containsKey(s.charAt(j))){
                count = Math.max(count,j-i+1);
                map.put(s.charAt(j),j+1);
                j++;
            }else{
                int oldIndex = map.get(s.charAt(j));
                map.put(s.charAt(j),oldIndex);
                i= oldIndex;
            }
        }
        return count;
    }
}
