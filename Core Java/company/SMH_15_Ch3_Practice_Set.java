package com.company;

public class SMH_15_Ch3_Practice_Set {
    public static void main(String []args)
    {
        // Question - 1
//        String name = "Sayyad Mohammad Hassan";
//        String name2 = name.toLowerCase();
//        System.out.println(name2);

        // Question - 2
        String name = "Sayyad Mohammad Hassan";
        String name2 = name.replace(' ','_');
        System.out.println(name2);

        // Question - 3
//        String letter = "Dear <|name|>, Thanks a lot";
//        System.out.println(letter);
//        letter = letter.replace("<|name|>","Hassan");
//        System.out.println(letter);

        // Question - 4
//        String name = "My name is  name is   Hassan";
//        int a = name.indexOf("  ");
//        int b = name.indexOf("   ");
//        System.out.println(a+"\n"+b);

        // Question - 5
        String letter = "Dear Hassan,\n\tThis Cource is very nice. I am surfing many chnnels and sites\n\tbut here I got exactly what I want...\n\t\t\t\t\t\t\t\f\f\f Thanks \f\f\f";
        System.out.println(letter);
    }
}
