package com.naomysam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number :");
        int myNumber = scanner.nextInt();

            if (myNumber % 2 == 0) {
                System.out.println("this is an even number");
            } else
                System.out.println("this is an odd number");



    }
}
