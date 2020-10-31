package com.naomysam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // the following represent a single dimensional array and the two methods of initializing an array.
        int numbers [] =new int[5];
        numbers[0] = 2;
        numbers[1] =4;
        numbers[2] =20;
        numbers[3] = 29;
        numbers[4] =43;
        String  [] message = {"hello","my","name","is","Naomy"};
        System.out.println(Arrays.toString(message));
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers);
        for(int i=0; i< numbers.length; i++)
        for (int j =0; j<message.length; j++){
            System.out.println(numbers[i]);
            System.out.println(message[j]);

        }
    }
}
