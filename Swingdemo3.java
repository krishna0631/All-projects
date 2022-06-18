import javax.swing.*;

public class Swingdemo3 {
JFrame f;
Swingdemo3(){
f=new JFrame("JButton Demo");

JTextField b1=new JTextField("");
b1.setBounds(130,100,100,40);

f.add(b1);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String[] args) {
new Swingdemo3();
}
}
