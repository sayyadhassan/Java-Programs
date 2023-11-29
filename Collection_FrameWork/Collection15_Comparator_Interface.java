package Collection_FrameWork;


import java.util.ArrayList;
import java.util.Collections;

public class Collection15_Comparator_Interface {
    public static void main(String []args){
        ArrayList<Collection15_A_Employee_Comparator> emp1 = new ArrayList<>();

        Collection15_A_Employee_Comparator e1 = new Collection15_A_Employee_Comparator(307,"Aqib","484995849");
        Collection15_A_Employee_Comparator e2 = new Collection15_A_Employee_Comparator(302,"Javed","848485998");
        Collection15_A_Employee_Comparator e3 = new Collection15_A_Employee_Comparator(305,"Zunaid","948958595");

        Collections.addAll(emp1,e1,e2,e3);

        //  Logic 1: Sort Employee Id
        Collections.sort(emp1,new Collection15_B_Emp_Id_Sort_Comparator());
        System.out.println(emp1);


        ArrayList<Collection15_A_Employee_Comparator> emp2 = new ArrayList<>(emp1);

        // Logic 2: Sort Employee name
        Collections.sort(emp2,new Collection15_C_Emp_Name_Sort_Comparator());
        System.out.println(emp2);
    }
}