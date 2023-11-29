package com.company;

abstract class Person4{
    public void showDetails(String name,long mobNo,String address){
        System.out.println("Name is : "+name);
        System.out.println("Mob No. is : "+mobNo);
        System.out.println("Address is : "+address);
    }
}
class Student3 extends Person4{
    Student3(){
        System.out.println("       Student Details");
    }
    public void showStudentDetails(int id,String clas,int age){
        System.out.println("ID is : "+id);
        System.out.println("Class is : "+clas);
        System.out.println("Age is : "+age);
    }
}
class Teacher extends Person4{
    Teacher(){
        System.out.println("       Teacher Details");
    }
    public void showTeacherDetals(String subject,int age,int id){
        System.out.println("Department is : "+subject);
        System.out.println("Age is : "+age);
        System.out.println("Id is : "+id);
    }
}
public class SMH_53_Ch11_Abstract_Class {
    public static void main(String[] args) {
//        Person4 p4 = new Person4();   // Can't create the object of Person 4 class because it's abstract

        Student3 s = new Student3();
        s.showDetails("Hassan",955400412,"Bhavpur");
        s.showStudentDetails(23,"9",23);

        Person4 p = new Student3();
        p.showDetails("Jubair",88797899,"Dhane Pur");
//        p.showStudentDetails(34,10,26);   Refrence Variable of Abstract Class can call only those metods and variable which is in Abstract Class

        System.out.println();

        Teacher t = new Teacher();
        t.showDetails("Javed",98799898,"Gonda");
        t.showTeacherDetals("Math",32,45);
    }
}
