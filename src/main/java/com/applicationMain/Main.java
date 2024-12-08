package com.applicationMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome All !!");

        System.out.print("Please enter a intiger value : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Entered value is : " + a);

        for (int i = 1; i <= a; i++) {
            System.out.println("i = " + i);
        }
    }
}