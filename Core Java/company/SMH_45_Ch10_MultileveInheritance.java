package com.company;

//           Multilevel Inheritance

class Person1{               // Base Class
     int age;
     String name;
     long mobNo;

    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
    public long getMobNo() {
        return mobNo;
    }
}

class Student1 extends Person1{           // Derived Class
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

class Employee1 extends Student1{            // Derived class
    String department;
    int salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class SMH_45_Ch10_MultileveInheritance {
    public static void main(String[] args) {
        Employee1 s = new Employee1();
        s.setName("Hassan");
        s.setAge(23);
        s.setMobNo(9554004227l);
        s.setFatherName("Mohd. Abdul Noor");
        s.setRollno(3434);
        s.setAdd("Bhav pur");
        s.setDepartment("Administration");
        s.setSalary(45000);
        System.out.println("Name : "+s.getName());
        System.out.println("Age : "+s.getAge());
        System.out.println("Roll No. : "+s.getRollno());
        System.out.println("Father Name : "+s.getFatherName());
        System.out.println("Address : "+s.getAdd());
        System.out.println("Mobile No. : "+s.getMobNo());
        System.out.println("Department : "+s.getDepartment());
        System.out.println("Salary : "+s.getSalary());
    }

}
