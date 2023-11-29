package com.company;

class MultipleSynchronized{
    void universityDetails(){
        System.out.println("I am university detail");

    }
    void studentDetails(int rollNo,String name){
        System.out.printf("I am student detail with roll no. = %d and naem = %s ",rollNo,name);

    }
}

public class MultipleMehodsBy_runByThreadClass extends Thread {
    static MultipleSynchronized obj = new MultipleSynchronized();
    int roll_no;
    String name;
    public void run(){
        obj.universityDetails();
        obj.studentDetails(roll_no,name);
    }
    public static void main(String []args){
        MultipleMehodsBy_runByThreadClass student_one = new MultipleMehodsBy_runByThreadClass();
        student_one.roll_no =5;
        student_one.name= "Hassan";
        student_one.start();

        MultipleMehodsBy_runByThreadClass student2 = new MultipleMehodsBy_runByThreadClass();
        student2.roll_no =6;
        student2.name= "Naveen";
        student2.start();
    }
}

