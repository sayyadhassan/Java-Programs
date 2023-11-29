package Star_Patterns;

public class Star_Pattern01 {
    public static void main(String []args){
        // Pattern 1
//        int n = 5;
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 2
//        for(int i=0;i<=5;i++){
//            for(int j=1;j<=5-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Pattern 3
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=1;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
