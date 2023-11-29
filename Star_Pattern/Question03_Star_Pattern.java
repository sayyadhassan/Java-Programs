package Star_Pattern;

public class Question03_Star_Pattern {
    public static void main(String []args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=2;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
