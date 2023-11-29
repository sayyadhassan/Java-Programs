package com.company;

class Doubt{
        Doubt(){
        System.out.println("I am doubt of Doubt class");
    }
    Doubt(int a){
//            super();   // Useless
            System.out.println("I am a constructor of Doubt class with value :"+a);
    }
}
class Doubt1 extends Doubt{
    Doubt1(int a,int b){
//        super();      // Not neeed here
        super(a);
        System.out.println("I am a doubt of Doubt1 class with value :"+b);
    }
}
public class SMH_46_Ch10_2Constructor_In_Inheritance{
    public static void main(String[] args) {
        Doubt1 a = new Doubt1(2,4);
    }
}

/* If we define only parametrize constructor in Base Class and define another parametrize constructor in Derive Class
   and make the object of Derive Class then it will give error because in this case Base Class must have Default -
   Constructor otherwise we need to use super keyword to invoke parametrize constructor of Base Class
 */
