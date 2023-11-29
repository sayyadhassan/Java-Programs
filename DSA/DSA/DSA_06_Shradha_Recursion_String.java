package Shradha.DSA;

// Question : Move all 'x' to the end of the string     (49:00 video time)
// Example :   " axbcxxd" ->  "abcdxxx"

public class DSA_06_Shradha_Recursion_String {
    public static void moveAllX(String str,int index,int count,String newString){
        if(index == str.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.println("New String : "+newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveAllX(str,index+1,count,newString);
        }
        else {
            newString += currChar;
            moveAllX(str,index+1,count,newString);
        }
    }

    public static void main(String[] args) {
        String str ="axbcxxd";
        System.out.println("Original String : "+str);
        moveAllX(str,0,0,"");
//        moveAllX(str,2,0,"");
    }
}
