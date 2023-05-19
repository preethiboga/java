import java.awt.*;
import java.awt.event.*;
class awt3
{
    public static void main(String args[])
    {
        Frame f=new Frame("my awt");
        f.setSize(1000,100);
        f.setVisible(true);
       f.addWindowListener(new Myclass());
    }
}
class Myclass extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}