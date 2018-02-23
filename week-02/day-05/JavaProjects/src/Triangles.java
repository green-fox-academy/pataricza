import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics){

        int[] xPoints = {143, 300, 457};
        int[] yPoints = {500, 227, 500};
        int numberOfPoints = 3;

        graphics.drawPolygon(xPoints , yPoints, numberOfPoints);

        int[] xPoints2 = {144, 301, 458};

        graphics.drawPolygon(xPoints2 , yPoints, numberOfPoints);
        graphics.drawLine(xPoints2[0],yPoints[0]-1, xPoints2[2],yPoints[2]-1);

        int lineX1 = 151;
        int lineX2 = 449;
        int lineY = 487;
        int lineXCounter = 15;

        for (int i = 0; i < 20; i++) {
            graphics.drawLine(lineX1, lineY, lineX2, lineY);
            graphics.drawLine(lineX1, lineY-1, lineX2, lineY-1);
            graphics.drawLine(lineX2, lineY, xPoints[2]-lineXCounter, yPoints[2]);
            graphics.drawLine(lineX2+1, lineY, xPoints2[2]-lineXCounter, yPoints[2]);
            graphics.drawLine(lineX1, lineY, xPoints[0]+lineXCounter, yPoints[0]);
            graphics.drawLine(lineX1+1, lineY, xPoints2[0]+lineXCounter, yPoints[0]);
            lineXCounter += 15;
            lineY -= 13;
            if(i % 2 == 0) {
                lineX1 += 8;
                lineX2 -= 8;
            }else{
                lineX1 += 7;
                lineX2 -= 7;
            }
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