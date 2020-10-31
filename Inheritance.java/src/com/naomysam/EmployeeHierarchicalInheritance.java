package com.naomysam;

public class EmployeeHierarchicalInheritance {
    String  aString (String a ){
        System.out.println("this is my string" +" "+ a);
        return a;
    }
}
class AnotherInheritanceClass extends EmployeeHierarchicalInheritance {
    String bString ( String b){
        System.out.println("another string of mine" +" " +b);
        return b;
    }
}
class DerivedClass extends  EmployeeHierarchicalInheritance {
    String cString( String c){
        System.out.println("this is my derived class" +" " + c);
        return c;
    }
}
