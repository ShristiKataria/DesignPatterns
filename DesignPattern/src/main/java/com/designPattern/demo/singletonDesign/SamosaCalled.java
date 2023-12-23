package com.designPattern.demo.singletonDesign;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SamosaCalled  {

//    new Samosa();
//    the above constructor call we show error coz we have not created a default constructor
//    we use method to  get instance of samosa
    public  static  void main(String[] args) throws Exception{
        Samosa samosa=Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Constructor<Samosa> constructor=Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);  //since constructor is private,to make it accessible out we use this statementkk
        Samosa newInstance=constructor.newInstance();
        System.out.println(newInstance.hashCode());

    }

    //WAYS TO BREAK SINGLETON DESIGN PATTERN
    /*
    * 1. Reflection API to break singleton pattern
    * solution: 1) if object exits already, then we will throw an exception from inside constructor
    *           2) using enum; demo shown using Kachori class
    * 2. Deserialization
    * solution: implement readResolve method()
    *
    * 3. Cloning
    *
     */
}

