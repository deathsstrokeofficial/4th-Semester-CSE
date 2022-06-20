import java.awt.*;
import java.awt.event.*;


public class Event_Handling1 extends Frame implements MouseListener, MouseMotionListener {
    Panel p1;
    Label l1;

    int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
    
    Event_Handling1() {
        setTitle("Mouse Event Handling");
        setBackground(Color.cyan);
        addMouseListener(this);
        addMouseMotionListener(this);

        l1 = new Label("INITIAL STATE", Label.CENTER);

        add(l1, BorderLayout.SOUTH);

        setSize(800, 800);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

    }

    public void mouseClicked(MouseEvent me) {
        l1.setText("MOUSE CLICKED");
    }
    public void mouseEntered(MouseEvent me) {
        l1.setText("MOUSE ENTERED");
    }
    public void mouseExited(MouseEvent me) {
        l1.setText("MOUSE EXITED");
    }
    public void mousePressed(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
    }
    public void mouseReleased(MouseEvent me) {
        x2 = me.getX();
        y2 = me.getY();
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        l1.setText("MOUSE DRAGGED");
    }

    public void mouseMoved(MouseEvent me) {
        l1.setText("MOUSE MOVED");
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(x1, y1, x2, y2);
    }
    public static void main(String[] args) {
        Event_Handling1 e1 = new Event_Handling1();
    }

    

}