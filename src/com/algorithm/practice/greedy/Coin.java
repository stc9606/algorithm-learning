package com.algorithm.practice.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coin {
    public static void main(String[] args) {
        Coin coin = new Coin();
        List<Integer> coinList = new ArrayList<>(Arrays.asList(500, 100, 50, 1));
        coin.coinFun(4720, coinList);
    }

    public void coinFun(Integer price, List<Integer> coinList) {
        Integer totalCoinCount = 0;
        Integer coinNum = 0;

        List<Integer> details = new ArrayList<>();
        for (int index = 0; index < coinList.size(); index++) {
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(index);
            details.add(coinNum);
            System.out.println(coinList.get(index) + "원" + coinNum + "개");
        }

        System.out.println("총 동전 갯수: "+ totalCoinCount);
    }

}
