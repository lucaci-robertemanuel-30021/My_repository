package edu.tucn.str.labs.lab2.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MessageApp extends JFrame implements ActionListener {

    JButton button;
    JTextArea text;

    public MessageApp() {
        //setting up the gui
        setLayout(new FlowLayout());
        button=new JButton("start");
        text=new JTextArea("empty");
        add(button);
        add(text);

        button.addActionListener(this);
        addWindowListener(new WindowAdapter()
        {
            public void
            windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        setSize(200,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn= (JButton) e.getSource();
        if(btn==button){
            MessageRunnable mr=new MessageRunnable();
            Thread t1=new Thread(mr);
            t1.start();
        }
    }
}
