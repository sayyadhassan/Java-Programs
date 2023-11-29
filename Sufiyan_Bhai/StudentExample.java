package Sufiyan_Bhai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// Question : Given list of the objects of Student Class. Sort and Find the heigest mobile no. of the student

class Student2 implements Comparable<Student2> {
    int roll_no;
    String name;
    int mob_no;

    @Override
    public String toString() {
        return "Student2{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", mob_no=" + mob_no +
                '}';
    }



    Student2(int roll_no, String name, int mob_no) {
        this.roll_no = roll_no;
        this.name = name;
        this.mob_no = mob_no;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public int getMob_no() {
        return mob_no;
    }

    @Override
    public int compareTo(Student2 o) {
        return this.mob_no - o.mob_no;
    }
}

public class StudentExample {
    public static void main(String[] args) {
        List<Student2> l = new ArrayList<>();

        Student2 s = new Student2(2, "Abu", 99);
        Student2 s2 = new Student2(3, "Javed", 97);
        Student2 s3 = new Student2(4, "Naveen", 94);
        Student2 s4 = new Student2(5, "Ayaj", 96);

        Collections.addAll(l, s, s2, s3, s4);
        System.out.println("Before Sorting");


        l.forEach(e -> System.out.println(e));


//        System.out.println(l);
        System.out.println("After Sorting");
        Collections.sort(l);
        Iterator<Student2> i2 = l.iterator();
        while (i2.hasNext()) {
            System.out.println(i2.next() + "  ");
        }

        Stream<Student2> stream = l.stream();
        Integer max = stream.max(Collections.reverseOrder()).get().mob_no;
//       Integer max =  stream.max(new Stuent_Impel_Comparatro()).get().mob_no;
//        Integer max =  stream.max(new Stuent_Impel_Comparatro()).collect(Collectors.toList());

       System.out.println(max);
    }

}
