import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {


    public static void mainDraw(Graphics graphics){
        int rgb1 = (int) (Math.random() * 256);
        int rgb2 = (int) (Math.random() * 256);
        int rgb3 = (int) (Math.random() * 256);
        Color color = (new Color(rgb1, rgb2, rgb3));

        concentricSquares(180,color, graphics);


        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
    }

    public static void concentricSquares(int size, Color color, Graphics graphics){
            int limiter = 1;
       for (int i = WIDTH-1; i > 0; i--) {
            int rgb1 = (int) (Math.random() * 256);
            int rgb2 = (int) (Math.random() * 256);
            int rgb3 = (int) (Math.random() * 256);
            graphics.setColor(new Color(rgb1, rgb2, rgb3));
            graphics.fillRect(WIDTH-i,HEIGHT-i, i-limiter, i-limiter);
            limiter++;
        }
        graphics.setColor(color);
        graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2, size,size);
    }


    // Don't touch the code below
    static int WIDTH = 640;
    static int HEIGHT = 640;

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