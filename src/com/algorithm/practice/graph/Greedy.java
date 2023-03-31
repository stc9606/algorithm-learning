package com.algorithm.practice.graph;

import java.util.Arrays;
import java.util.Comparator;

public class Greedy {
    public static void main(String[] args) {
        Integer[][] objectList = { {10, 10}, {15, 12}, {20, 10}, {25, 8}, {30, 5}};

        Greedy greedy = new Greedy();
        greedy.knapsackFun(objectList, 25.0);
    }

    public void knapsackFun(Integer[][] objectList, double capacity) {
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, (o1, o2) -> 0);

        for (int index = 0; index < objectList.length; index++) {
            if ( (capacity - (double)objectList[index][0] > 0 )) {
                capacity -= (double) objectList[index][0];
                totalValue += (double) objectList[index][1];
                System.out.println("무게: " + objectList[index][0] + ", 가치: "+ objectList[index][1]);
             } else {
                fraction = capacity / (double) objectList[index][0];
                totalValue += (double) objectList[index][1] * fraction;
                System.out.println("무게: " + objectList[index][0] + ", 가치: "+ objectList[index][1]+ ", 비율: "+ fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치: "+ totalValue);
    }
}
