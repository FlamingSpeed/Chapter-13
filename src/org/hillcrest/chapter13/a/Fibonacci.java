package org.hillcrest.chapter13.a;

public class Fibonacci {
    public static long fib(int n){
        if (n <= 1){
            return 1;
        }
        return fib(n -1) + fib(n-2);
    }
}
