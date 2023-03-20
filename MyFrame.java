import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{

    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the program when the window is closed

        this.add(panel);//adds the panel to the frame
        this.pack();//sets the size of the frame to the size of the panel
        
        this.setLayout(null);// allows fram to appear in middle of screen
        this.setVisible(true);//makes the window visible
    }

}