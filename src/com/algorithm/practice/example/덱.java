package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱 {

    private static Deque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                String cmd = tokenizer.nextToken();
                processCommand(cmd, tokenizer);
            }
        }
    }

    private static void processCommand(String cmd, StringTokenizer tokenizer) {
        switch (cmd) {
            case "push_front":
                pushFront(Integer.parseInt(tokenizer.nextToken()));
                break;
            case "push_back":
                pushBack(Integer.parseInt(tokenizer.nextToken()));
                break;
            case "pop_front":
                printResult(queue.isEmpty() ? -1 : queue.pollFirst());
                break;
            case "pop_back":
                printResult(queue.isEmpty() ? -1 : queue.pollLast());
                break;
            case "size":
                printResult(queue.size());
                break;
            case "empty":
                printResult(queue.isEmpty() ? 1 : 0);
                break;
            case "front":
                printResult(queue.isEmpty() ? -1 : queue.peekFirst());
                break;
            case "back":
                printResult(queue.isEmpty() ? -1 : queue.peekLast());
                break;
        }
    }

    private static void pushFront(int x) {
        queue.addFirst(x);
    }

    private static void pushBack(int x) {
        queue.addLast(x);
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
