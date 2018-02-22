import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {


    public static void mainDraw(Graphics graphics){
        graphics.drawRect(WIDTH/2-5,HEIGHT/2-5, 10,10);
        // Draw a green 10x10 square to the canvas' center.


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