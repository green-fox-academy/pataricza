package treedrawer;

import javax.swing.*;


import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  public static void mainDraw(Graphics graphics) {

    // Every time you run the program the tree slightly changes its size colors.

    drawTree(graphics, 300, 500, 270, 6 + (int) (Math.random() * 4));

  }

  private static void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
    if (depth == 0) return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 9.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 9.0);
    g.setColor(Color.getHSBColor((float)(Math.random() * 360),100,30));
    g.drawLine(x1, y1, x2, y2);
    drawTree(g, x2, y2, angle - 25, depth - 1);
    drawTree(g, x2, y2, angle, depth - 1);
    drawTree(g, x2, y2, angle + 25, depth - 1);
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
      this.setBackground(Color.blue);
      mainDraw(graphics);
    }
  }
}
