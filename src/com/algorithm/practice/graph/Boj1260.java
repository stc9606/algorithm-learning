package com.algorithm.practice.graph;

import java.util.*;
import java.util.Queue;

public class Boj1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        graph = new ArrayList[n+1]; // 정점의 개수+1만큼의 크기로 인접 리스트 생성
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph[from].add(to); // 양방향 간선이므로 두 정점의 인접 리스트에 모두 추가
            graph[to].add(from);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]); // 각 인접 리스트를 오름차순으로 정렬
        }

        visited = new boolean[n+1]; // 방문 여부를 저장할 배열 생성
        dfs(v); // DFS 탐색
        System.out.println(); // 한 줄 띄우기
        visited = new boolean[n+1]; // 방문 여부 초기화
        bfs(v); // BFS 탐색
    }

    static void dfs(int start) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int next : graph[start]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true; // 시작 정점 방문 체크

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int i : graph[current]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

}
