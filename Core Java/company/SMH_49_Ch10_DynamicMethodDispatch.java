package com.company;

import java.awt.image.SampleModel;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class SMH_49_Ch10_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();     // Allowed
//        SmartPhone smobj = new SmartPhone();    // Allowed
//        obj.on();
//        smobj.on();

        Phone obj = new SmartPhone();   // Yes it is Allowed
//        SmartPhone obj2 = new Phone();  // It is not Allowed
        obj.showTime();
        obj.on();
//        obj.music();   // Not Allowed
    }

}
