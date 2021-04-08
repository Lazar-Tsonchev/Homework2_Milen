package com.pragmatic.softwaretesting.lecture16.homework;

public class Task3 {
    /*Да се изведат на екрана всички нечетни числа от -10 до 10*/
    public static void main(String[] args) {
        int i = -10;
        do {
            if (Math.abs(i % 2) == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= 10);
    }
}
