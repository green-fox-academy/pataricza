import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics){
        graphics.drawLine(30,30,30,130);
        graphics.setColor(Color.red);
        graphics.drawLine(30,30,130,30);
        graphics.setColor(Color.green);
        graphics.drawLine(130,30,130,130);
        graphics.setColor(Color.yellow);
        graphics.drawLine(130,130,30,130);
        graphics.setColor(Color.blue);



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