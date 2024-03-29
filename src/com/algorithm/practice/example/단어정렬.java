package com.algorithm.practice.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for(int i =  0 ; i < num ; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> {
            if(s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }else {
                return s1.length() - s2.length();
            }

        });

        System.out.println(arr[0]);
        for(int i = 1; i < num; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

    }
}
