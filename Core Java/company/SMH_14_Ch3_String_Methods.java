package com.company;

public class SMH_14_Ch3_String_Methods {
    public static void main(String []args)
    {


      // 1 - name.length()
//        String name1 = "Hassan";
//        System.out.println(name1.length());

        // 2 - name.toLowerCase()
//        String name2 = "HASSAN";
//        System.out.println(name2.toLowerCase());

        // 3 - name.toUpperCase()
//        String name3 = "Hassan";
//        System.out.println(name3.toUpperCase());

        // 4 - name.trim()
//        String name4 = "    Sayyad     ";
//        String name ="Mohammad";
//        System.out.print(name4);
//        System.out.println(name);
//        System.out.print(name4.trim());
//        System.out.println(name);

        // 5 - name.substring()
        String name5 = "Hassan";
//        System.out.println(name5.substring(2));  // Limit(2) included
//        System.out.println(name5.substring(3));
//        System.out.println(name5.substring(5));

        // 6 - name.substring()
//        String name6 = "Hassan";
//        System.out.println(name6.substring(0,4));   // Lower limit(0) included and Upper limit(4) exluded
//        System.out.println(name6.substring(2,5));   // Lower limit(0) included and Upper limit(4) exluded

        // 7 - name.replace('d','s')
//        String name7 = "Haddan";
//        System.out.println(name7);
//        System.out.println(name7.replace('d','s'));

        // 8 - name.startsWith("Ha")
//        String name8 = "Hassn";
//        System.out.println(name8.startsWith("Ha"));
//        System.out.println(name8.startsWith("ha"));

        // 9 - name.endsWith("san)
//        String name9 = "Hassan";
//        System.out.println(name9.endsWith("san"));
//        System.out.println(name9.endsWith("San"));

        // 10 - name.charAt(3)
//        String name10 = "Sayyad";
//        System.out.println(name10.charAt(5));
//        System.out.println(name10.charAt(3));

        // 11 - name.indexOf("s")
//        String name11 = "Hassan";
//        System.out.println(name11.indexOf("s"));
//        System.out.println(name11.indexOf("sa"));    // Searching from starting and print the first occurance index no.

        // 12 - name.indexOf("s",3)
//        String name12 = "Hassanhassan";
//        System.out.println(name12.indexOf("s",4));

        // 13 - name.lastIndexOf("san")
//        String name13 = "Hassanhassan";
//        System.out.println(name13.lastIndexOf("an"));   // Searching from last but consider the index no. from 0
//        System.out.println(name13.lastIndexOf("n"));

        // 14 - name.lastIndexOf("an",7)
        String name14 = "Hassanhassan";
        System.out.println(name14.lastIndexOf("s",6));   // Searching from last, from starting to given index no.
                                                                     // and return last occurance index of string
//        System.out.println(name14.lastIndexOf("an",6));
//        System.out.println(name14.lastIndexOf("ah",7));

        // 15 - name.equals("Hassan)
//        String name15 = "Hassan";
//        System.out.println(name15.equals("Hassan"));
//        System.out.println(name15.equals("hassan"));
//        System.out.println(name16.equalsIgnoreCase("hAssAn"));


        // 16 - name.equalsIgnoreCase()
//        String name16 = "Hassan";
//        System.out.println(name16.equalsIgnoreCase("hassan"));
//        System.out.println(name16.equalsIgnoreCase("hAssAn"));





    }
}
