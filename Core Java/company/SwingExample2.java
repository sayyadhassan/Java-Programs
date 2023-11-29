package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample2 extends JFrame{
    // Only declaring the Refrence Variables
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton btn1;

    // Default Constructor
    public SwingExample2() { };
    // Parametrise Constructor
    public SwingExample2(String s){
        super(s);
    }



    public void setComponents(){
        // here creating objects of Refrence Variable
        l1 = new JLabel("Addition of two numbers");
        l2 = new JLabel("First Number");
        l3 = new JLabel("Second Number");
        l4 = new JLabel();

        t1 = new JTextField();
        t2 = new JTextField();

        btn1 = new JButton("Add");

        // to add components on the Container/Frame, this add function is inside the JFrame and it
       //  will run for the object jf because jf calls the setComponents method
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(btn1);

        // to show compnent on the Container/Frame we need set Lauout(null) along with also we need to set position
        // ,bydefault Layout is 'flow'
        setLayout(null);
        // to set position of the components
        l1.setBounds(60,20,200,20);
        l2.setBounds(20,60,100,20);
        t1.setBounds(120,60,130,20);
        l3.setBounds(20,110,100,20);
        t2.setBounds(120,110,130,20);
        btn1.setBounds(70,160,100,20);
        l4.setBounds(20,200,100,20);

        btn1.addActionListener(new Handler());


    }

    class Handler implements ActionListener{      // need to import java.awt.event.ActionEvent
        // need to import java.awt.event.ActionListner
        // this is only abstract method inside ActionListner Interface which we need to define
        public void actionPerformed(ActionEvent e){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int s=a+b;
            l4.setText("Result is "+s);
        }
    }

    public static void main(String[] args) {
        SwingExample2 jf = new SwingExample2("Swing Example");
        jf.setVisible(true);
        jf.setSize(300,300);

        // to set components inside the frame
        jf.setComponents();
    }

}
