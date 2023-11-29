package Access_Modifier01;

class A{
    public void display(){
        System.out.println("I am public display meth1 of class A of package-Access_Modifier01");
    }

    public void display2(){
        System.out.println("I am default display meth2 of class A of package-Access_Modifier01");
    }

    protected void display3(){
        System.out.println("I am protected display meth3 of class A of package-Access_Modifier01");
    }

    private void display4(){
        System.out.println("I am private display meth4 of class A of package-Access_Modifier01");
    }
}
class B extends A{
    void display5(){
        System.out.println("I am default display meth5 of class B of package-Access_Modifier01");
    }

    //can't be accessed any method here without main method
//    A obj=new A();
//    obj.display();
}

//can't be accessed any method here without main method
//class Other{
//    A obj2 = new A();
//    obj2.display2();
//}


public class Access_Modifier1 {
    public static void main(String []args){
        B obj = new B();
        obj.display();
        obj.display2();
//        obj.display3();
//        obj.display4();     It can't be accessed here due to protected
        obj.display5();
    }
}
