import javax.swing.*;

public class Swingdemo1 {
JFrame f;
Swingdemo1(){
f=new JFrame("JButton Demo");

JButton b1=new JButton("click");
b1.setBounds(130,100,100,40);

f.add(b1);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String[] args) {
new Swingdemo1();
}
}


