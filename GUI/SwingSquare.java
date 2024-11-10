package newo;
//Java swing program to find square of a number

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class hela extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
JLabel l2;
JTextField t2;
JButton b;

public hela()
{
  setLayout(new FlowLayout());

  l1=new JLabel("Enter Number:");
  t1=new JTextField(20); 
  
  l2=new JLabel("Sq:");
  t2=new JTextField(20);
  
  b=new JButton("Submit");

  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(b);
  
  b.addActionListener(this);
       
  setVisible(true);
  setSize(300,600);

  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
 int a=Integer.parseInt(t1.getText());


 int value=a*a;

 t2.setText(""+value);
}

}
public class SwingSquare
{
public static void main(String args[])
  {
    new hela();
  }
}
