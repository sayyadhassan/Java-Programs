package com.company;

class CompanyDetails{  // Base Class
    CompanyDetails(){
        System.out.println("Welcome in NUCLEOUS SOFTWARE TECHNOLOGY");
    }
    String Address;
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

}

class Employeee extends CompanyDetails {  // Derived Class of Base Class
    String name;
    long mobNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
}

class Manager extends CompanyDetails{  // Derived Class of Base Class
    String Name;
    long mobNo;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
}
public class SMH_45_Ch10_Hierarchical_Inheritance {
    public static String department;
    public static void main(String[] args) {
        Employeee e2 = new Employeee();
        e2.setName("Abhisek");
        e2.setAddress("Gonda");
        e2.setMobNo(0234323432);
        department = "Development";
        System.out.println(e2.getName());
        System.out.println(e2.getAddress());
        System.out.println(e2.getMobNo());
        System.out.println(department);

        System.out.println();

        Manager m2 = new Manager();
        m2.setName("Anil");
        m2.setAddress("Gonda");
        m2.setMobNo(233323433);
        department="Networking";
        System.out.println(m2.getName());
        System.out.println(m2.getAddress());
        System.out.println(m2.getMobNo());
        System.out.println(department);
    }
}
