import java.awt.*;
import java.awt.event.*;
class awt6 extends Frame
{
    awt6()
    {
        this.addWindowListener(new WindowAdapter()
        {

           public void windowClosing(WindowEvent e)
           {
               System.exit(0);

           }
        });
    }
    public void paint(Graphics g)
    {
        int x[]={375,275,475};
        int y[]={125,200,200};
        int n=3;
        this.setBackground(Color.gray);
        g.setColor(Color.yellow);
        g.fillRect(300,200,150,100);
        g.setColor(Color.blue);
        g.fillRect(350,210,50,60);
        g.drawLine(350,280,400,280);
        g.setColor(Color.darkGray);
        g.fillPolygon(x,y,n);
        g.setColor(Color.cyan);
        g.fillOval(100,100,60,60);
        g.setColor(Color.green);
        g.fillArc(50,250,150,100,0,180);
        g.fillArc(150,250,150,100,0,180);
        g.fillArc(450,250,150,100,0,180);
        g.drawLine(50,300,600,300);
        g.setColor(Color.black);
        g.drawString("E3 CSE happy home",275,350);
    }
    public static void main(String args[])
    {
        awt6 h= new awt6();
        h.setSize(500,400);
        h.setTitle("our home");
        h.setVisible(true);
    }
}