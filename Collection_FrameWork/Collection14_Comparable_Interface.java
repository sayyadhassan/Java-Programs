package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
     private int roll_no;
     private String name;
     private String phone_no;

    @Override
    public int compareTo(Student o) {
        return this.roll_no - o.roll_no;
    }

     public Student(int roll_no, String name, String phone_no){
         this.roll_no = roll_no;
         this.name = name;
         this.phone_no = phone_no;
     }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public String getPhone_no() {
        return phone_no;

    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }

}

public class Collection14_Comparable_Interface {
    public static void main(String []args){
        ArrayList<Student> stu = new ArrayList<>();

        Student s1 = new Student(201,"Naveen","9898989654");
        Student s2 = new Student(209,"Jubair","34984983943");
        Student s3 = new Student(203,"Kamal","8984748837");

        Collections.addAll(stu,s1,s2,s3);
//        Collections.sort(stu);       // Will not work here
        System.out.println(stu);

        // Implements Comparable
        Collections.sort(stu);    // It will sort
        System.out.println(stu);

        Iterator<Student> it = stu.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
            // OR
        stu.forEach(System.out::println);
    }
}
