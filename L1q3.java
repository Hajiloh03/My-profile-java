package l1q3;

import javax.swing.*;
import java.awt.*;

public class L1q3 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.drawRect(20, 40, 60, 100);

        
        g.drawOval(120, 40, 60, 100); 

       
        g.drawLine(220, 140, 220, 70); 
        g.drawLine(200, 90, 220, 70); 
        g.drawLine(240, 90, 220, 70);  
        g.drawLine(200, 90, 240, 90);  

        
        int[] xPoints = {310, 330, 310, 290};
        int[] yPoints = {90, 115, 140, 115};
        g.drawPolygon(xPoints, yPoints, 4);  

  
        g.drawString("Rectangle", 20, 160);
        g.drawString("Oval", 130, 160);
        g.drawString("Arrow", 210, 160);
        g.drawString("Diamond", 295, 160);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("L1Q3 Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.add(new L1q3());
        frame.setVisible(true);
    }
}