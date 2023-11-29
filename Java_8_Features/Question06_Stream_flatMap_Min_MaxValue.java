package Java_8_Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question06_Stream_flatMap_Min_MaxValue {
    public static void main(String []args){
        List<Integer> list = Arrays.asList(2,4,5,9,3,7);

        list.stream().min(Comparator.comparing(Integer :: intValue)).ifPresent(e-> System.out.println("Minimum Value "+e));

        list.stream().max(Comparator.comparing(e-> e.intValue())).ifPresent(e-> System.out.println("Maximunm value "+e));
    }
}
