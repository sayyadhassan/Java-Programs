package Rough;

interface MyInterface{
    int sum(int a,int b);
}

class myInterImplementation implements MyInterface{
    public int sum(int a,int b){
        return a+b;
    }
}
public class Rough_Functional_Interface{
    public static void main(String[] args) {
        MyInterface i = (a,b)-> {
            return a + b;
        };

        System.out.println( i.sum(5,6));
    }
}
