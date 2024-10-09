package ar.edu.ubp.das.appref;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

public class ShapePainter {

    public void paint(Graphics g, RectangularShape shape, Color c, int x, int y, int width, int height) {
        shape.setFrame(x, y, width, height);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(c);
        g2.fill(shape);
        g2.dispose();
    }
}