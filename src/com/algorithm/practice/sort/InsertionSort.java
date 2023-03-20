package com.algorithm.practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();

        for (int i = 0; i<10; i++) {
            items.add((int) (Math.random() * 100));
        }

        System.out.println("before : "+ items);
        SelectionSort sSort = new SelectionSort();
        List<Integer> sortDataList = sSort.sort(items);
        System.out.println("after : "+ sortDataList);
    }

    public List<Integer> sort(List<Integer> items) {
        for (int i = 0; i < items.size(); i++) {
            for (int j = i+1; i > 0; i--) {
                if (items.get(j) < items.get(j - 1)) {
                    Collections.swap(items, j, j-1);
                } else {
                    break;
                }
            }
        }
        return items;
    }
}
