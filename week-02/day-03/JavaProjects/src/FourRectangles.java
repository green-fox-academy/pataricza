import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {


    public static void mainDraw(Graphics graphics){

        for (int i = 0; i < 4; i++) {
            int randomSize1 = (int) (Math.random() * WIDTH);
            int randomSize2 = (int) (Math.random() * HEIGHT);
            int randomX = (int) (Math.random() *(WIDTH-randomSize1));
            int randomY = (int) (Math.random() *(HEIGHT-randomSize2));
            int rgb1 = (int) (Math.random() * 256);
            int rgb2 = (int) (Math.random() * 256);
            int rgb3 = (int) (Math.random() * 256);
            graphics.setColor(new Color(rgb1, rgb2, rgb3));
            graphics.fillRect(randomX,randomY, randomSize1,randomSize2);
        }

        // draw four different size and color rectangles.
        // avoid code duplication.


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