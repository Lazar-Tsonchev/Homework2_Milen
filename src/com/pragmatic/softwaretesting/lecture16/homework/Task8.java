package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task8 {
    /*По зададено число n, да се изведе на екрана таблица по
следния начин:*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int inner = n - 1 + i * 2;
            for(int j = 0; j < n; j++) {
//                System.out.print(inner + (j == n-1 ? "\n" : ""));
                if (j == n-1) {
                    System.out.println(inner);
                } else {
                    System.out.print(inner);
                }
            }
        }
    }
}
