package com.simon.algorithms;

import java.util.HashMap;
import java.util.Map;
//13.roman-to-integer

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Roman2Integer_13 {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i =s.length()-1;i>=0;i--){
            int cur = map.get(s.charAt(i));
            if (i == 0){
                result += cur;
                break;
            }
            int pre = map.get(s.charAt(i-1));
             if (cur>pre) {
                result += cur - pre  ;
                i--;
                }else   result += cur;
        }
        return result;
    }
}

