package com.algorithm.practice.example;

import java.io.*;
import java.util.Stack;

public class 쇠막대기 {

    public static void main(String[] args) throws IOException {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] input = reader.readLine().split("");
            Stack<String> stack = new Stack<>();

            int total = 0;
            for (int i = 0; i < input.length; i++) {
                String s = input[i];

                if ("(".equals(s)) {
                    stack.push(s);
                } else {
                    String prev = input[i-1];
                    if ("(".equals(prev)) {
                        stack.pop();
                        total += stack.size();
                    } else {
                        total++;
                        stack.pop();
                    }
                }
            }
            writer.write(String.valueOf(total));
        }

    }

}
