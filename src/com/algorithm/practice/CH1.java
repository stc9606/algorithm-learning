package com.algorithm.practice;

import java.util.Arrays;

public class CH1 {

    public String process(int n, String string) {
        // 1. 정수 공백 기준으로 정수 배열 만들기
        String[] strings = string.split(" ");

        // 2. 정수 개수 만큼 Int 배열 선언
        int[] ints = new int[n];

        // 3. 정수 배열 int형으로 parsing
        for( int i=0; i<n; i++ ) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        // 4. 오름차순 정렬
        Arrays.sort(ints);

        return ints[0] + " " + ints[n-1];
    }

    public void main(String[] args) {
        /**
         * TODO N개의 정수가 주어질 때, 최솟값과 최댓값 구하기
         *
         * @Param N - 정수의 갯수
         * @Param string - 정수
         *
         * N 범위 : 1 <= N <= 1,000,000
         */
        //        int n = 5;
        //        String string = "20 10 35 30 7";
        int n = 10;
        String string = "21 73 102 55 10 2 221 45 39 88";


        String result = this.process(n, string);
    }

}
