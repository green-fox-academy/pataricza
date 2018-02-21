import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {


    public static void mainDraw(Graphics graphics){

        drawSquare(50, 180, graphics);
        drawSquare(355, 200, graphics);
        drawSquare(143, 15, graphics);

        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
    }

    public static void drawSquare(int valueX, int valueY, Graphics graphics){
        int rgb1 = (int) (Math.random() * 256);
        int rgb2 = (int) (Math.random() * 256);
        int rgb3 = (int) (Math.random() * 256);
        graphics.setColor(new Color(rgb1, rgb2, rgb3));
        graphics.fillRect(valueX,valueY, valueX+50,valueX+50);
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