package Sufiyan_Bhai;

import java.util.Comparator;

public class Stuent_Impel_Comparatro implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getMob_no() - o2.mob_no;
    }
}
