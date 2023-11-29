package Rough;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

class Employee{
    int emp_id;
    String name;
    List<String> mob_no;

    Employee(int emp_id,String name,List<String> mob_no){
        this.emp_id = emp_id;
        this.name = name;
        this.mob_no = mob_no;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public String getName(){
        return name;
    }
    public List<String> mob_no(){
        return mob_no;
    }
}

public class Rough_Stream_API extends Thread {
   public static void main(String []args)  {
       Employee emp = new Employee(202,"Rakesh",Arrays.asList("98399339","93984949"));
       Employee emp2 = new Employee(203,"Vinod",Arrays.asList("93839939","9393939"));
       Employee emp3 = new Employee(204,"Javed",Arrays.asList("93939029","8383838"));

       List<Employee> list = Arrays.asList(emp,emp2,emp3);

       list.stream().map(e-> e.getEmp_id()).max(Comparator.comparing(Integer :: intValue)).ifPresent(System.out::println);
   }
}
