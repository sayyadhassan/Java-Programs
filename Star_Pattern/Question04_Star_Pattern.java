package Star_Pattern;

public class Question04_Star_Pattern {
    public static void main(String []args){
        for(int i=0;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }

            for(int l=1;l<=i;l++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
