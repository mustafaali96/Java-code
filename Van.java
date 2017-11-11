import java.applet.Applet;
import java.awt.*;
import javax.swing.*;
public class Van extends Applet{
public void paint(Graphics g){ drawVan(g);}
public void drawVan(Graphics g)
{
g.setColor(Color.BLACK);
g.fillRect(10,30,100,50);
g.setColor(Color.RED);
g.fillOval(20,70,20,20);
g.fillOval(80,70,20,20);
g.setColor(Color.CYAN);
g.fillRect(80,40,30,20);
}
}

