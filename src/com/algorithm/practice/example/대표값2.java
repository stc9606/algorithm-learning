package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대표값2 {

    public static void main(String[] args) throws IOException {
        int sum = 0;
        int[] arr = new int[5];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int avg = sum / 5;
        int mid = arr[2];
        System.out.print(avg + "\n" + mid);
    }
}
