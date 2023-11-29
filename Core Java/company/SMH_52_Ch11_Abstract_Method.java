package com.company;

abstract class Parent{
    Parent(){
        System.out.println("I am a constructor of Parent Class");
    }
    void Hello(){
        System.out.println("Hello");
    }
    abstract void greet();
}

class Child extends Parent{
    void greet(){
        System.out.println("Good morning");
    }
}

class Child2 extends Parent{             // Make abstract class otherwise must need to be define greet function of Parent Class
    public void SMH(){
        System.out.println("Sayyad Mohammad Hassan");
    }
    void greet(){
        System.out.println("Namastey");
    }
}
public class SMH_52_Ch11_Abstract_Method {
    public static void main(String[] args) {
//        Parent p = new Parent();   // Not allowed, we can't create object of abstract class
        Child c = new Child();
//        Child2 c2 = new Child2();
//        c.greet();
//        c.Hello();
//        c2.greet();
//        c2.Hello();

    }
}
