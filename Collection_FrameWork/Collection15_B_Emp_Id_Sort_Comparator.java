package Collection_FrameWork;

import java.util.Comparator;

public class Collection15_B_Emp_Id_Sort_Comparator implements Comparator<Collection15_A_Employee_Comparator> {

    @Override
    public int compare(Collection15_A_Employee_Comparator o1, Collection15_A_Employee_Comparator o2) {
        return o1.getEmp_Id() - o2.getEmp_Id();
    }
}
