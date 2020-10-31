package com.naomysam;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList listTest = new ArrayList();
        listTest.add("my");
        listTest.add("name");
        listTest.add("is");
        listTest.add("naomy");
        listTest.add("aged");
        listTest.add(20);
        listTest.remove(2);
        System.out.println(listTest.get(2));
        listTest.get(2);
        Iterator iteratorReference = listTest.iterator();
        while ( iteratorReference.hasNext()){
            System.out.println( iteratorReference.next());
        }
        System.out.println(iteratorReference.hasNext());
    }
}
