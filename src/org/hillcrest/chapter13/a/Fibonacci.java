package org.hillcrest.chapter13.a;

public class Fibonacci {
    public static long fib(int n){
        if (n <= 1){
            return 1;
        }
        return fib(n -1) + fib(n-2);
    }
    public static long fibLoop(int n){
        if(n <=1){
            return 1;
        }
        long firstValue = 0;
        long secondValue = 1;
        long value = 0;
        for (int i =1; i <= n; i++){
            value = firstValue+secondValue;
            firstValue=secondValue;
            secondValue=value;
        }
        return value;
    }
}