package com.designPattern.demo.singletonDesign;

import java.lang.reflect.Constructor;

public class Samosa {
    // motive: to create an object only one time , class can be called x times
    private Samosa(){
        if(samosa!=null){
            throw  new RuntimeException("you are trying to break singleton pattern");
        }

    }
    private static Samosa samosa;
//    default value when object is initialized is null
//    private coz should not be called outside class
//    static coz if made non-static we need to call it using object but static can be called using class name
//    we cannot create a non-static member inside static method directly, we need to create an object of that member

    //Lazy way of creating a single object
//    public static synchronized Samosa getSamosa()   method level synchronization
    public static Samosa getSamosa(){    //we will not create a constructor but use method to create an object of the class
      if(samosa==null){
//          samosa=new Samosa();
          synchronized (Samosa.class){
              if(samosa==null){
                  samosa=new Samosa();
              }
          }
      }
      return samosa;
    }

    //POINTS TO REMEMBER
//      1.Constructor must be private
//      2. Object created with the help of method
//      3. create field to store object is private
    // disadvantages
//    multithreading: when multiple threads are running parallel then two threads can simultaneously
//    call the getSamosa() method, in that case more than one object will be created

    //for thread safety we use the keyword "synchronised"
    //for optimization we will not use this keyword at method,instead use synchronised block


}
