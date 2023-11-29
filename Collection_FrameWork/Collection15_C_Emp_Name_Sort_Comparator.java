package Collection_FrameWork;

import java.util.Comparator;

public class Collection15_C_Emp_Name_Sort_Comparator implements Comparator<Collection15_A_Employee_Comparator> {
    @Override
    public int compare(Collection15_A_Employee_Comparator o1, Collection15_A_Employee_Comparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
