import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel{
    
    MyPanel(){
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){//invoked automatically when JFrame is instantiated
        
        Graphics2D g2D = (Graphics2D) g;//cast g to Graphics2D

        g2D.setPaint(Color.blue);//sets the color of the line to blue
        g2D.setStroke(new BasicStroke(5));//sets the width of the line to 5 pixels
        //g2D.drawLine(0, 0, 500, 500);

        //g2D.setPaint(Color.pink);
        //g2D.drawRect(0,0, 100, 200);
        //g2D.fillRect(0,0, 100, 200);

        g2D.setPaint(Color.orange);
        g2D.drawOval(0,0,100,100);
    }
}
