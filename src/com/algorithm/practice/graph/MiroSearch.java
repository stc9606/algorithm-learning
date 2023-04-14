package com.algorithm.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MiroSearch {
    static int N,M;

    static char[][] MIRO;
    static int[][] PATH_MAP;

    static int[] CHECK_X = { 1, 0, -1, 0 };
    static int[] CHECK_Y = { 0, 1, 0, -1 };

    static Queue<Coordinate> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        N = Integer.parseInt(tokenizer.nextToken());
        M = Integer.parseInt(tokenizer.nextToken());

        MIRO = new char[N][M];
        PATH_MAP = new int[N][M];

        for (int i = 0; i < N; i++) {
            String element = reader.readLine();
            for (int j = 0; j < M; j++) {
                MIRO[i][j] = element.charAt(j);
            }
        }

        queue.offer(new Coordinate(0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nX = c.getX() + CHECK_X[i];
                int nY = c.getY() + CHECK_Y[i];

                if (nX < 0 || nY < 0 || nX >= N || nY >= M)
                    continue;

                if (MIRO[nX][nY] == '0' || PATH_MAP[nX][nY] > 1)
                    continue;

                queue.offer(new Coordinate(nX, nY));
                PATH_MAP[nX][nY] = PATH_MAP[c.getX()][c.getY()] + 1;
            }
        }

        System.out.println(PATH_MAP[N-1][M-1] + 1);
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
