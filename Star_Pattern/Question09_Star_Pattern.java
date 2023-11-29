package Star_Pattern;

public class Question09_Star_Pattern {
    public static void main(String []args){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                if(k>1  && k<i){
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
