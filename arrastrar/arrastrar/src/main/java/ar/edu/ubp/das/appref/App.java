package ar.edu.ubp.das.appref;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.RectangularShape;
import java.util.Random;

public class App extends Canvas implements MouseMotionListener {

    private ShapeItem shape;
    private ShapePainter shapePainter;
    private boolean isMoving = false;
    private int prevX;
    private int prevY;

    private Color c;
    private Random random;

    public App() {
        random = new Random();
        shape = new ShapeItem();
        shapePainter = new ShapePainter();

        addMouseMotionListener(this);

        JFrame frame = new JFrame("Arrastra la figura");
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        c = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        RectangularShape rs = getRandomShape(); // Usar el método extraído
        shapePainter.paint(g, rs, c, shape.getX(), shape.getY(), shape.getWidth(), shape.getHeight());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (!isMoving) {
            RectangularShape rs = getRandomShape(); // Usar el método extraído

            if (shape.isInside(rs, e)) {
                prevX = e.getX();
                prevY = e.getY();
                isMoving = true;
            }
        } else {
            shape.setX((shape.getX() + e.getX()) - prevX);
            shape.setY((shape.getY() + e.getY()) - prevY);

            prevX = e.getX();
            prevY = e.getY();

            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        isMoving = false;
    }

    private RectangularShape getRandomShape() {
        if (random.nextInt(256) % 2 == 0) {
            return shape.getRectangleShape();
        } else {
            return shape.getEllipseShape();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
