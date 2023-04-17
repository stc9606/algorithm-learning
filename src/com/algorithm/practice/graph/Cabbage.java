package com.algorithm.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cabbage {
    static Queue<Coordinate> queue = new LinkedList<>();

    static int[] CHECK_X = { 1, 0, -1, 0 };
    static int[] CHECK_Y = { 0, 1, 0, -1 };

    static int[][] map;
    static boolean[][] visit;
    static int count = 0; // 지렁이 수
    static int M,N,K;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visit = new boolean[M][N];
            count = 0;

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(reader.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }

            for (int m = 0; m < M; m++) {
                for (int n = 0; n < N; n++) {
                    if (map[m][n] == 1 && !visit[m][n]) {
                        bfs(m, n);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

    public static void bfs(int x, int y) {
        queue.offer(new Coordinate(x, y));
        visit[x][y] = true;

        while (!queue.isEmpty()) {
            Coordinate c =queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = c.getX() + CHECK_X[i];
                int nY = c.getY() + CHECK_Y[i];

                if (nX >= 0 && nY >= 0 && nX < M && nY < N) {
                    if (!visit[nX][nY] && map[nX][nY] == 1)
                        queue.offer(new Coordinate(nX, nY));
                        visit[nX][nY] = true;
                }
            }
        }


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
