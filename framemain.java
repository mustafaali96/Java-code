import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class frame1 extends JFrame implements ActionListener
{
  JButton b1,b2,b3;
  frame1()
  {
     setTitle("Frame 1");
     b1=new JButton("Button1");
     b2=new JButton("Button2");


     FlowLayout f = new FlowLayout();
     setLayout(f);

     add(b1);add(b2);
     setSize(200,100);

     b1.addActionListener(this);
     b2.addActionListener(this);
  
     setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
  
     if(e.getSource() == b1)
     {
         frame2 y = new frame2();
     }
     if(e.getSource() == b2)
     {
         frame3 y = new frame3();
     }
  }
}

class frame2 extends JFrame
{

  frame2()
  {
     setTitle("Frame 2");
     setSize(200,100);
     setVisible(true);
  }
}

class frame3 extends JFrame
{

  frame3()
  {
     setTitle("Frame 3");
     setSize(200,100);
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
