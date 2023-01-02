
import java.awt.*;
import javax.swing.JFrame; 
public class test extends JFrame
{
    public static void main(String[] args)
   {
      DisplayMode dm = new DisplayMode(800,600,16,90);
       //  DrawingPanel pane = new DrawingPanel(600,600);
      //  Graphics g = panel.getGraphics();
       // g.setFont(new Font("Ink Free",Font.BOLD,18));
    }
    public void pro1(DisplayMode dm)
    {
        setBackground(Color.BLUE);
        setForeground(Color.RED);
        setFont(new Font("Ariel", Font.PLAIN, 24));
        System.out.println("check");
        }
    }

