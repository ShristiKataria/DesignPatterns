package com.designPattern.demo.AbstractPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 600000;
    }

    @Override
    public String name() {
        return "I am WebDeveloper";
    }
}
