package com.algorithm.practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {                       
            dataList.add((int) (Math.random() * 100));
        }
        System.out.println("before : " + dataList);
        BubbleSort bSort = new BubbleSort();
        List<Integer> sortDataList = bSort.sort(dataList);
        System.out.println("after : " + sortDataList);
    }

    public List<Integer> sort(List<Integer> dataList) {
        for (int i = 0; i < dataList.size() - 1; i++) {
            boolean swap = false;

            for (int j = 0; j < dataList.size() - 1 - i; j++) {
                if (dataList.get(j) > dataList.get(j + 1)) {
                    Collections.swap(dataList, j, j + 1);
                    swap = true;
                }
            }

            if (swap == false) break;
        }
        return dataList;
    }

}
