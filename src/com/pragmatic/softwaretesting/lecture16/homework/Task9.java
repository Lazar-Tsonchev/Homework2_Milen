package com.pragmatic.softwaretesting.lecture16.homework;

import java.util.Scanner;

public class Task9 {
    /*Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички
числа от А до В на степен 2(разделени с запетая). Ако някое число е кратно на 3, да
се изведе съобщение че числото се пропуска „skip 3“. Ако сумата от всички
изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
извеждането.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input A:");
        int a = sc.nextInt();
        System.out.println("Please input B:");
        int b = sc.nextInt();

        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += (i * i);
            if (i % 3 == 0) {
                System.out.print("skip" + i + ", ");
                sum -= (i * i);
            } else
                System.out.print(i * i + ", ");
            if (sum > 200)
                break;
        }
    }
}
