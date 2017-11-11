import javax.swing.*;
import java.awt.*;

class frame1 extends JFrame
{
  JButton b1,b2,b3;
  frame1()
  {
     setTitle("Frame 1");
     b1=new JButton("Button1");
     b2=new JButton("Button1");
     b3=new JButton("Button1");

     FlowLayout f = new FlowLayout();
     setLayout(f);

     add(b1);add(b2);add(b3);
     setSize(200,200);
     setVisible(true);
  }
}
class framemain
{
  public static void main(String arg[])
  {
     frame1 x = new frame1();
  }
}
