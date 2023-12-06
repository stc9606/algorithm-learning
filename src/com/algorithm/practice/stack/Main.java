package com.algorithm.practice.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    /**
     * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
     *
     * 명령은 총 다섯 가지이다.
     *
     * push X: 정수 X를 스택에 넣는 연산이다.
     * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * size: 스택에 들어있는 정수의 개수를 출력한다.
     * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
     * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     */

    /**
     * TODO 조건
     * 1. N (1 <= N <= 10,000) 첫 번째 줄
     * 2. 둘째 줄 부터 N개의 줄에는 명령이 하나씩 주어진다.
     *  주어지는 정수는, 1보다 크거나 같고 100,000보다 작거나 같다.
     *
     */
    static int N;

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String cmd = tokenizer.nextToken();

            switch (cmd) {
                case "push":
                    stack.push(Integer.valueOf(tokenizer.nextToken()));
                    break;
                case "pop":
                    Integer pop = stack.isEmpty() ? -1 : stack.pop();
                    result.append(pop).append("\n");
                    break;
                case "size":
                    Integer size = stack.size();
                    result.append(size).append("\n");
                    break;
                case "empty":
                    Integer empty = stack.isEmpty() ? 1 : 0;
                    result.append(empty).append("\n");
                    break;
                case "top":
                    Integer top = stack.isEmpty() ? -1 : stack.peek();
                    result.append(top).append("\n");
                    break;
            }
        }

        System.out.println(result);
    }
}
