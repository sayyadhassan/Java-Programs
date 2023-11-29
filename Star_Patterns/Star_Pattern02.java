package Star_Patterns;

public class Star_Pattern02 {
    public static void main(String []args){
        // Pattern 1
//      for(int i=1;i<=5;i++){
//          for(int j=4;j>=i;j--){
//              System.out.print(" ");
//          }
//          for(int k=1;k<=i;k++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }

        // Pattern 2
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int k=5;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 3
//        for(int i=1;i<=5;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//            }
//            for(int k=4;k>=i;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 4
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        // Pattern 5
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 6
        for(int i=1;i<=5;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--){
                System.out.print("*");
            }
            for(int l=4;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
