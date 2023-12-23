package com.designPattern.demo.singletonDesign;

public class EagerWaySingleton {

    //eager way of creating a singelton object
    private static  EagerWaySingleton eagerWaySingleton=new EagerWaySingleton();

    public EagerWaySingleton getEagerWaySingleton(){
        return  eagerWaySingleton;
    }

    //disadvantage of creating obj using eager way.
//    if the object is not used for the whole process or within the project but it is still created
//    coz it is static ,and created when class is loaded.
}
