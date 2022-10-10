package main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main {

    public static void main(String[] args) {
	JFrame frame=new JFrame();
    JLabel l1=new JLabel("Which");
    l1.setBounds(100,50,1000,40);
    JCheckBox c1=new JCheckBox("First");
    c1.setBounds(100,100,100,50);
    JCheckBox c2=new JCheckBox("Second");
    c2.setBounds(100,150,100,50);
    JButton btn=new JButton("Submit");
    btn.setBounds(100,200,100,100);
  c1.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange()==1) {
              c2.setSelected(false);
          }
      }
  });
  c2.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange()==1){
              c1.setSelected(false);
          }
      }
  });

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
