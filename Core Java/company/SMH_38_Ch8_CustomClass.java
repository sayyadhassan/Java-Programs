package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
    }

    public int getSalry(){
        return salary;
    }

}


class SMH_38_Ch8_CustomClass {
    public static void main(String[] args) {
        // Setting attributes for Hassan
        Employee hassan = new Employee();
        hassan.id = 203;
        hassan.salary = 54;
        hassan.name ="Sayyad Mohammad Hassan";
        hassan.printDetails();
        System.out.println("My salary is : "+hassan.getSalry());


        // Setting attributes for Naveen
        Employee naveen = new Employee();
        naveen.id = 204;
        naveen.salary = 9;
        naveen.name ="Naveen Tiwari";
        naveen.printDetails();
        int salary = naveen.getSalry();
        System.out.println("My salary is : "+salary);


    }
}
