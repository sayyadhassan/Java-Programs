package Collection_FrameWork;

public class Collection15_A_Employee_Comparator {
     private int emp_Id;
    private String name;
    private String mob_no;

    @Override
    public String toString() {
        return "Employee_Comparator{" +
                "emp_Id=" + emp_Id +
                ", name='" + name + '\'' +
                ", mob_no='" + mob_no + '\'' +
                '}';
    }

        public Collection15_A_Employee_Comparator(int emp_Id, String name, String mob_no){
            this.emp_Id = emp_Id;
            this.name = name;
            this.mob_no = mob_no;
        }

        public int getEmp_Id() {
            return emp_Id;
        }

        public String getName() {
            return name;
        }

        public String getMob_no() {
            return mob_no;
        }
}
