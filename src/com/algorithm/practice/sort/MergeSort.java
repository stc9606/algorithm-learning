package com.algorithm.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> mergeList = mergeSort.mergeSplitFunction(new ArrayList<>(Arrays.asList(4, 1, 3, 2, 0, 7, 11, 10, 16, 25, 13, 9)));

        System.out.println(mergeList);
    }

    public ArrayList<Integer> mergeSplitFunction(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) {
            return dataList;
        }

        int medium = dataList.size() / 2;

        ArrayList<Integer> left;
        ArrayList<Integer> right;

        left = mergeSplitFunction(new ArrayList<>(dataList.subList(0, medium)));
        right = mergeSplitFunction(new ArrayList<>(dataList.subList(medium, dataList.size())));

        return mergeFunction(left, right);
    }

    private ArrayList<Integer> mergeFunction(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> mergeList = new ArrayList<>();
        Integer leftPoint = 0;
        Integer rightPoint = 0;

        while (left.size() > leftPoint && right.size() > rightPoint) {
            if (left.get(leftPoint) > right.get(rightPoint)) {
                mergeList.add(right.get(rightPoint));
                rightPoint++;
            } else {
                mergeList.add(left.get(leftPoint));
                leftPoint++;
            }
        }

        while (left.size() > leftPoint) {
            mergeList.add(left.get(leftPoint));
            leftPoint++;
        }

        while (right.size() > rightPoint) {
            mergeList.add(right.get(rightPoint));
            rightPoint++;
        }

        return mergeList;
    }
}
