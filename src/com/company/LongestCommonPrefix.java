package com.simon.algorithm;

public class LongestCommonPrefix {

    public static void main(String[] args) {
	// write your code here
        String [] arg = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(arg));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minLength = Integer.MAX_VALUE;
        for(String str: strs){
            minLength = Math.min(minLength, str.length());
        }
        int low = 1, high = minLength;
        while (low <= high){
            int mid = (low+high)/2;
            if (isCommonPrefix(strs,mid)) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return strs[0].substring(0,(low+high)/2);
    }
    private static boolean isCommonPrefix(String[] strs, int len ){
        String str1  = strs[0].substring(0,len);
        for (int i = 1;i<strs.length;i++) {
            if (!strs[i].startsWith(str1))
                return false;
        }
        return true;
    }
}
