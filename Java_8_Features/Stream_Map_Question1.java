package Java_8_Features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Question - Find the length of the String
//class Emplyee{
//    List<String> name = List.of("Javed Ashraf","Suresh Kamlapuri","Hassan Saikh","Mohammad Farhan");
////    name.add("Lareb");   // why String method is not allow here
//    void getFirstName(){
//        List<String> newList = new ArrayList<>();
//        for(String e : name){
//            System.out.println(e.);
//        }
//    }
//}

public class Stream_Map_Question1 {
    public static void main(String []args){
        List<String> list = List.of("Javed Khan","Ramesh Yadav","Kamlesh Verma","Pankaj Mishra");
        Stream<String> stream = list.stream();
        List<Integer> newList2 = stream.map(e-> e.length()).collect(Collectors.toList());
        System.out.println(newList2);
//                        OR
        list.stream().map(String :: length).forEach(e-> System.out.print(e+" "));
        System.out.println();
//                       OR
        List<Integer> newList = list.stream().map(e-> e.length()).collect(Collectors.toList());
        System.out.print(newList+" ");
    }
}
