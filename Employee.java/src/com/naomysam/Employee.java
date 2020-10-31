package com.naomysam;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;
  public  Employee ( String myName){
      name = myName;
  }
  public int setAge( int yourAge){
      age = yourAge;
      return  age;
  }
  public String  setDesignation( String getDesignation){
      designation = getDesignation;
      return  designation;
  }
  public  double setSalary( double mySalary){
      salary= mySalary;
      return salary;
  }
}
