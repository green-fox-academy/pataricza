import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int xCo = 0;
        int yCo = 20;

        for (int i = 0; i < 29; i++) {
            graphics.setColor(Color.magenta);
            graphics.drawLine(xCo, 0, WIDTH, yCo);
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, xCo, yCo, HEIGHT);
            xCo += 20;
            yCo += 20;
        }


    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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