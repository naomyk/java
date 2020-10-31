package com.naomysam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] courseUnits = { "BIT101","BIT203","BIT202","SCI204","SCI108"};
        String  registrationNumber;
        int numberOfStudents= 5;
        int examMarks=0;
        int totalExamMarks=0;
        final int maxExamMarks = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter course unit");
        String courseUnit = scanner.next();
        if (courseUnit.equals("BIT101")){
            for (int i= 0; i<courseUnits.length;i++) {

                    System.out.println("enter registration number");
                    registrationNumber = scanner.next();
                    System.out.println("exam marks: ");
                    examMarks = scanner.nextInt();
                    totalExamMarks = examMarks +i;
                    System.out.println(totalExamMarks);
                if (examMarks > maxExamMarks) {
                    System.out.println("invalid score");
                }
            }
            double BIT101MEAN = totalExamMarks/numberOfStudents;
            System.out.println(BIT101MEAN);
        }



    }
}
