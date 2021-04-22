package com.company;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combination = 0;
        boolean flag = false;

        for (int i = start; i <= end; i++) {
            for (int j = end; j <= end; j++) {
                combination++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, i + j);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.printf("%d combinations - neither equals %d%n", combination, magicNumber);
        }
    }
}
