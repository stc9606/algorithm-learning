package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {

    static int T;
    static StringBuilder result = new StringBuilder();
    static int temp = 1;
    static boolean notFound = false;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());

            for (; temp <= N; temp++) {
                stack.push(temp);
                result.append("+\n");
            }

            if (stack.peek() == N) {
                stack.pop();
                result.append("-\n");
            } else {
                notFound = true;
            }
        }

        if (notFound) {
            System.out.println("NO");
        } else {
            System.out.println(result);
        }
    }
}
