package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task10 {
    /*Въведете число от клавиатурата и определете дали е просто. Просто
число е това което се дели САМО на 1 и на себе си.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n:");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i = 2; i < n; i++) {
            if ((n % i == 0)) {
                isPrime = false;
                break;
            }
        }

        System.out.print(n + (isPrime ? " is prime" : " is not prime"));
    }
}
