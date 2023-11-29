package Shradha.DSA;

public class DSA_02_Shradha_Recursion_TowerOfHannoi {
    public static void towerOfHannoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHannoi(n-1,src,dest,helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHannoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        int n = 3;   // No. of disk
        towerOfHannoi(n,"S","H","D");
        System.out.println("All disks are shifted");
    }
}