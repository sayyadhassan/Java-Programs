package com.company;

class Person3{
    public void ShowDetail(){       // Meth1
        System.out.println("Showing details of Person3");
    }
    public void ShowDetail(String s){   // Meth2
        System.out.println("Showing details of "+s);
    }
}
public class SMH_Durgesh_Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Person3  p = new Person3();
        p.ShowDetail();                   // Meth1 will execute
        p.ShowDetail("Hassan");        // Meth2 will execute
    }
}
