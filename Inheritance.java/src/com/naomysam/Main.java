package com.naomysam;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args ){
        ExamResults results = new ExamResults();

        System.out.println( results.studentName("naomy kerubo"));
        System.out.println( results.studentNumber("scii/01345/2018"));
        System.out.println( results.score(30));
        System.out.println( results.grade(30));

        Certificates myCertificate = new Certificates();
        String finalCertificate = myCertificate.getCertificate("B").toUpperCase();
        System.out.println(finalCertificate);


        Dog myDog =  new Dog();
        myDog.bark();
        System.out.println(myDog.move("dog"));
        System.out.println(myDog.name("weevil"));

        SmallDog mySmallDog = new SmallDog();
        mySmallDog.meow();
        mySmallDog.bark();
        System.out.println(" ");

        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        System.out.println(myPuppy.move("bat"));

        AnotherInheritanceClass a = new AnotherInheritanceClass();
        DerivedClass b = new DerivedClass();
        System.out.println(a.aString("hello you"));
        System.out.println(a.bString("go away"));
        System.out.println(b.aString("hello there"));
        System.out.println (b.cString("hi Naomi"));
    }
}
