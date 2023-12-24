package com.designPattern.demo.FactoryDesign;

public class Client {

    public static  void main(String[] args){
        Employee employee=EmployeeFactory.getEmployee("BACKEND");
        System.out.println(employee.getSalary());


        Employee employee2=EmployeeFactory.getEmployee("ANDROID");
        System.out.println(employee2.getSalary());
    }



}
