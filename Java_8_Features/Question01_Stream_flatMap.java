package Java_8_Features;

import java.util.*;
import java.util.stream.Collectors;

public class Question01_Stream_flatMap {
    public static void main(String []args){
        Map<String, List<String>> nameAndMobileNo = new HashMap<>();
        nameAndMobileNo.put("Javed", Arrays.asList("9556004220","45959499859"));
        nameAndMobileNo.put("Farhan", Arrays.asList("9556004297","43959499859"));
        nameAndMobileNo.put("Umesh", Arrays.asList("95456004227"));
        nameAndMobileNo.put("Manoj", Arrays.asList("9356004227","43959499859"));

        System.out.println("         Before Flatening");
        System.out.println(nameAndMobileNo);

        // Using flatMap() method
        System.out.println("          After Flatening");
        List<String> phone = nameAndMobileNo.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(phone);

        // Using forEach Loop
        System.out.println("-------------Using forEach Loop--------");
        nameAndMobileNo.values().stream().forEach(e-> System.out.print(e+" "));

        // Using map
        System.out.println("-----------Using map---------");
        nameAndMobileNo.values().stream().map(Collection::stream).forEach(e-> System.out.print(e+" "));   // Will print Hash Code

    }
}
