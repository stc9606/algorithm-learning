package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오큰수 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder result = new StringBuilder();
            Stack<Integer> stack = new Stack<>();

            int N = Integer.parseInt(reader.readLine());
            int[] sequence = new int[N];

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < N; i++) {
                sequence[i] = Integer.parseInt(tokenizer.nextToken());
            }

            for (int i = 0; i < N; i++) {
                while (!stack.isEmpty() && sequence[stack.peek()] < sequence[i]) {
                    sequence[stack.pop()] = sequence[i];
                }
                stack.add(i);
            }

            while (!stack.isEmpty()) {
                sequence[stack.pop()] = -1;
            }

            for (int i = 0; i < N; i++) {
                result.append(sequence[i]).append(" ");
            }

            System.out.println(result);
        }
    }

}
