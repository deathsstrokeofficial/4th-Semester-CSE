import java.awt.*;
import java.awt.event.*;

public class CalcGUI extends Frame implements ActionListener {

    Panel p1;
    TextField t1;
    Font f1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;

    String num1 = "", num2 = "", operator = "";
    double n1 = 0, n2 = 0;
    double result = 0;

    CalcGUI() {

        setLayout(null);

        ///////////// Panel 1 /////////////
        p1 = new Panel();
        p1.setBackground(new Color(173, 164, 164));
        p1.setBounds(50, 50, 260, 44);

        ///////////// Button /////////////
        b1 = new Button("1");
        b1.setBounds(50, 330, 50, 50);
        b1.addActionListener(this);
        

        b2 = new Button("2");
        b2.setBounds(120, 330, 50, 50);
        b2.addActionListener(this);

        b3 = new Button("3");
        b3.setBounds(190, 330, 50, 50);
        b3.addActionListener(this);




        b4 = new Button("4");
        b4.setBounds(50, 260, 50, 50);
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.setBounds(120, 260, 50, 50);
        b5.addActionListener(this);


        b6 = new Button("6");
        b6.setBounds(190, 260, 50, 50);
        b6.addActionListener(this);



        b7 = new Button("7");
        b7.setBounds(50, 190, 50, 50);
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.setBounds(120, 190, 50, 50);
        b8.addActionListener(this);

        b9 = new Button("9");
        b9.setBounds(190, 190, 50, 50);
        b9.addActionListener(this);
        




        b10 = new Button("0");
        b10.setBounds(120, 400, 50, 50);
        b10.addActionListener(this);


        b11 = new Button("AC");
        b11.setBounds(50, 120, 50, 50);
        b11.addActionListener(this);


        b12 = new Button("/");
        b12.setBounds(120, 120, 50, 50);
        b12.addActionListener(this);

        b13 = new Button("*");
        b13.setBounds(190, 120, 50, 50);
        b13.addActionListener(this);

        b14 = new Button("-");
        b14.setBounds(260, 120, 50, 50);
        b14.addActionListener(this);

        b15 = new Button("+");
        b15.setBounds(260, 190, 50, 120);
        b15.addActionListener(this);

        b16 = new Button("=");
        b16.setBounds(260, 330, 50, 120);
        b16.addActionListener(this);


        b17 = new Button(".");
        b17.setBounds(190, 400, 50, 50);
        b17.addActionListener(this);


        b18 = new Button("Del");
        b18.setBounds(50, 400, 50, 50);
        b18.addActionListener(this);

        ///////////// Fonts /////////////
        f1 = new Font("Forte", Font.BOLD, 19);

        ///////////// TextFields /////////////
        t1 = new TextField(17);
        t1.setFont(f1);
        t1.setBackground(new Color(173, 164, 164));
        t1.setForeground(Color.BLACK);

        ///////////// Add to Panels /////////////
        p1.add(t1);


        ///////////// Frame /////////////
        add(p1);
        add(b11); add(b12); add(b13); add(b14);
        add(b7); add(b8); add(b9); add(b15);
        add(b4); add(b5); add(b6);
        add(b1); add(b2); add(b3); add(b16);
        add(b18); add(b10); add(b17);


        setSize(360, 500);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
            // Button "1" clicked
            if(ae.getSource() == b1) {
                if(operator == "") {
                    num1 = num1 + "1";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "1";
                    t1.setText(num2);
                }

            }

            // Button "2" clicked
            if(ae.getSource() == b2) {
                if(operator == "") {
                    num1 = num1 + "2";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "2";
                    t1.setText(num2);
                }
            }

            // Button "3" clicked
            if(ae.getSource() == b3) {
                if(operator == "") {
                    num1 = num1 + "3";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "3";
                    t1.setText(num2);
                }
            }

            // Button "4" clicked
            if(ae.getSource() == b4) {
                if(operator == "") {
                    num1 = num1 + "4";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "4";
                    t1.setText(num2);
                }
            }

            // Button "5" clicked
            if(ae.getSource() == b5) {
                if(operator == "") {
                    num1 = num1 + "5";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "5";
                    t1.setText(num2);
                }
            }

            // Button "6" clicked
            if(ae.getSource() == b6) {
                if(operator == "") {
                    num1 = num1 + "6";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "6";
                    t1.setText(num2);
                }
            }

            // Button "7" clicked
            if(ae.getSource() == b7) {
                if(operator == "") {
                    num1 = num1 + "7";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "7";
                    t1.setText(num2);
                }
            }

            // Button "8" clicked
            if(ae.getSource() == b8) {
                if(operator == "") {
                    num1 = num1 + "8";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "8";
                    t1.setText(num2);
                }
            }

            // Button "9" clicked
            if(ae.getSource() == b9) {
                if(operator == "") {
                    num1 = num1 + "9";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "9";
                    t1.setText(num2);
                }
            }

            // Button "0" clicked
            if(ae.getSource() == b10) {
                if(operator == "") {
                    num1 = num1 + "0";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + "0";
                    t1.setText(num2);
                }
            }

            // Button "AC" clicked
            if(ae.getSource() == b11) {
                num1 = "";
                num2 = "";
                operator = "";
                t1.setText("");
            }


            // Button "/" clicked
            if(ae.getSource() == b12) {
                operator = "/";
            }

            // Button "*" clicked
            if(ae.getSource() == b13) {
                operator = "*";
            }

            // Button "-" clicked
            if(ae.getSource() == b14) {
                operator = "-";
            }

            // Button "+" clicked
            if(ae.getSource() == b15) {
                operator = "+";
            }
            
            // Button "=" clicked
            if(ae.getSource() == b16) {
                n1 = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);
                
                if(operator == "+") {
                    result = n1 + n2;
                }
                else if(operator == "-") {
                    result = n1 - n2;
                }
                else if(operator == "*") {
                    result = n1 * n2;
                }
                else if(operator == "/") {
                    result = n1 / n2;
                }
                else {
                    t1.setText("ERROR");
                }

                t1.setText(String.valueOf(result));
            }

            // Button "." clicked
            if(ae.getSource() == b17) {
                if(operator == "") {
                    num1 = num1 + ".";
                    t1.setText(num1);
                }
                else {
                    num2 = num2 + ".";
                    t1.setText(num2);
                }
            }

            // Button "del" clicked
            if(ae.getSource() == b18) {
                if(operator == "") {
                    num1 = num1.substring(0, num1.length()-1);
                    t1.setText(num1);
                }
                else {
                    num2 = num2.substring(0, num2.length()-1);
                    t1.setText(num2);
                }
            }
    }
    public static void main(String[] args) {
        CalcGUI c1 = new CalcGUI();
    }
}