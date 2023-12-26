package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 후위표기식2 {

    private static final Map<Character, BinaryOperator> OPERATOR = new HashMap<>();

    static {
        OPERATOR.put('+', (o1, o2) -> o1 + o2);
        OPERATOR.put('-', (o1, o2) -> o1 - o2);
        OPERATOR.put('*', (o1, o2) -> o1 * o2);
        OPERATOR.put('/', (o1, o2) -> o1 / o2);
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split("");

            int[] nums = new int[N];
            for (int i = 0; i < N; i++)
                nums[i] = Integer.parseInt(reader.readLine());

            Stack<Double> stack = new Stack<>();
            for (String value : s) {
                char op = value.charAt(0);

                if ('A' <= op && 'Z' >= op) {
                    double val = nums[op - 'A'];
                    stack.push(val);
                } else {
                    double val = applyOperator(op, stack);
                    stack.push(val);
                }
            }
            System.out.printf("%.2f", stack.pop());
        }
    }

    private static double applyOperator(char op,  Stack<Double> stack) {
        Double o1 = stack.pop();
        Double o2 = stack.pop();
        return OPERATOR.get(op).apply(o2, o1);
    }

    private interface BinaryOperator {
        double apply(double o1, double o2);
    }

}
