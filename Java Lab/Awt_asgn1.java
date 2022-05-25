import java.awt.*;
import java.awt.event.*;


public class Awt_asgn1 implements ActionListener, ItemListener {
    Frame f;
    Panel p1, p2, p3, p4, p5, p6, p7, p8;
    Label l1, l2, l3, l4, l5, l6;
    Checkbox c1, c2, c3, c4;
    CheckboxGroup cg1;
    TextField t1, t2;
    Button b1, b2;
    TextArea ta1;

    String roll = "", name = "", gender = "", lang1 = "", lang2 = "", strMain = "";

    Awt_asgn1() {
        f = new Frame("Awt Assignment 1");
        f.setLayout(new BorderLayout());

        ////////////// Panel //////////////
        p1 = new Panel();
        p1.setBackground(Color.yellow);

        p2 = new Panel();
        p2.setBackground(Color.blue);
        p2.setForeground(Color.white);

        p3 = new Panel();
        p3.setBackground(new Color(64, 223, 249));

        p4 = new Panel();
        p4.setBackground(Color.yellow);

        p5 = new Panel();
        p5.setBackground(Color.green);

        p6 = new Panel();
        p6.setBackground(new Color(146, 179, 121));

        p7 = new Panel();
        p7.setLayout(new BorderLayout());

        p8 = new Panel();


        ////////////// Labels //////////////
        l1 = new Label("AWT Components Demo");
        l2 = new Label("Roll No. :: ");
        l3 = new Label("Name :: ");
        l4 = new Label("Gender");
        l5 = new Label("Languages Known");
        l6 = new Label("Report", Label.CENTER);
        
        ////////////// TextFields //////////////
        t1 = new TextField(15);
        t1.setForeground(Color.black);
        t2 = new TextField(15);
        t2.setForeground(Color.black);

        ////////////// TextFields //////////////
        ta1 = new TextArea();

        ////////////// CheckboxGroup //////////////
        cg1 = new CheckboxGroup();


        ////////////// Checkbox //////////////
        c1 = new Checkbox("Male", cg1, false);
        c1.addItemListener(this);
        c2 = new Checkbox("Female", cg1, false);
        c2.addItemListener(this);
        c3 = new Checkbox("C++", false);
        c3.addItemListener(this);
        c4 = new Checkbox("Java", false);
        c4.addItemListener(this);



        ////////////// Buttons //////////////
        b1 = new Button("Ok");
        b1.addActionListener(this);

        b2 = new Button("Reset");
        b2.addActionListener(this);

        ////////////// Adding to panels //////////////
        // p1 -- Title
        p1.add(l1);

        // p2 -- Roll & Name
        p2.add(l2); p2.add(t1); p2.add(l3); p2.add(t2);

        // p3 -- Gender
        p3.add(l4); p3.add(c1); p3.add(c2);

        // p4 -- Languages
        p4.add(l5); p4.add(c3); p4.add(c4);

        // p5 -- Buttons
        p5.add(b1); p5.add(b2);

        // p6 -- Report
        p6.setLayout(new BorderLayout());
        p6.add(l6, BorderLayout.NORTH);
        p6.add(ta1, BorderLayout.SOUTH);

        // p7 -- p2, p3, p4
        p7.setLayout(new BorderLayout());
        p7.add(p2, BorderLayout.NORTH);
        p7.add(p3, BorderLayout.CENTER);
        p7.add(p4, BorderLayout.SOUTH);
        

        // p8 -- p5, p6
        p8.setLayout(new BorderLayout());
        p8.add(p5, BorderLayout.NORTH);
        p8.add(p6, BorderLayout.SOUTH);

        ////////////// Adding to frame //////////////
        f.add(p1, BorderLayout.NORTH);
        f.add(p7, BorderLayout.CENTER);
        f.add(p8, BorderLayout.SOUTH);




        f.setSize(480, 380);
        f.setVisible(true);
        f.setResizable(false);


        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
            strMain = t1.getText() + "\n" + t2.getText() + "\n" + gender + "\n" + lang1 + "\n" + lang2;

            ta1.setText(strMain);
        }
        if(ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            ta1.setText("");
            c1.setState(false);
            c2.setState(false);
            c3.setState(false);
            c4.setState(false);
        }
    }

    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource() == c1) {
            if(ie.getStateChange() == 1) {
                gender = "Male";
            }
            else {
                gender = "";
            }
        }
        if(ie.getSource() == c2) {
            if(ie.getStateChange() == 1) {
                gender = "Female";
            }
            else {
                gender = "";
            }
        }
        if(ie.getSource() == c3) {
            if(ie.getStateChange() == 1) {
                lang1 = "C++";
            }
            else {
                lang1 = "";
            }
        }
        if(ie.getSource() == c4) {
            if(ie.getStateChange() == 1) {
                lang2 = "Java";
            }
            else {
                lang2 = "";
            }
        }
    }

    public static void main(String[] args) {
        Awt_asgn1 a1 = new Awt_asgn1();
    }
    
}