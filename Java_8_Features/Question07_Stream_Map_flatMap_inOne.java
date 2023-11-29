package Java_8_Features;

import java.util.Arrays;
import java.util.List;

class Employee2{
    String name;
    List<String> mobileNo;

    Employee2(String name,List<String> mobileNo){
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public List<String> getMobileNo() {
        return mobileNo;
    }

}
public class Question07_Stream_Map_flatMap_inOne {
    public static void main(String []args){
        Employee2 e = new Employee2("Javed", Arrays.asList("9878879","989448"));
        Employee2 e2 = new Employee2("Naveen", Arrays.asList("9878879","989448"));
        Employee2 e3 = new Employee2("Mahesh", Arrays.asList("9878879","989448"));

        List<Employee2> emp = Arrays.asList(e,e2,e3);

        // Map
        emp.stream().map(i-> i.getMobileNo()).forEach(i-> System.out.print(i+" "));
        System.out.println();

        emp.stream().forEach(System.out::println);  // Will print HashCode

        System.out.println();

        // flatMap
        emp.stream().flatMap(i-> i.getMobileNo().stream()).forEach(i-> System.out.print(i+" "));
                              // OR
//        emp.stream().flatMap(Collection::stream).forEach(i-> System.out.print(i+" "));   // Not applicabel here
    }
}
