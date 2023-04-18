package com.algorithm.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class AddrCount {
    static Queue<Coordinate> queue = new LinkedList<>();

    static int[] CHECK_X = { 1, 0, -1, 0 };
    static int[] CHECK_Y = { 0, 1, 0, -1 };

    static int[][] map;
    static boolean[][] visit;

    static List<Integer> localCounts = new ArrayList<>(); // 단지 내 수
    static int mapCount = 0; // 단지 수

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(reader.readLine());

        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String el = reader.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = el.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && map[i][j] == 1) {
                    bfs(i, j);
                    mapCount++;
                }
            }
        }

        Collections.sort(localCounts);

        System.out.println(mapCount);
        localCounts.forEach(System.out::println);
    }

    public static void bfs(int x, int y) {
        queue.offer(new Coordinate(x, y));

        visit[x][y] = true;

        int count = 1;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = c.getX() + CHECK_X[i];
                int nY = c.getY() + CHECK_Y[i];

                if (nX >= 0 && nY >= 0 && nX < N && nY < N) {
                    if (!visit[nX][nY] && map[nX][nY] == 1) {
                        queue.offer(new Coordinate(nX, nY));
                        visit[nX][nY] = true;
                        count++;
                    }
                }
            }
        }

        localCounts.add(count);
    }

    public static class Coordinate {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
