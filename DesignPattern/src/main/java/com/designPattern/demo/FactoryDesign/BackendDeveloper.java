package com.designPattern.demo.FactoryDesign;

public class BackendDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Backend developer salary: ");
        return 50000;
    }
}
