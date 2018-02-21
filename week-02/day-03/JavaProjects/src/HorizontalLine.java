import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLine {
    public static void mainDraw(Graphics graphics){
        fiftyLong(50,61, graphics);
        fiftyLong(83,300, graphics);
        fiftyLong(255,410, graphics);
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.


    }

    public static void fiftyLong(int startingX, int startingY, Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawLine(startingX, startingY,startingX+50,startingY);
    }

    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 480;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}