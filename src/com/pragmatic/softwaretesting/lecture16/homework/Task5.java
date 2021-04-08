package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task5 {
/*Да се въведат от потребителя 2 числа. И да се изведат на екрана всички
числа от по-малкото до по-голямото.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = sc.nextInt();
        System.out.println("Please input b:");
        int b = sc.nextInt();

        do {
            System.out.println(a++);
        } while (a <= b);

}
}
