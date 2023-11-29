package Project;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    // Create new Teacher object

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    // return the id of teacher 
    public int getId(){
        return id;
    }

    // return the name of teacher 
    public String getName(){
        return name;
    }

    // return the salary of teacher 
    public int getSalary(){
        return salary;
    }

    // teacher salary will not remain same that's why we need to update 
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void receivedSalary(int salary){
        salaryEarned +=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString(){
        return "Teacher Name : "+name+" and Total Salary earned till now Rs "+salaryEarned;
    }
}
