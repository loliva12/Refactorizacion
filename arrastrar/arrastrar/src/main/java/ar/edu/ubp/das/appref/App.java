package ar.edu.ubp.das.appref;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
//import java.awt.geom.RectangularShape;
import java.util.Random;

public class App extends Canvas implements MouseMotionListener {
    ShapeItemBase shape;
    boolean isMoving = false;
    Coordenada previousPoint;
    Color c;
    Random random;

    public App() {
        random = new Random();
        shape = random.nextInt(2) == 0 ? new RectangleItem() : new EllipseItem(); // Polimorfismo

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
        c = getRandomColor();
        shape.paint(g, c);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Coordenada actualPoint = new Coordenada(e.getX(), e.getY());

        if (!isMoving && shape.isInside(e)) {
            previousPoint = actualPoint;
            isMoving = true;
        } else if (isMoving) {
            Coordenada diferencia = actualPoint.diferencia(previousPoint);
            shape.moveShape(diferencia.getX(), diferencia.getY());
            previousPoint = actualPoint;
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        isMoving = false;
    }

    private Color getRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}
