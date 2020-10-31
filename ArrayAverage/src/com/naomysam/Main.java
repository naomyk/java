package com.naomysam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] numbers = {2,3,4,5,6,7,8,9};
	int total = 0;
	for ( int i =0; i<numbers.length; i++){
	    total = total + numbers[i];
    }
	double average = total/numbers.length;
	System.out.println("average is:" + average );
    }
}
