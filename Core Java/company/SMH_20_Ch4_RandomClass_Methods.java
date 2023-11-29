package com.company;
import java.util.Random;

public class SMH_20_Ch4_RandomClass_Methods {
    public static void main(String[] args) {
        Random rn = new Random();
//        // Integer Random Number
//        int a = rn.nextInt();    // Long and Double also can be generated same but limits are not allowed
//        System.out.println(a);

//        // Integer Number with max limit
//        int b = rn.nextInt(9);
//        System.out.println(b);
//
//        // Integer Random Number in Limit max to min
//        int min = 20;
//        int max = 40;
//        int num = rn.nextInt(max - min) + min;
//        System.out.println(num);
//
        // Random Character
        char ch = (char)(rn.nextInt(26) + 'a');
        System.out.println(ch);
//
//        // Randomly True and False
//        boolean c = rn.nextBoolean();
//        System.out.println(c);
//
    }
}
