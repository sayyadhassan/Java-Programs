package com.company;

public class SMH_16_Ch4_Conditional {
    public static void main (String []args)
    {
        // If-Else-Statement

        int age = 20;
        if(age>18)                              /* Without curly braces only one line can be accessible under
                                                   conditional statement   */
            System.out.println("You can do");
        else{
            System.out.println("You can't do");
        }

        // Nested If-Statement

        String name = "Boy";
        int a = 20;
        if(name=="Boy"){
            if(a>20)
                System.out.println("You can cook");
            else
                System.out.println("You can't cook");
        }
        else{
            System.out.println("Girls can't cook");
        }
    }
}
