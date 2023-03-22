package com.algorithm.practice.recursive;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Integer fun = fibonacci.fun(8);
        Integer dynamicFun = fibonacci.dynamicFun(8);
        System.out.println(fun);
        System.out.println(dynamicFun);
    }

    // 일반 재귀 용법
    public Integer fun(int n) {
        if (n <= 1) {
            return n;
        }

        return fun(n-1) + fun(n-2);
    }

    // 동적 계획법
    public Integer dynamicFun(int n) {
        Integer[] cache = new Integer[n+1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i < n+1; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }

        return cache[n];
    }

}
