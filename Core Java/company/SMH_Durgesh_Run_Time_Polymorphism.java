package com.company;

class Person2{
    public void showDetails(){       // Meth1
        System.out.println("Showing detail of Person");
    }  // Meth 1
    public void greet(){
        System.out.println("Hello Good Morning");
    }
}

class Employee2 extends Person2{
    public void showDetails(){      // Meth2
        System.out.println("Showing detail of Employee");
    }  // Meth 2
    public void greet2(){
        System.out.println("Namastey Good After Noon");
    }

}

class Ram{
    public void doWork(Person2 p){
        p.showDetails();
    }
}
public class SMH_Durgesh_Run_Time_Polymorphism {
    public static void main(String[] args) {
        Person2 a = new Person2();    // Here Meth1 will execute because we create object of Person2 class
        a.showDetails();

        Employee2 e = new Employee2(); // Meht2 will be invoked
        e.showDetails();

        Person2 b = new Employee2();  // Dynamic Method Dispatch, here Meth2 will execute because in refrence -
        b.showDetails();              //  variable of Person2, object is Employee2 class (exception)
        a.greet();                    // Valid , we can call the members of class Person2 only
//        a.greet2();                   // Invalid,  ,,         ,,           ,,             ,,


        Ram c = new Ram();   // Meth1 will call because we pass the refrence (a) of Class Person2 which contains the
        c.doWork(a);         // the object of class Person2

        c.doWork(b);        // Meth2 will execute because we pass the refrence(b) of Class Person2 which contains
                            // the object of class Employee2

    }
}
