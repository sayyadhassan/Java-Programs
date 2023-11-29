package ExceptionHandling;

//           UncheckedException, NullPointerException
public class UncheckedException_one {
    public static void main(String[] args) {
        
        // Default throw and default catch
//        String s=null;
//        System.out.println("Length of string is : "+s.length());
//        System.out.println("Line after exception");


        // Default throw and  our catch
//        try{
//            String s =null;
//            System.out.println("Length of string : "+s.length());
//        }
//
//        catch (NullPointerException e){
//            System.out.println("Exception : "+e.getMessage());
//        }


        // Our throw and default catch
//        int balance = 3000;
//        int currBalance = 5000;
//        if(currBalance > balance)
//            throw new NullPointerException("Current Balace is greater than total balance");


        // Our throw and our catch
        int balance = 3000;
        int currBalance = 5000;
        try {
            if (currBalance > balance)
                throw new NullPointerException("Current Balace is greater than total balance");
        }

        catch(NullPointerException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
