package ar.edu.ubp.das.appref;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.awt.event.MouseEvent;

public class ShapeItem {

    private Rectangle2D rectangleShape;
    private Ellipse2D ellipseShape;

    private int x = 1;
    private int y = 1;
    private int width = 100;
    private int height = 100;

    public ShapeItem() {
        rectangleShape = createShape(new Rectangle2D.Double());
        ellipseShape = createShape(new Ellipse2D.Double());
    }

    private <T extends RectangularShape> T createShape(T shape) {
        shape.setFrame(x, y, width, height);
        return shape;
    }

    public boolean isInside(RectangularShape shape, MouseEvent e) {
        return shape.contains(e.getPoint());
    }

    public Rectangle2D getRectangleShape() {
        return rectangleShape;
    }

    public Ellipse2D getEllipseShape() {
        return ellipseShape;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
