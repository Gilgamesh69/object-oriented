package assignment3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Rectangle {

    int x, y, width, height;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void draw(Graphics g) {
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath rect = new GeneralPath();

        rect.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            rect.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        rect.closePath();

        g2d.setColor(Color.YELLOW);
        g2d.fill(rect);
    }
}
