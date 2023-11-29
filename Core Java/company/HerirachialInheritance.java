package com.company;

import javax.security.auth.Subject;

// Herarichal Inheritance
class PersonalInformation{
    String name;
    int age;
    int mobile_no;
    String address;
}

class Students extends PersonalInformation{
    int student_Id;
    String clas;

    Students(){
        System.out.println("             This is Students Information ");
    }

    void insertDetail(String name,int age,int mobile_no,String address,int student_Id,String clas){
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.address = address;
        this.student_Id = student_Id;
        this.clas = clas;
    }

    void print_Students_Details(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(mobile_no);
        System.out.println(address);
        System.out.println(student_Id);
        System.out.println(clas);
    }
}

class TeachersDetails extends PersonalInformation{
    int teacher_Id;
    String sub;

    TeachersDetails(){
        System.out.println("        This is Teachers Details ");
    }

    void insertDetail(String name,int age,int mobile_no,String address,int teacher_Id,String sub){
        this.name = name;
        this.age = age;
        this.mobile_no = mobile_no;
        this.address = address;
        this.teacher_Id = teacher_Id;
        this.sub = sub;
    }

   void print_Teacher_Details(){
       System.out.println(name);
       System.out.println(age);
       System.out.println(mobile_no);
       System.out.println(address);
       System.out.println(teacher_Id);
       System.out.println(sub);
   }
}
public class HerirachialInheritance {
    public static void main(String[] args) {
        TeachersDetails t = new TeachersDetails();
        t.insertDetail("Ravi Sir",28,939399,"Farenda",303,"Math");
        t.print_Teacher_Details();

        Students  s = new Students();
        s.insertDetail("Ravi Sir",28,939399,"Farenda",303,"Math");
        s.print_Students_Details();
    }
}
