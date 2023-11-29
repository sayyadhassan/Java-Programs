package com.company;
import javax.print.attribute.TextSyntax;
import java.io.IOException;
import java.util.Scanner;

public class SMH_Rough {
   public static void main(String []args) throws IOException
   {
       int age =9;

       if(age < 20){
           throw new ArithmeticException ("Age is less than 20");
       }
       System.out.println("heloo");
   }
}
