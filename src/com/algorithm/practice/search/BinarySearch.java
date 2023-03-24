package com.algorithm.practice.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> dataList = new ArrayList<>();
        for (int i=0; i<100; i++) {
            dataList.add((int) (Math.random() * 100));
        }
        Collections.sort(dataList);
        System.out.println(dataList);

        BinarySearch bi = new BinarySearch();
        boolean search = bi.searchFunction(dataList, 12);

        System.out.println(search);
    }

    public boolean searchFunction(List<Integer> dataList, Integer searchNumber) {
        if (dataList.size() == 0) return false;
        if (dataList.size() == 1 && searchNumber != dataList.get(0)) return false;
        if (dataList.size() == 1 && searchNumber == dataList.get(0)) return true;

        int medium = dataList.size() / 2;

        if (searchNumber == dataList.get(medium)) {
            return true;
        } else {
            if (searchNumber < dataList.get(medium)) {
                return this.searchFunction(new ArrayList<>(dataList.subList(0, medium)), searchNumber);
            } else {
                return this.searchFunction(new ArrayList<>(dataList.subList(medium, dataList.size())), searchNumber);
            }
        }
    }

}
