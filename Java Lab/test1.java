import java.awt.*;
import java.awt.event.*;

public class test1  implements ActionListener {

    Frame f;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button badd, bsub, bmul, bdiv, bmod, bdec, bcalc, bclr, bbck;
    Label l1;
    double result, num1, num2, check=0;

    public test1() {
        //Frame frame
        f = new Frame("My Calculator");
        f.setBackground(Color.DARK_GRAY);

        //Label
        l1 = new Label();
        l1.setBackground(Color.lightGray);
        l1.setForeground(Color.BLACK);
        l1.setBounds(50, 50, 260, 60);

        //Buttons
        b1 = new Button("1");
        b1.setBounds(50, 340, 50, 50);
        b1.setBackground(Color.lightGray);
        b2 = new Button("2");
        b2.setBounds(120, 340, 50, 50);
        b2.setBackground(Color.lightGray);
        b3 = new Button("3");
        b3.setBounds(190, 340, 50, 50);
        b3.setBackground(Color.lightGray);
        b4 = new Button("4");
        b4.setBounds(50, 270, 50, 50);
        b4.setBackground(Color.lightGray);
        b5 = new Button("5");
        b5.setBounds(120, 270, 50, 50);
        b5.setBackground(Color.lightGray);
        b6 = new Button("6");
        b6.setBounds(190, 270, 50, 50);
        b6.setBackground(Color.lightGray);
        b7 = new Button("7");
        b7.setBounds(50, 200, 50, 50);
        b7.setBackground(Color.lightGray);
        b8 = new Button("8");
        b8.setBounds(120, 200, 50, 50);
        b8.setBackground(Color.lightGray);
        b9 = new Button("9");
        b9.setBounds(190, 200, 50, 50);
        b9.setBackground(Color.lightGray);
        b0 = new Button("0");
        b0.setBounds(50, 410, 120, 50);
        b0.setBackground(Color.lightGray);
        bdec = new Button(".");
        bdec.setBounds(190, 410, 50, 50);
        bdec.setBackground(Color.lightGray);

        bclr = new Button("CE");
        bclr.setBounds(50, 130, 60, 50);
        bclr.setBackground(Color.lightGray);
        bbck = new Button("Del");
        bbck.setBounds(120, 130, 50, 50);
        bbck.setBackground(Color.lightGray);
        bmod = new Button("%");
        bmod.setBounds(190, 130, 50, 50);
        bmod.setBackground(Color.lightGray);
        bdiv = new Button("/");
        bdiv.setBounds(260, 130, 50, 50);
        bdiv.setBackground(Color.lightGray);
        bmul = new Button("*");
        bmul.setBounds(260, 200, 50, 50);
        bmul.setBackground(Color.lightGray);
        bsub = new Button("-");
        bsub.setBounds(260, 270, 50, 50);
        bsub.setBackground(Color.lightGray);
        badd = new Button("+");
        badd.setBounds(260, 340, 50, 50);
        badd.setBackground(Color.lightGray);
        bcalc = new Button("=");
        bcalc.setBounds(250, 410, 60, 50);
        bcalc.setBackground(Color.lightGray);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bdec.addActionListener(this);
        bmod.addActionListener(this);
        bmul.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bclr.addActionListener(this);
        bbck.addActionListener(this);
        bcalc.addActionListener(this);


        //Adding Components to Frame
        //Numeric Buttons
        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(bdec);
        //Arithmetic Buttons
        f.add(bclr);
        f.add(bbck);
        f.add(bmod);
        f.add(bdiv);
        f.add(bmul);
        f.add(bsub);
        f.add(badd);
        f.add(bcalc);


        f.setLayout(null);
        f.setSize(360, 500);
        f.setResizable(false);
        f.setVisible(true);

        //Closing the Window
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    //Actions
    @Override
    public void actionPerformed (ActionEvent ae)
    {
      String st = "", r = "";
      //Numeric Buttons
      if(ae.getSource()==b1)
      {
        st =l1.getText();
        r = st + "1";
        l1.setText(r);
      }
      if(ae.getSource()==b2)
      {
        st = l1.getText();
        r = st+"2";
        l1.setText(r);
      }
      if(ae.getSource()==b3)
      {
        st = l1.getText();
        r = st+"3";
        l1.setText(r);
      }
      if(ae.getSource()==b4)
      {
        st = l1.getText();
        r = st+"4";
        l1.setText(r);
      }
      if(ae.getSource()==b5)
      {
        st = l1.getText();
        r = st+"5";
        l1.setText(r);
      }
      if(ae.getSource()==b6)
      {
        st = l1.getText();
        r = st+"6";
        l1.setText(r);
      }
      if(ae.getSource()==b7)
      {
        st = l1.getText();
        r = st+"7";
        l1.setText(r);
      }
      if(ae.getSource()==b8)
      {
        st = l1.getText();
        r = st+"8";
        l1.setText(r);
      }
      if(ae.getSource()==b9)
      {
        st = l1.getText();
        r = st+"9";
        l1.setText(r);
      }
      if(ae.getSource()==b0)
      {
        st = l1.getText();
        r = st+"0";
        l1.setText(r);
      }
      if(ae.getSource()==bdec)
      {
            st = l1.getText();
            r = st+".";
            l1.setText(r);
      }
      //Arithmetic Buttons

      if(ae.getSource()==bbck)
      {
        st = l1.getText();
        try {
            r=st.substring(0,st.length()-1);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            //System.out.println(e);
            return;
        }
        l1.setText(r);
      }
      //Arithmetic Buttons
        if(ae.getSource()==badd)
        {
            try {
                num1 = Double.parseDouble(l1.getText());
            }
            catch (NumberFormatException e)
            {
                l1.setText("Invalid Input");
            }
            r="";
            l1.setText(r);
            check=1;
        }
        if(ae.getSource()==bsub)
        {
            try {
                num1 = Double.parseDouble(l1.getText());
            }
            catch (NumberFormatException e)
            {
                l1.setText("Invalid Input");
            }
            r="";
            l1.setText(r);
            check=2;
        }
        if(ae.getSource()==bmul)
        {
            try {
                num1 = Double.parseDouble(l1.getText());
            }
            catch (NumberFormatException e)
            {
                l1.setText("Invalid Input");
            }
            r="";
            l1.setText(r);
            check=3;
        }
        if(ae.getSource()==bdiv)
        {
            try {
                num1 = Double.parseDouble(l1.getText());
            }
            catch (NumberFormatException e)
            {
                l1.setText("Invalid Input");
            }
            r="";
            l1.setText(r);
            check=4;
        }
        if(ae.getSource()==bmod)
        {
            try {
                num1 = Double.parseDouble(l1.getText());
            }
            catch (NumberFormatException e)
            {
                l1.setText("Invalid Input");
            }
            r="";
            l1.setText(r);
            check=5;
        }

        //Result
        if(ae.getSource()==bcalc)
            try{
                num2 = Double.parseDouble(l1.getText());
            }
        catch (Exception e)
        {
            System.out.println("Enter the first Number");
        }
        if(check != 0)
        {
            if(check==1)
                result = num1+num2;
            if(check==2)
                result = num1-num2;
            if(check==3)
                result = num1*num2;
            if(check==4)
                result = num1/num2;
            if(check==5)
                result = num1%num2;
            l1.setText(String.valueOf(result));
        }
        

        //For Resetting
        if(ae.getSource()==bclr){
            num1=0;
            num2=0;
            check=0;
            result=0;
            r="";
            l1.setText(r);
        }

    }


    public static void main(String[] args) {
        test1 c = new test1();
    }

}