package com.designPattern.demo.AbstractPattern;


public class AbstractClient {

    public static void main(String []args){
       Employee e= EmployeeFactory.getEmployee(new AndroidDevFactory());
       e.name();
       System.out.println(e.name());
    }
}
