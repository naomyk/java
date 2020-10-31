package com.naomysam;

import java.util.concurrent.Callable;

public class ConstructorChaining {
    String name;
    int age;
    String location;
    double salary;
    public  ConstructorChaining(String name, int age,String location){
        this.name= name;
        this.age=age;
        this.location=location;
        System.out.println(name+" "+age+" "+location);
    }

    public ConstructorChaining(String name,int age, String location,double salary){
        this( name, age,location);
        this.salary= salary;
      System.out.println(" basic salary"+salary);
    }
    static class People{
        String name ;
        People getPeople(){
            return this;
        }}

    public static void main(String[] args) {
	/*refer to current class instance variable in a situation where there is ambiguity between the instance variables and parameters(local variables)
	* to invoke current class method => this.methodName
	* to invoke current class constructor=> to reuse the constructor (constructor chaining)
	* //it maintains a chain between the constructors
	* //call to this() must be the first statement in the constructor.
	* //can be used to call a default constructor from a parameterized costructor and vise versa
	* to return current class instance from the method
	* //the return type of the method must be the class type(non_primitive) ie the people class*/

        ConstructorChaining myConstructor = new ConstructorChaining("naomi",20,"railways",200000);
        People myPeople = new People();
        myPeople.getPeople();
    }
}
