package com.designPattern.demo.AbstractPattern;

public class AndroidDevFactory extends  EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper() {
        };
    }
}
