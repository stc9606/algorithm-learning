package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 에디터 {
    
    static int N; // 커서 위치
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        StringBuilder result = new StringBuilder(s);
        N = s.length();
        M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String cmd = tokenizer.nextToken();

            switch (cmd) {
                case "L":
                    if (N == 0) break;
                    N -= 1;
                    break;
                case "D":
                    if (N == result.length()) break;
                    N += 1;
                    break;
                case "B":
                    if (N == 0) break;
                    result.delete(N-1, N);
                    N -= 1;
                    break;
                case "P":
                    String add = tokenizer.nextToken();
                    result.insert(N, add);
                    N += 1;
                    break;
            }
        }
        System.out.println(result);
    }
}
