package Java_8_Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


// Question- Print Maximum and Minimum Salary of the Employee
class Employee{
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    int empId;
    String name;
    int salary;
    String mobileNo;

    Employee(int empId,String name,int salary,String mobileNo){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.mobileNo = mobileNo;
    }

}
public class Question05_Stream_Max_MinSalary {
    public static void main(String []args){
        Employee e = new Employee(22,"Javed",40000,"9898787");
        Employee e2 =  new Employee(23,"Naveen",30000,"9838849");
        Employee e3 = new Employee(24,"Jubair",50000,"9834534");

        List<Employee> list = Arrays.asList(e,e2,e3);

        list.stream().map(i-> i.getSalary()).min(Comparator.comparing(Integer :: intValue)).ifPresent(i-> System.out.println("Minimum Salary "+i));
    }
}
