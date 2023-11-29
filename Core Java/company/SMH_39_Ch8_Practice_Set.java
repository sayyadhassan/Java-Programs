package com.company;

//class Employee1{
//    int salary;
//    String name;
//    public void setName(String n){
//        name = n;
//    }
//    int getSalary(){
//        return salary;
//    }
//    String getName(){
//        return name;
//    }
//
//}

//class Cellphone{
//    public void ring(){
//        System.out.println("Phone is ringing");
//    }
//    public void vibrate(){
//        System.out.println("Phone is vibrating");
//    }
//    public void call(){
//        System.out.println("Calling to Naveen");
//    }
//}

//class Square{
//    public float area(float a){
//        return a*a;
//    }
//    public float perimeter(float a){
//        return 4*a;
//    }
//}

class Rectangle{
    public int area(int l, int w){
        return l*w;
    }
    public int perimeter(int l, int w){
        return 2*l*w;
    }
}

public class SMH_39_Ch8_Practice_Set {
    public static void main(String[] args) {
        // Question - 1
//        Employee1 hassan = new Employee1();
//        hassan.salary = 56;
//        hassan.setName("Sayyad Mohammad Hassan");
//        System.out.println(hassan.getSalary());
//        System.out.println(hassan.getName());

        // Question - 2
//        Cellphone vivo = new Cellphone();
//        vivo.ring();
//        vivo.vibrate();
//        vivo.call();

        // Question - 3
//        float side = 3.0f;
//        Square s = new Square();
//        System.out.println("Area of circle is : "+s.area(side));
//        System.out.println("Perimenter of circle is : "+s.perimeter(side));
//        System.out.printf("Perimenter of circle is : %.0f",s.perimeter(side));  // It will print without decimal

        // Quesion - 4
        int l = 3;
        int w = 8;
        Rectangle r = new Rectangle();
        System.out.println("Area of rectangle is : "+r.area(l,w));
        System.out.println("Perimeter of rectangle is : "+r.perimeter(l,w));

    }
}
