import java.awt.*;
import java.awt.event.*;



public class Event_Handling2 extends MouseAdapter {
    Frame f;

    public Event_Handling2() {
        f = new Frame("Mouse Adapter");

        f.setBackground(Color.CYAN);
        f.addMouseListener(this);



        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });

        f.setSize(400, 400);
        f.setVisible(true);
        f.setResizable(false);
    }

    public void mouseClicked(MouseEvent me) {
        Graphics g = f.getGraphics();
        g.setColor(Color.blue);
        g.drawOval(me.getX(), me.getY(), 30, 30);
    }

    public static void main(String[] args) {
        Event_Handling2 ev1 = new Event_Handling2();
    }
}
