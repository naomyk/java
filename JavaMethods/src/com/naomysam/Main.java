package com.naomysam;

public class Main {

    public static void main(String[] args) {
        MethodTest test1 = new MethodTest();
        int aValue =test1.total();
        System.out.println(aValue);
        String message = test1.userInput();
        System.out.println(message);
        System.out.println(test1.total(80));
        // you can output the result of (test1.total(80))directly instead of storing the result in a variable and then outputting that variable.
        String  combination =test1.severalInput("naomy ongoro you are", 20);
        System.out.println(combination);
        test1.inputText(); // you do not need to store the result in a variable because the return type was void.
    }
}
