package Java_8_Features;

import java.util.HashMap;
import java.util.Map;

public class Stream_values_keySet_entrySet_using_Map {
    public static void main(String []args){
        Map<String,String> mp = new HashMap<>();
        mp.put("Javed","987898678");
        mp.put("Naved","9854543");
        mp.put("Rakesh","7896545");

        mp.values().stream().forEach(System.out::println);
        mp.keySet().stream().forEach(System.out::println);
        mp.entrySet().stream().forEach(System.out::println);
    }
}
