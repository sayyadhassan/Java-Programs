package Star_Pattern;

public class Question02_Star_Pattern {
    public static void main(String []args){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
