package edu.tucn.str.labs.recap_exercises.lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame extends javax.swing.JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton enterButton;
    private JPanel panel;

    public JFrame() {
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    //let a user enter a file name in a text field and then when a button is pressed to display
    // the content of the file in a text area
    public static void main(String[] args) {

        JFrame f=new JFrame();
        f.setContentPane(f.panel);
        f.setTitle("App lab 9");
        f.setSize(450,250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}


