import javax.swing.*;

class absolute extends JFrame
{
  JLabel l1;
  JButton b1;
  JTextField t1;

  absolute()
  {
     setTitle("Absolute Positioning");
     l1 = new JLabel("Enter value");
     b1 = new JButton("Button");
     t1 = new JTextField();

     setLayout(null);


     l1.setBounds(30, 20, 100, 20);
     t1.setBounds(124,20,100,20);
   

     b1.setBounds(60, 60, 150, 40);

 
     add(l1);add(t1);add(b1);
   
     setSize(300,150);

     setVisible(true);
  }
}
class absolutemain
{
  public static void main(String arg[])
  {
     absolute x = new absolute();
  }
}