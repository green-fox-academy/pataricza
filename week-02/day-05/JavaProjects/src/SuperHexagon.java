import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {

        int[] xCoordinates = {489, 511, 522, 511, 489, 478};
        int[] yCoordinates = {20, 20, 39, 58, 58, 39};
        int numberOfPoints = 6;

        int[] tempxCoordinates = new int[6];
        int[] tempyCoordinates = new int[6];
        int hexaCounter = 0;


       for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                yCoordinates[j] += 38;
                tempxCoordinates[j] = xCoordinates[j];
                tempyCoordinates[j] = yCoordinates[j];
            }
           if(i > 3){hexaCounter++;}
           for (int k = hexaCounter; k < 3; k++) {
               for (int p = 0; p < 6; p++) {
                   tempyCoordinates[p] += 19;
                   tempxCoordinates[p] += 33;
               }
               graphics.drawPolygon(tempxCoordinates, tempyCoordinates, numberOfPoints);
           }
           for (int v = hexaCounter; v < 3; v++) {
               for (int z = 0; z < 6; z++) {
                   tempyCoordinates[z] -= 19;
                   tempxCoordinates[z] -= 33;
               }
           }
           for (int f = hexaCounter; f < 3; f++) {
               for (int g = 0; g < 6; g++) {
                   tempyCoordinates[g] += 19;
                   tempxCoordinates[g] -= 33;
               }
               graphics.drawPolygon(tempxCoordinates, tempyCoordinates, numberOfPoints);
           }
       graphics.drawPolygon(xCoordinates, yCoordinates, numberOfPoints);
        }



      /*  for (int k = 0; k < 4; k++) {
            for (int p = 0; p < 6; p++) {
                tempyCoordinates[p] += 19;
                tempxCoordinates[p] += 33;
            }
        graphics.drawPolygon(tempxCoordinates, tempyCoordinates, numberOfPoints);
        }*/


    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

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