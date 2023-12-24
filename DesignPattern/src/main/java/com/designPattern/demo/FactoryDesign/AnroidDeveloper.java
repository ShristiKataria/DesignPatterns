package com.designPattern.demo.FactoryDesign;

public class AnroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Anroid developer salary: ");
        return 35000;
    }
}
