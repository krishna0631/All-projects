import javax.swing.*;

public class Swingdemo5{
JFrame f;
Swingdemo5(){
f = new JFrame("JTextField & Password demo");

JLabel b1 = new JLabel("Enter UserName :");
b1.setBounds(35,100,110,30);

JTextField b2 = new JTextField("Enter");
b2.setBounds(170,100,110,30);
b2.setEditable(false);

JLabel b3 = new JLabel("Enter Password :");
b3.setBounds(35,140,110,30);

JPasswordField b4 = new JPasswordField("Enter");
b4.setBounds(170,140,110,30);

JButton b5 = new JButton("Forgot Password");
b5.setBounds(35,180,110,30);

JButton b6 = new JButton("Submit");
b6.setBounds(170,180,110,30);

JCheckBox b7 = new JCheckBox("T&C");
b7.setBounds(90,220,110,20);

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String[] args){
new Swingdemo5();
}
}