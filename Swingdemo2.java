import javax.swing.*;

public class Swingdemo2 {
JFrame f;
Swingdemo2(){
f=new JFrame("JButton Demo");

JButton b1=new JButton("click");
b1.setBounds(130,100,100,40);

JButton b2=new JButton("click");
b2.setBounds(130,50,100,40);

f.add(b1);
f.add(b2);
f.setSize(400,500);
f.setLayout(null);
f.setVisible(true);
}

public static void main(String[] args) {
new Swingdemo2();
}
}
