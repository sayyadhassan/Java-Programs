package com.company;

public class SMH_17_Ch4_Logical_Operator {
    public static void main (String []args)
    {
        // Logical AND
        boolean a = true;
        boolean b = false;
        boolean c = true;
    /*    if(a && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a && b && c){              /* Precedence is Left to Right, first of all check the condition of a and b
                                         then after which result will come check with c
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }                                                  */

        // Logical OR
        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        if(a || b ||c){              // Precedence is Left to Right, first check a and b then whatever is the result check with c
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        // Logical NOT
        boolean x = true;
        boolean y = false;
        System.out.println(!a);
        System.out.println(!b);
    }
}
