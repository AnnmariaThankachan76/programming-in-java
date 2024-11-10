/*Sample GUI Programs in Java
• Write a Java program that uses two textfields and a button. The
first textfield accepts temperature in Celsius. When the ‘Convert’
button is clicked the second textfield displays the temperature
in Fahrenheit. Use appropriate Swing components and event
handling techniques. F=(C*9/5)+32
*/
package newo;

 //Program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class convert extends JFrame implements ActionListener {

	JLabel l1, l2;
	JTextField t1, t2;
	JButton btn;
public convert() {
	
 setLayout(new FlowLayout());
setTitle("Hyper: Temperature Converter");
setSize(400, 200);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 l1 = new JLabel("Enter temperature in Celsius:");
 t1 = new JTextField(20);
l2 = new JLabel("Temperature in farenheit:");
 t2 = new JTextField(20);

btn = new JButton("Convert");
 t2.setEditable(false);


 add(l1);
add(t1);
 add(l2);
 add(t2);
 add(btn);

 btn.addActionListener(this);
 
 setVisible(true);
 
 }

 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == btn) {

 try {
	
 double C = Double.parseDouble(t1.getText());
 double Faren = (C * 9 / 5) + 32;
 t2.setText(String.valueOf(Faren));
 } catch (NumberFormatException ex) {
t2.setText("Invalid input. Please enter number.");
 }
 }
 }
 }

 public class TempConverter {
 public static void main(String[] args) {
 new convert();
 }
 }


