package Java_8_Features;

@FunctionalInterface
interface MyInterface {
    void sayHello();
}

class MyInterfaceImpl implements MyInterface{
    @Override
    public void sayHello(){
        System.out.println("Implemention of Functional Interface using serprate Class");
    }
}

@FunctionalInterface
interface SumInter {
    int sum(int a,int b);
}

public class LearnLambda_with_Functional_Interface {
    public static void main(String []args){
        System.out.println("                  Lambda Expression  ");

        // Object of seprate class
        MyInterface myInter = new MyInterfaceImpl();
        myInter.sayHello();

        // Anomyous Class
        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("This is my First Anomyous Class implementing Functional Interface");
            }
        };
        i.sayHello();

        MyInterface i2 = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("This is my second Anomyous Class implementing Functional Interface");
            }
        };
        i2.sayHello();

        // Implementing Functional Interface with the help of Lambda
        MyInterface i3 = ()->{
            System.out.println("This is first time using Lambda Expresssion");
        };
        i3.sayHello();

        MyInterface i4 = () -> System.out.println("This is second time using Lambda Expression");
        i4.sayHello();

        // Using SumInter Functional Interface
        SumInter s = (int a,int b) ->{
           return (a + b);
        };
        System.out.println("Sum using functional Interface is : "+s.sum(4,9));

        SumInter s2 = (a,b) -> a + b;
        System.out.println("Sum2 using function Interface is : "+s2.sum(9,3));
    }
}

// Functional Interface can be used
// 1. create a seprate class and implement this Interface
// 2. using anamayous class, here not required to create sepreate class to implements Functionla Interface
// 3. using Lmbda Expression
