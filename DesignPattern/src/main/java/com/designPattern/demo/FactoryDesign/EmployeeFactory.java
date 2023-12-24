package com.designPattern.demo.FactoryDesign;

public class EmployeeFactory {

    public  static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDROID")){
          return new AnroidDeveloper();
        }
       else if(empType.trim().equalsIgnoreCase("BACKEND")){
            return new BackendDeveloper();
        }
        return null;
    }
}
