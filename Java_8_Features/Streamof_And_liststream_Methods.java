package Java_8_Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamof_And_liststream_Methods {
    public static void main(String[] args) {

        // Stream object using Stream.of() method
        Integer []arr = {4,3,0,9,8};
        Stream<Integer> newStream = Stream.of(arr);
        newStream.forEach(e-> System.out.print(e+" "));

        System.out.println();

        Integer []list = {2,3,4,5,6,9};
        Stream<Integer> stream = Stream.of(list);
        List<Integer> newStream2 = stream.filter(e-> e>4).collect(Collectors.toList());
        System.out.print(newStream2+" ");

        System.out.println();

        // Stream object using list.stream() method
        List<Integer> list3 =List.of(2,4,5,6,89,9);
        Stream<Integer> stream3 = list3.stream();
        stream3.forEach(System.out::println);


        System.out.println();

        list3.stream().forEach(e-> System.out.print(e+" "));

        System.out.println();

        List<Integer> newStream3 = list3.stream().filter(e-> e>4).collect(Collectors.toList());
        System.out.println(newStream3);

    }
}
