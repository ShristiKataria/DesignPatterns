package com.designPattern.demo.singletonDesign;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Kachori implements Serializable,Cloneable {
//    INSTANCE

    private  static  Kachori kachori;
    private  Kachori(){}

    public static Kachori getKachori(){    //we will not create a constructor but use method to create an object of the class
        if(kachori==null){
//          samosa=new Samosa();
            synchronized (Samosa.class){
                if(kachori==null){
                    kachori=new Kachori();
                }
            }
        }
        return kachori;
    }
//    @Override
    public Object readResolve() throws ObjectStreamException{
        return  kachori;
    }

    @Override
    public  Object clone(){
        return  kachori;
    }

}
