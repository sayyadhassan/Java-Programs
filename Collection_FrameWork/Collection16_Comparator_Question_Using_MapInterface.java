package Collection_FrameWork;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Set.of;

class Employee{
    String name;
    List<String> mobNo;

    Employee(String name,List<String> mobNo){
        this.name = name;
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public List<String> getMobNO() {
        return mobNo;
    }
}

class empId_Sort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1,Employee o2){
        return o1.getName().compareTo(o2.getName());
    }
}

public class Collection16_Comparator_Question_Using_MapInterface {
    public static void main(String []args){
        Collection<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee("Javed",Arrays.asList("980877","988766"));
        Employee e2 = new Employee("Maroof",Arrays.asList("930877","968766"));
        Employee e3 = new Employee("Farook",Arrays.asList("900877","978766"));

        Collections.addAll(empList,e1,e2,e3);

        System.out.println("-----------Before Sorting");
        System.out.println(empList);

        System.out.println("------------After Sorting");
//        Collections.sort(empList,new empId_Sort());


    }
}
