package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task6 {
    /*Да се прочете число от екрана(конзолата) и да се изведе сбора на всички
числа между 1 и въведеното число.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input i:");
        int i = sc.nextInt();

        int sum = 0;
        for (int j=1; j<=i; j++) {
            sum += j;
        }

        System.out.println("The sum is " + sum);
    }
}
