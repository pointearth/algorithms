package com.simon.algorithms.N003ELongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SlidingWindow02 {
    public static void main(String[] args) {
        SlidingWindow02 sw = new SlidingWindow02();
        System.out.println(sw.lengthOfLongestSubstring("abcabcdabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int count = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                count = Math.max(count, j - i + 1);
                j++;//slide right boundary
            } else {
                set.remove(s.charAt(i));
                i++;//slide left boundary
            }
        }
        return count;
    }
}
