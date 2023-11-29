package Star_Pattern;

public class Question11_Star_Pattern {
    public static void main(String []args){

        // Square Pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=2 && j>=2 && i<= 4 && j<=4){
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        // Rectangel Pattern
        for(int i=1;i<=5;i++){
            for(int j=1;j<=8;j++){
                if(i>=2 && j>=2 && i<=4 && j<=7){
                    System.out.print("  ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
