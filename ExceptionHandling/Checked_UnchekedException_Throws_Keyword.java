package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


class ThrowsKeyword{
    void unchekedException(){
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    void uncheckedException2() throws ArithmeticException{
        int a = 3/0;
        System.out.println(a);
    }
    void checkedException() throws FileNotFoundException{
        FileInputStream f = new FileInputStream("c:/abc.txt");
    }
}

public class Checked_UnchekedException_Throws_Keyword {
    public static void main(String []args){
        ThrowsKeyword exception = new ThrowsKeyword();
        // Uncheked Exception
        exception.unchekedException();
        System.out.println("Program Continue");

        // Unchecked Exception2
        try{
            exception.uncheckedException2();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Program Continue");

        // Cheked Exception
        try{
            exception.checkedException();
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found "+e.getMessage());
        }
    }
}
