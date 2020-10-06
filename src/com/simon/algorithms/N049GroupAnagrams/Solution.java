package com.simon.algorithms.N049GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList();
        }
        Map<String,List> result = new HashMap<String,List>();
        for (String s : strs) {
            String key = transfer(s);
            if (!result.containsKey(key)) {
                result.put(key,new ArrayList<String>());
            }
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
    private String transfer(String original) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[26];
        Arrays.fill(count,0);
        for(char c : original.toCharArray()) {
            count[c-'a']++;
        }
        for(int i = 0;i< 26;i++) {
            result.append("#").append(count[i]);
        }
        return result.toString();
    }
}
