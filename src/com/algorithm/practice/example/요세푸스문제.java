package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        while (queue.size() != 1) {
            for (int i = 0;  i < k; i++) {
                queue.offer(queue.poll());
            }
            result.append(queue.poll()).append(", ");
        }

        result.append(queue.poll()).append(">");
        System.out.println(result);
    }
}
