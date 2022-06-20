import java.awt.*;
import java.awt.event.*;


public class Drawing_EH1 extends Frame implements ActionListener, MouseListener{
    
    Panel p2;
    Button bRect, bLine, bOval, bFillRect;

    int x1 = -1, y1 = -1, x2 = -1, y2 = -1;
    int distance_x = 0, distance_y = 0;

    boolean rect = false, line = false, oval = false, fillRect = false;


    Drawing_EH1() {
        setTitle("Drawing Tool");

        setLayout(new BorderLayout());
        
        addMouseListener(this);

        // ************** Panels **************
        // Panel p1 = new Panel();
        // p1.setBackground(Color.CYAN);  
        
        Panel p2 = new Panel();



        // ************** Buttons **************
        bRect = new Button("Draw Rectangle");
        bRect.addActionListener(this);
        bLine  = new Button("Draw Line");
        bLine.addActionListener(this);
        bOval = new Button("Draw Oval"); 
        bOval.addActionListener(this);
        bFillRect = new Button("Draw Solid Rectangle");
        bFillRect.addActionListener(this);



        // ************** Add to Panels **************
        p2.add(bRect);
        p2.add(bLine);
        p2.add(bOval);
        p2.add(bFillRect);

        // ************** Add to Frame **************
        add(p2, BorderLayout.SOUTH);


        setSize(800, 800);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == bRect) {
            rect = true;
            line = false;
            oval = false;
            fillRect = false;
        }
        else if(ae.getSource() == bLine) {
            rect = false;
            line = true;
            oval = false;
            fillRect = false;
        }
        if(ae.getSource() == bOval) {
            rect = false;
            line = false;
            oval = true;
            fillRect = false;
        }
        if(ae.getSource() == bFillRect) {
            rect = false;
            line = false;
            oval = false;
            fillRect = true;
        }
     //   repaint();
    }
    
    public void mouseClicked(MouseEvent me) {

    }

    public void mouseEntered(MouseEvent me) {
       
    }
    public void mouseExited(MouseEvent me) {
        
    }
    public void mousePressed(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
        repaint();
        x1 = -1;
        y1 = -1;
    }
    public void mouseReleased(MouseEvent me) {
        x2 = me.getX();
        y2 = me.getY();
        int distance_x = x2-x1;
        int distance_y = y2-y1;

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        // rect = false, line = false, oval = false, fillRect = false;
        if(rect)
            g.drawRect(x1, y1, 100, 100);
        else if(line)
            g.drawLine(x1, y1, (x1+50), (y1+50));
        else if(oval)
            g.drawOval(x1, y1, 100, 100);
        
        else if(fillRect)
            g.fillRect(x1, y1, 100, 100);
        
        
        
    }

    public static void main(String[] args) {
        Drawing_EH1 d1 = new Drawing_EH1();
    }
}
