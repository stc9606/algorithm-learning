package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 오등큰수 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            StringBuilder result = new StringBuilder();

            int N = Integer.parseInt(reader.readLine());
            int[] sequence = new int[N];
            int[] count = new int[1_000_001];

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < N; i++) {
                sequence[i] = Integer.parseInt(tokenizer.nextToken());
                count[sequence[i]]++;
            }

            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < N; i++) {
                while (!stack.isEmpty() && count[sequence[i]] > count[sequence[stack.peek()]]) {
                    sequence[stack.pop()] = sequence[i];
                }

                stack.push(i);
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
