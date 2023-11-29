package com.company;

                   // Multilevel Inheritance

class Animals{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dogs extends Animals{
    void bark(){
        System.out.println("Barking...");
    }
}

class puppy extends Dog{
    void cry(){
        System.out.println("Crying...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.cry();
    }
}
