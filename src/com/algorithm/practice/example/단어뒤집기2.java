package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 단어뒤집기2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = reader.readLine().toCharArray();

            Stack<Character> stack = new Stack<>();
            StringBuilder result = new StringBuilder();
            boolean tag = false;

            for (char c : chars) {
                if (c == '<') {
                    reverse(stack, result);
                    tag = true;
                    result.append(c);
                } else if (c == '>') {
                    tag = false;
                    result.append(c);
                } else if (tag) {
                    result.append(c);
                } else if (c == ' ') {
                    reverse(stack, result);
                    result.append(c);
                } else {
                    stack.push(c);
                }
            }
            reverse(stack, result);

            System.out.println(result);
        }
    }

    private static void reverse(Stack<Character> stack, StringBuilder result) {
        while (!stack.isEmpty())
            result.append(stack.pop());
    }

}
