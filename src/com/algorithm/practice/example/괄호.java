package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            char[] chars = reader.readLine().toCharArray();

            Stack<Character> bracket = new Stack<>();

            for (char c : chars) {
                if (c == '(') {
                    bracket.push(c);
                } else {
                    if (!bracket.isEmpty()) {
                        bracket.pop();
                    } else {
                        bracket.push(c);
                        break;
                    }
                }
            }

            if (bracket.isEmpty()) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
        System.out.println(result);
    }
}
