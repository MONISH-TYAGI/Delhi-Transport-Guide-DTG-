package DisplayGraphics;

import java.awt.*;  
import javax.swing.JFrame;  


public class DisplayGraphics extends Canvas {
    /* (non-Javadoc)
     * @see java.awt.Canvas#paint(java.awt.Graphics)
     */


    public void paint(Graphics g) {  
        Graphics2D g2D = (Graphics2D) g;

    
    Toolkit t=Toolkit.getDefaultToolkit();  
    Image i=t.getImage("Pic.jpg");  
    g2D.scale(0.8, 0.8);
    g2D.drawImage(i, 180,10,this);  


          
    }  
    

    public static void main(String[] args) {  
        System.out.println("  hello Map");
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        // f.setSize(800,750);  
        // f.setLayout(null);  
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
int width = 900;
int height = 750;
f.setBounds(center.x - width / 2, center.y - height / 2, width, height);
        f.setVisible(true); 
        f.toFront();
        f.setAlwaysOnTop(true);
    }  

}

