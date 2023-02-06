package com.algorithm.practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSort  {
    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>();
        
        for (int i = 0; i<10; i++) {
            dataList.add((int) (Math.random() * 100));
        }

        System.out.println("before : "+ dataList);
        SelectionSort sSort = new SelectionSort();
        List<Integer> sortDataList = sSort.sort(dataList);
        System.out.println("after : "+ sortDataList);
    }
    
    public List<Integer> sort(List<Integer> dataList) {
        int low;

        for (int idx = 0; idx < dataList.size() -1; idx++) {
            low = idx;

            for (int jdx = idx + 1; jdx < dataList.size(); jdx++) {
                if (dataList.get(low) > dataList.get(jdx)) {
                    low = jdx;
                }
            }
            Collections.swap(dataList, low, idx);
        }

        return dataList;
    }
}
