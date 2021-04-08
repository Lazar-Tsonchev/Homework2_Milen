package com.pragmatic.softwaretesting.lecture16.homework;

public class Task2 {
    /*Да се изведат на екрана числат от -20 до 50.*/
    public static void main(String[] args) {
        for (int i = -20; i <= 50; i++) {
            if (i == 50) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }

    }
}
