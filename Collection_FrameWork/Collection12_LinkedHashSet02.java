package Collection_FrameWork;

import java.util.LinkedHashSet;

public class Collection12_LinkedHashSet02 {
    public static void main(String []args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Arun");
        lhs.add("Javed");
        lhs.add("Farook");
        lhs.add("Arun");

        System.out.println(lhs);

//        Iterator<String> it = lhs.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        lhs.forEach(System.out::println);
    }
}
