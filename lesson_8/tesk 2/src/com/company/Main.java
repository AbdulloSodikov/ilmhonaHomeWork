package com.company;

public class Main {

    public static void main(String[] args) {
        int total = totalNum(1, 6);
        

    }
    public static int totalNum(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            counter = counter + i * i;
        }
        return counter;
    }
}
