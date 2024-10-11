package ar.edu.ubp.das.appref;

import java.awt.*;
import java.awt.event.MouseEvent;

public abstract class ShapeItemBase {
    protected int x, y, width = 100, height = 100;

    public abstract void paint(Graphics g, Color c);
    public abstract boolean isInside(MouseEvent e);

    public void moveShape(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }
}
