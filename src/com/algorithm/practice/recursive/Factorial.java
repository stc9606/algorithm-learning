package com.algorithm.practice.recursive;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int result = factorial.pattern(5);
        System.out.println(result);
    }

    public int func(int n) {
        if (n <= 1) return 1;

        return n * func(n-1);
    }

    public int total(List<Integer> items) {
        if (items.size() == 0) {
            return 0;
        }
        return items.get(0) + total(items.subList(1, items.size()));
    }

    public int pattern(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return pattern(n - 1) + pattern(n - 2) + pattern(n - 3);
    }
}
