package jmenubartest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ayasnasih
 */
public class JMenuBarTest extends Canvas {
    
    static Color bgColor = Color.BLACK;

    public void paint(Graphics g) {
        g.drawString("Group AI",170,220);

        setBackground(bgColor);
        //g.fillRect(130, 30,100, 80);
        g.drawOval(180, 30, 30, 30);
        setForeground(Color.WHITE);
        g.drawLine(195, 60, 195, 140);
        g.drawLine(195, 60, 170, 100);
        g.drawLine(195, 60, 220, 100);
        g.drawLine(195, 140, 170, 180);
        g.drawLine(195, 140, 220, 180);
        g.fillOval(188, 39, 5, 5);
        g.fillOval(197, 39, 5, 5);
        g.drawArc(180, 49, 40,60,70,60);
        //g.fillArc(30, 130, 40,50,180,40);

    }

    public static void main(String[] args) {
        JMenuBarTest m = new JMenuBarTest();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        m.setBounds(0,0,400,330); 
        f.setLayout(null);
        f.setVisible(true);

        JFrame ff = new JFrame("JColorChooser Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JButton button = new JButton("Pick to Change Background");
        button.setBounds(0,330, 400,30); 
        ActionListener actionListener = (ActionEvent actionEvent) -> {
            Color initialBackground = button.getBackground();
            Color background = JColorChooser.showDialog(null, "JColorChooser Sample", initialBackground);
            if (background != null) {
                //button.setBackground(background);
                bgColor = background;
                m.repaint();
            }
        };
        button.addActionListener(actionListener);
        
        f.add(button);
        //ff.setSize(300, 200);
        //ff.setVisible(true);

    }

}