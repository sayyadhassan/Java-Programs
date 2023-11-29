package com.company;
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // we can also set Title at the time of object creation by passing in parameter
        JFrame jf = new JFrame("Swing Example");

        // to make Frame Visible
        jf.setVisible(true);

        // to hide Frame
//        jf.setVisible(false);

        // to specified if we close JFrame then programe will also end
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // to set height and width of Frame
        jf.setSize(300,300);

        // to set Title on the top
//        jf.setTitle("Example of Swing GUI");
    }
}
