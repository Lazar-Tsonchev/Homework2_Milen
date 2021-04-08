package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task7 {
    /* Започвайки от 3, да се изведат на екрана първите n числа които се делят
на 3. Числата да са разделени със запетая.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();

        for(int i= 1; i<=n; i++) {
            if (i == n) {
                System.out.print(i * 3);
            } else {
                System.out.print((i * 3) + ", ");
            }
        }
    }
}
