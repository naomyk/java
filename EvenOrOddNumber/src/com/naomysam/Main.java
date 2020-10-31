package com.naomysam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] numbers = { 2,3,4,5,4,5,6,7,8,9,0,7};
	int total =0;
	for (int i=0; i< numbers.length; i++){
		total = numbers[i];
		if (total % 2==0){
			System.out.println("this is an even number");
		}else
			System.out.println("this is an odd number");
	}

	System.out.println(Arrays.toString(numbers));



    }
}
