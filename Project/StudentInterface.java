package Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentInterface extends JFrame {
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5;
    JButton btn1;

    StudentInterface(){};
    StudentInterface(String s){
        super(s);
    }

    public void setComponents(){
        l1 = new JLabel("Student Information");
        l2 = new JLabel("Student Id");
        l3 = new JLabel(" Student Name");
        l4 = new JLabel("Student Grade");
        l5 = new JLabel("Fees Paid");
        l6 = new JLabel("Fees Total");
        l7 =new JLabel();

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();

        btn1 = new JButton("ADD");

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);

        add(btn1);

        setLayout(null);

        setBackground(Color.yellow);

        l1.setBounds(110,20,200,20);

        l2.setBounds(50,70,100,20);
        t1.setBounds(140,70,200,20);

        l3.setBounds(50,100,100,20);
        t2.setBounds(140,100,200,20);

        l4.setBounds(50,130,100,20);
        t3.setBounds(140,130,200,20);

        l5.setBounds(50,160,100,20);
        t4.setBounds(140,160,200,20);

        l6.setBounds(50,190,100,20);
        t5.setBounds(140,190,200,20);

        l7.setBounds(50, 260, 300, 200);

        btn1.setBounds(130,230,100,20);

        btn1.addActionListener(new StudentHandler());
    }

    class StudentHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Student s =new Student(Integer.parseInt(t1.getText()),t2.getText(),Integer.parseInt(t3.getText()));
            l7.setText("Result"+s);

//            String s = t3.getInputMethodRequests();
        }
    }

    public static void main(String []args){
        StudentInterface jf = new StudentInterface("School Managment System");
        jf.setVisible(true);
        jf.setSize(400,600);
        jf.setComponents();
    }
}
