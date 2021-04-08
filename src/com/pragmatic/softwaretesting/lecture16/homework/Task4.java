package com.pragmatic.softwaretesting.lecture16.homework;

public class Task4 {
    /*Да се изведат на екрана числата от 10 до 1 в обратен ред.*/
    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
