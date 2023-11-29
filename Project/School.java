package Project;

import java.util.List;

public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //  object School is created 
    public School(List<Teacher> teachers,List<Student> students){
        this.teachers=teachers;
        this.students=students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    // returns the teachers in the school 
    public List<Teacher> getTeachers(){
        return teachers;
    }

    // updates the teachers in the school 
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    // returns the students in the School
    public List<Student> getStudent(){
        return students;
    }

    // updates the student in the School 
    public void addStudent(Student student){
        students.add(student);
    }

    // return the total money earned 
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    // updates the total money earned 
    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyEarned +=MoneyEarned;
    }

    // returns total money spent by the school 
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    // updates the money Spent 
    public static void updateTotalMoneySpent(int moneySpent){
        totalMoneyEarned -=moneySpent;
        totalMoneySpent +=moneySpent;
    }
}
