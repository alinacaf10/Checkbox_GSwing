package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
	JFrame frame=new JFrame();
    JLabel l1=new JLabel("Which");
    l1.setBounds(100,50,100,10);
    JCheckBox c1=new JCheckBox("First");
    c1.setBounds(100,100,100,50);
    JCheckBox c2=new JCheckBox("Second");
    c2.setBounds(100,150,100,50);
    JButton btn=new JButton("Submit");
    btn.setBounds(100,200,100,100);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (c1.isSelected()){
                l1.setText(c1.getText()+" selected");

            }
            if (c2.isSelected()){
                l1.setText(c2.getText()+" selected");

            }
        }
    });
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.add(l1);
    frame.add(c1);
    frame.add(c2);
    frame.add(btn);
    }
}
