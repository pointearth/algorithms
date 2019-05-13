package com.simon.algorithms;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Countandsay_38 {
    public static void main(String[] args){
        Countandsay_38 cas = new Countandsay_38();
        System.out.println("1:"+cas.countAndSay(1));
        System.out.println("2:"+cas.countAndSay(2));
        System.out.println("3:"+cas.countAndSay(3));
        System.out.println("4:"+cas.countAndSay(4));
        System.out.println("5:"+cas.countAndSay(5));
        System.out.println("6:"+cas.countAndSay(6));
        System.out.println("7:"+cas.countAndSay(7));
        System.out.println("8:"+cas.countAndSay(8));
        System.out.println("9:"+cas.countAndSay(9));
        System.out.println("10:"+cas.countAndSay(10));
    }
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = "1";
        for(int i = 2;i <= n;i++){//  wrong as : 1    for(int i = 3;i<str.lengh();i++){      2  i <= str.length()
            int cnt = 0;
            str +="#";
            char[] arr = str.toCharArray();
            str = "";
            for (int j = 1;j<arr.length;j++){// wrong as ==
                if (arr[j-1] != arr[j]){
                    str += cnt+1;
                    str +=arr[j-1];
                    cnt =0;//forget init cnt
                }  else {
                    cnt++;
                }
            }
        }
        return str;
    }
}
