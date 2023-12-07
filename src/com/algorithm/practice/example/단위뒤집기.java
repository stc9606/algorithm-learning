package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단위뒤집기 {

    static int T;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int totalTokenSize = tokenizer.countTokens();

            for (int j = 0; j < totalTokenSize; j++) {
                String s = tokenizer.nextToken();
                char[] chars = s.toCharArray();

                for (int c = chars.length - 1; c >= 0; c--) {
                    result.append(chars[c]);

                    if (c == 0) {
                        result.append(" ");

                    }
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }
}
