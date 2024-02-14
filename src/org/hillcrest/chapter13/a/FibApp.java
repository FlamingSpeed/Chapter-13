package org.hillcrest.chapter13.a;

public class FibApp {
    public static void main(String[] args) {
        var value = Fibonacci.fib(50);
        System.out.println(value);
        value = Fibonacci.fibLoop(50);
        System.out.println(value);
    }
}
