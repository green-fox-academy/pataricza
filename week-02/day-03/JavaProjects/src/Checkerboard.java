import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {

        int startingCoY = 20;
        int colorChanger = 0;

        for (int i = 0; i < 8; i++) {
            int startingCoX = 20;
            for (int j = 0; j < 8; j++) {
                if(colorChanger % 2 == 0) {
                    graphics.setColor(new Color(0, 0, 0));
                    graphics.fillRect(startingCoX, startingCoY, 20, 20);
                    startingCoX += 20;
                }else{
                    graphics.setColor(new Color(255, 255, 255));
                    graphics.fillRect(startingCoX, startingCoY, 20, 20);
                    startingCoX += 20;
                }
             colorChanger++;
            }
        colorChanger++;
        startingCoY += 20;
        }


        // Fill the canvas with a checkerboard pattern.



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