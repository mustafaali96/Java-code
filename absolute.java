import javax.swing.*;

class absolute extends JFrame
{
  JLabel l1;
  JButton b1;

  absolute()
  {
     setTitle("No Layout");
     l1 = new JLabel("Enter value");
     b1 = new JButton("calculate");

     setLayout(null);


     l1.setBounds(20, 20, 100, 20);

     b1.setBounds(124, 25, 100, 20);

     add(l1);add(b1);

     setVisible(true);
  }
}
class absolutemain
{
  public static void main(String arg[])
  {
     absolute x = new absolute();