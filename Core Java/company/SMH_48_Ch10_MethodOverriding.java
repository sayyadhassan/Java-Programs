package com.company;

class A{                     // Parent Class
    public int hassan(){
        return 9;
    }
    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{                // Child Class
    public void method2(){
        System.out.println("I am method 2 of class B");
    }
}

class C extends B{
    public void method2(){
        System.out.println("I am method 2 of class C");
    }
}
public class SMH_48_Ch10_MethodOverriding{
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();

        C c=new C();
        c.method2();
    }
}

