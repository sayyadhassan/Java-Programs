package com.company;

public class SMH_14_Ch3_Escape_Sequence {
    public static void main (String []args)
    {
        // 1 - \t
        String name1 = "1: I am\tSayyad Mohammad Hassan";
        System.out.println(name1);

        // 2 - \b
        String name2 = "2: I am\bSayyad Mohammad Hassa";
        System.out.println(name2);

        // 3 - \n
        String name3 = "3: Sayyad \nMohammad Hassan";
        System.out.println(name3);

        // 4 - \r
        String name4 = "4: Sayyad\r Mohammad Hassan";    // Print the string just after itself
        System.out.println(name4);

        // 5 - \f
        String name5 = "5: Sayyad \f Mohammad Hassan";
        System.out.println(name5);

        // 6 - \'
        String name6 = "6: Sayyad \' Mohammad Hassan";
        System.out.println(name6);

        // 7 - \"
        String name7 = "7: Sayyad \" Mohammad Hassan";
        System.out.println(name7);

        // 8 - \\
        String name8 = "8: Sayyad \\ Mohammad Hassan";
        System.out.println(name8);
    }
}
