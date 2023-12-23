package com.designPattern.demo.singletonDesign;

import java.io.*;

public class KachoriCalled {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Kachori kachori=Kachori.INSTANCE;
        Kachori kachori=Kachori.getKachori();
        System.out.println(kachori.hashCode());
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(kachori);
        System.out.println(kachori.hashCode()+" Serialization done..");

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.ob"));
        Kachori k= (Kachori) objectInputStream.readObject();
        System.out.println(k.hashCode()+ " deserialization");

        //cloning

        Kachori k2=(Kachori) kachori.clone();
        System.out.println(k2.hashCode()+" cloned object");
    }

}
