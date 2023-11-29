package com.company;

           //           Single Inheritance

class Person{               // Base Class
    int age;
    String name;
    long mobNo ;
    public void setName(String name) {this.name = name;}
    public String getName() {
        return name;
    }
    public void setAge(int nge) {
        age = nge;
    }
    public int getAge() {
        return age;
    }
    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
    public long getMobNo() {
        return mobNo;
    }
}

class Student extends Person{           // Derived Class
    String fatherName;
    int rollno;
    String add;
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }
}

public class SMH_45_Ch10_SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Hassan");
        s.setAge(23);
        s.setMobNo(9554004227l);
        s.setFatherName("Mohd. Abdul Noor");
        s.setRollno(3434);
        s.setAdd("Bhav pur");
        System.out.println("Name : "+s.getName());
        System.out.println("Age : "+s.getAge());
        System.out.println("Roll No. : "+s.getRollno());
        System.out.println("Father Name : "+s.getFatherName());
        System.out.println("Address : "+s.getAdd());
        System.out.println("Mobile No. : "+s.getMobNo());


        Student s1 = new Student();
        s1.setName("Naveen");
        s1.setAge(26);
        s1.setMobNo(8299701243l);
        s1.setFatherName("Jagh Dambba");
        s1.setRollno(300);
        s1.setAdd("Lohra Joat");
        System.out.println("Name : "+s1.getName());
        System.out.println("Age : "+s1.getAge());
        System.out.println("Roll No. : "+s1.getRollno());
        System.out.println("Father Name : "+s1.getFatherName());
        System.out.println("Address : "+s1.getAdd());
        System.out.println("Mobile No. : "+s1.getMobNo());

    }

}
