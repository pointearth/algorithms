package com.simon.ctci.bigo;

public class Fibonacci {

    private static int Fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else {
            return Fib(n-1) + Fib(n-2);
        }
    }
    public static void FibAll(int n) {
        for (int i = 0;i < n ;i++) {
            System.out.println(i+":"+ Fib(i));
        }
    }
    public static void main(String[] args) {
        FibAll(20);
    }
}
