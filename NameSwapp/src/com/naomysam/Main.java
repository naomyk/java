package com.naomysam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter First and Surname : ");
        String fullName = scanner.nextLine();
        String firstNameChar = fullName.substring(0,2);
        System.out.println(firstNameChar);
        int spacePosition = fullName.indexOf(" ");
        System.out.println(spacePosition);
        String surNameChar = fullName.substring(spacePosition+1, (spacePosition+1)+2);
        System.out.println(surNameChar);
        String remainingFirstInitials = fullName.substring(2,spacePosition);
        System.out.println(remainingFirstInitials);
        String  remainingSurNameInitials = fullName.substring((spacePosition+1)+2, fullName.length());
        System.out.println(remainingSurNameInitials);
        String  newName = firstNameChar+ remainingSurNameInitials + " " + surNameChar+ remainingFirstInitials;
        System.out.println(newName);
        /** charAt method is used to check for a singe character in a string.
         * String emaill =naomyongoro@gmail.com;
         * char characterAt = emaill.charAt(4);
         * @param int 4;
         */
    }
}
