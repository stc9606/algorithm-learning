package com.algorithm.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort  {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        List<Integer> merge = quickSort.sort(Arrays.asList(5, 2, 13, 4, 16, 7, 11, 9));
        System.out.println(merge);
    }

    public List<Integer> sort(List<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        Integer pivot = dataList.get(0);

        List<Integer> rightList = new ArrayList<>();
        List<Integer> leftList = new ArrayList<>();

        for (int i = 1; i < dataList.size(); i++) {

            if (dataList.get(i) > pivot) {
                rightList.add(dataList.get(i));
            } else {
                leftList.add(dataList.get(i));
            }
        }

        List<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(this.sort(leftList));
        mergeList.add(pivot);
        mergeList.addAll(this.sort(rightList));

        return mergeList;
    }
}
