package ar.edu.ubp.das.appref;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

public class EllipseItem extends ShapeItemBase {
    private Ellipse2D ellipse;

    public EllipseItem() {
        this.ellipse = new Ellipse2D.Double(1, 1, width, height);
    }

    @Override
    public void paint(Graphics g, Color c) {
        ellipse.setFrame(x, y, width, height);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(c);
        g2.fill(ellipse);
        g2.dispose();
    }

    @Override
    public boolean isInside(MouseEvent e) {
        return ellipse.contains(e.getPoint());
    }
}
