package com.algorithm;

public class Main {

    public static void main(String[] args) {

        Test test = new Test();

        System.out.println(test.start);
    }

    public static class Test {

        private String start;

        public Test() {
            this.start = this.test();
        }

        public String test() {
            return "TEST";
        }

    }
}
