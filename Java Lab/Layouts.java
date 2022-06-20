import java.awt.*;
import java.awt.event.*;


class Frame2 extends Frame implements ActionListener {
    Button b1, b2, b3, b4, bExit;

    public Frame2() {

    }

    public Frame2(int x) {

        setTitle("Frame 2");

        b1 = new Button("Red");
        b1.addActionListener(this);
        b2 = new Button("Cyan");
        b2.addActionListener(this);
        b3 = new Button("Green");
        b3.addActionListener(this);
        b4 = new Button("Yellow");
        b4.addActionListener(this);
        bExit = new Button("Exit");
        bExit.addActionListener(this);


        if(x == 1) {
            setLayout(new FlowLayout());
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(bExit);
        }
        if(x == 2) {
            setLayout(new GridLayout(3, 3));
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(bExit);
        }
        if(x == 3) {
            setLayout(new BorderLayout());
            add(b1, BorderLayout.NORTH);
            add(b2, BorderLayout.CENTER);
            add(b3, BorderLayout.SOUTH);
            add(b4, BorderLayout.EAST);
            add(bExit, BorderLayout.WEST);
        }
        setSize(450, 450);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            b1.setBackground(Color.RED);
        }
        if(ae.getSource() == b2) {
            b2.setBackground(Color.CYAN);
        }
        if(ae.getSource() == b3) {
            b3.setBackground(Color.GREEN);
        }
        if(ae.getSource() == b4) {
            b4.setBackground(Color.YELLOW);
        }
        if(ae.getSource() == bExit) {
            dispose();
        }
    }

}

public class Layouts implements ActionListener {

    Frame f1;
    Frame2 f2;
    Button bFlow, bGrid, bBorder, bAdd, bExit;
    int counter = 0;


    public Layouts() {
        f1 = new Frame("Select Layout");

        f1.setLayout(new FlowLayout());

        // Buttons
        bFlow = new Button("Flow Layout");
        bFlow.addActionListener(this);
        bGrid = new Button("Grid Layout");
        bGrid.addActionListener(this);
        bBorder = new Button("Border Layout");
        bBorder.addActionListener(this);
        bAdd = new Button("Add Button");
        bAdd.addActionListener(this);
        bExit = new Button("Exit");
        bExit.addActionListener(this);


        // Add to f1
        f1.add(bFlow);
        f1.add(bGrid);
        f1.add(bBorder);
        f1.add(bAdd);
        f1.add(bExit);

        


        f1.setVisible(true);
        f1.setSize(500, 300);

        f1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f1.dispose();
            }
        });

        

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == bFlow) {
            // System.out.println("Flow!!");
            f2 = new Frame2(1);
        }
        if(ae.getSource() == bGrid) {
            // System.out.println("Grid!!");
            f2 = new Frame2(2);
        }
        if(ae.getSource() == bBorder) {
            // System.out.println("Border!!");
            f2 = new Frame2(3);
        }
        if(ae.getSource() == bAdd) {
            // System.out.println("Add new Button!!");
            // String btn_name = ("BUTTON: " + String.valueOf(counter));
            // Button b_new = new Button(btn_name);
            // counter += 1;
            // f1.add(b_new);
            // f1.revalidate();
        }
        if(ae.getSource() == bExit) {
            f2.dispose();
        }
    }

    public static void main(String[] args) {
        Layouts l1 = new Layouts();
    }
}
