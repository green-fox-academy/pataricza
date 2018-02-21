import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        int startingCoBl = 20;
        int startingCoPu = 20;
        int numberOfSteps = 20;

        for (int i = 0; i < numberOfSteps; i++) {
            graphics.setColor(new Color(0, 0, 0));
            graphics.fillRect(startingCoBl-2, startingCoBl-2, 24,24);
            startingCoBl += 20;
        }

        for (int i = 0; i < numberOfSteps; i++) {
            graphics.setColor(new Color(170, 0, 255));
            graphics.fillRect(startingCoPu, startingCoPu, 20,20);
            startingCoPu += 20;
        }


        // Reproduce this:
        // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]



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