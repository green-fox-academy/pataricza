import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {

        int startingX = 0;
        int startingY = 0;
        int startingY2 = 640;
        int sideChanger = 0;

        for (int i = 0; i < WIDTH/20*2+1; i++) {
            if(sideChanger % 2 == 0) {
                drawToCenter(startingX, startingY, graphics);
                drawToCenter(startingX, startingY2, graphics);
                startingX += 20;
            }else{
                drawToCenter(startingY, startingX, graphics);
                drawToCenter(startingY2, startingX, graphics);
            }
         sideChanger++;
        }

        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.



    }

    public static void drawToCenter(int startingX, int startingY, Graphics graphics){
        graphics.setColor(Color.red);
        graphics.drawLine(startingX, startingY,WIDTH/2,HEIGHT/2);
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