package com.company;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i = i + 3) {
            switch (i) {
                case 0:
                    System.out.print("zero ");
                    break;
                case 3:
                    System.out.print("three ");
                    break;
                case 6:
                    System.out.print("six ");
                    break;
                default:
                    System.out.print("nine ");
                    break;
            }
            System.out.println(i);
        }
        int a = 5;
        do {
            System.out.println(a);
            a--;
        } while (a >= 0);
    }
}
