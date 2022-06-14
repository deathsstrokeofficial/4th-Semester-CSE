import java.awt.*;
import java.awt.event.*;


public class AWT_q1 {

    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;
    Panel p1, p2, p3;

    AWT_q1() {
        Frame f = new Frame("Creating GUI Using AWT");

        f.setLayout(null);
        f.setBackground(Color.BLACK);

        p1 = new Panel();
        p1.setBounds(30, 50, 440, 180);
        p1.setLayout(new GridLayout(3, 2, 40, 40));

        l1 = new Label("User Name", Label.CENTER);
        l1.setBackground(Color.YELLOW);
        l2 = new Label("Password", Label.CENTER);
        l2.setBackground(Color.YELLOW);

        t1 = new TextField(10);
        t1.setBackground(Color.BLUE);
        t1.setForeground(Color.WHITE);
        t2 = new TextField(10);
        t2.setForeground(Color.WHITE);
        t2.setBackground(Color.BLUE);


        b1 = new Button("OK");
        b2 = new Button("Cancel");

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(b1);
        p1.add(b2);

        f.add(p1);

        f.setSize(500, 260);
        f.setVisible(true);
        f.setResizable(false);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        AWT_q1 a1 = new AWT_q1();
    }
}