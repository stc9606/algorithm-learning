package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 큐 {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        N = Integer.parseInt(reader.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String cmd = tokenizer.nextToken();

            switch (cmd) {
                case "push":
                    queue.add(Integer.parseInt(tokenizer.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                        break;
                    }
                    result.append(queue.poll()).append("\n");
                    break;
                case "size":
                    result.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        result.append(1).append("\n");
                        break;
                    }
                    result.append(0).append("\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                        break;
                    }
                    result.append(queue.peekFirst()).append("\n");
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                        break;
                    }
                    result.append(queue.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(result);
    }

}
