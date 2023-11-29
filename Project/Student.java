package Project;
// Keeping the track of students fees,name,grade and fees paid

public class Student {

    private int id;
    private String name;
    private int grade;
    public int feesPaid;
    // private int feesTotal;

    // To Create a new Student by initializing these records which will be of every students
    public Student(int id,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        this.feesPaid=0;
        // this.feesTotal = 110000;
    }
    
    // Student id,name and Total fees will remain constaint for every students but grade will not remain same 
    // all time that's why we need to update
    public void setGrade(int grade){
        this.grade=grade;
    }

    // return the grade of student 
    public int getGrade(){
        return grade;
    }
    
    // return id of student 
    public int getId(){
        return id;
    }

    // return the name of Student 
    public String getName(){
        return name;
    }

    // when a student pay fees then update the fees of student 
    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    @Override
    public String toString(){
        return "Student Name : "+name+" and Total Fees paid till now Rs "+feesPaid;
    }
}
