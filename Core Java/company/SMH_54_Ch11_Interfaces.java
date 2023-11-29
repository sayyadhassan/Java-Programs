package com.company;

interface Bicycle{
    int a =34;
    void applyBrake();
    void speedUp();
}
interface BicycleHorn{
    void horn1();
    void horn2();

}

class SuperBicycle implements Bicycle,BicycleHorn{
    public void applyBrake(){
        System.out.println("Brake is applied");
    }
    public void speedUp(){
        System.out.println("Speed is Up");
    }
    public void horn1(){
        System.out.println("Pee Pee Pee Pee");
    }
    public void horn2(){
        System.out.println("Poo Poo Poo Poo");
    }
    public void horn3() {
        System.out.println("I am horn of SuperBicycle - Peeeee");
    }
}
public class SMH_54_Ch11_Interfaces {
    public static void main(String[] args) {
        SuperBicycle cycle = new SuperBicycle();
        cycle.applyBrake();
        cycle.speedUp();
        cycle.horn1();
        cycle.horn2();
        cycle.horn3();
        System.out.println(cycle.a);
        // We can't modify the properties/variabels in Interface as they are final
//        cycle.a=45;     // error
    }
}
