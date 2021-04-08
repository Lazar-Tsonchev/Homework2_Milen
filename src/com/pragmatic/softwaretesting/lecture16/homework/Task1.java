package com.pragmatic.softwaretesting.lecture16.homework;

public class Task1 {
    public static void main(String[] args) {
        /*Да се изведат на екрана числата от 1 до 100..*/

        for (int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

    }
}
