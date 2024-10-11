package ar.edu.ubp.das.appref;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class RectangleItem extends ShapeItemBase {
    private Rectangle2D rectangle;

    public RectangleItem() {
        this.rectangle = new Rectangle2D.Double(1, 1, width, height);
    }

    @Override
    public void paint(Graphics g, Color c) {
        rectangle.setFrame(x, y, width, height);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(c);
        g2.fill(rectangle);
        g2.dispose();
    }

    @Override
    public boolean isInside(MouseEvent e) {
        return rectangle.contains(e.getPoint());
    }
}
