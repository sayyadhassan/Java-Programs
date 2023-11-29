package Java_8_Features;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Question03_Stream_flatMap {
    public static void main(String []args){
        List<Integer> list = List.of(2,4,5,6);
        List<Integer> list2 = List.of(9,0,2);
        List<Integer> list3 = List.of(8,4,3);

        Stream.of(list,list2,list3).flatMap(Collection :: stream).forEach(System.out::println);

    }
}
