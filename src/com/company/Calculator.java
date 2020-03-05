package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (scan.hasNextInt()){
           x = scan.nextInt();
            System.out.println("Введите второе число");
        } else {
            System.out.println("Ошибка при вводе числа");
            scan.close();
        }
        if (scan.hasNextInt()){
            y = scan.nextInt();
            System.out.println("Введите операцию");
        } else {
            System.out.println("Ошибка при вводе числа");
            scan.close();
        }
        String s = scan.next();
        scan.close();
        int z;
        switch (s) {
            case "+": z = x + y;
                System.out.println("Ваш результат " + z);
            break;
            case "-": z = x - y;
                System.out.println("Ваш результат " + z);
            break;
            case "*": z = x * y;
                System.out.println("Ваш результат " + z);
            break;
            case "/": z = x / y;
                System.out.println("Ваш результат " + z);
            break;
            default:
                System.out.println("Ошибка при вводе операции");
                break;
        }
    }
}
