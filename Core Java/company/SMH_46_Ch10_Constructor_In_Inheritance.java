package com.company;

class Base{
    Base(){
        System.out.println("I am a constructor of Base Class");
    }
    Base(int a){
        System.out.println("I am a constructor of Base Class with value a : "+a);
    }
}
class Derived extends Base{
        Derived(){
        super(5);
        System.out.println("I am a constructor of Derived Class ");
    }
    Derived(int a, int b){
        super(a);
        System.out.println("I am a constructor of Derived Class with value b : "+b);

//        super(a);  // Error, super keyword in constructor not after print statement;
    }
}

class ChildDerived extends Derived{
    ChildDerived(int a,int b,int c){
        super(a,b);
        System.out.println("I am a constructor of ChildDerived Class with value c : "+c);
    }
}

public class SMH_46_Ch10_Constructor_In_Inheritance {
    public static void main(String[] args) {
//        Derived d = new Derived();
//        Derived d = new Derived(4,5);
//        ChildDerived c = new ChildDerived();
        ChildDerived c = new ChildDerived(7,8,9);
    }
}
