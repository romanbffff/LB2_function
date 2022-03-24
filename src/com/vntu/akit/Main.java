package com.vntu.akit;

import java.util.Scanner;

public class Main {

    static int var = 2;

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = scanner.nextInt();
        checkIsItANaturalNumber(number);
        for (int i = 1; i <= 10000; i++) {
            checkIsItANaturalNumber(i);
        }
    }
    private static void checkIsItANaturalNumber(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                checkIsItANaturalNumber(n);
            } else if (n % var == 0) {
                print(var, n);
            }
        }
    }
    private static void print(int var, int n) {
        if (var == n) {
            System.out.println(n + " is a natural number");
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}
