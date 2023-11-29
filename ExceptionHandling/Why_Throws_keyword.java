package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class A{
    void showUnchkedException()  {
        String s = null;
        System.out.println(s.length());
        System.out.println("Program Continue Uncheked Exception");   // will not execute, control throw in catch block
    }

    void showCheckedException() throws FileNotFoundException{
        FileInputStream f = new FileInputStream("c/: Hello.java");
        System.out.println("Program Continue Checked Exception");     // will not execute, control throw in catch block
    }

    void programContinue(){
        System.out.println("Program Continue");
    }
}
public class Why_Throws_keyword {
    public static void main(String []args){
        A obj = new A();
        // Uncheked Exception
        try {
            obj.showUnchkedException();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        // Checked Exception
        try{
            obj.showCheckedException();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        obj.programContinue();
    }
}
