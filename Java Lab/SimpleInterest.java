import java.util.Scanner;

class SimpleInt {
    double p, r, t, val;

    SimpleInt(double p, double t, double r) {
        this.p = p;
        this.t = t;
        this.r = r;
        val = p + (p*t*r)/100;
    }

    public double value() {
        return val;
    }
}


public class SimpleInterest {
    public static void main(String[] args) {

        double p, r, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        p = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        r = sc.nextDouble();

        System.out.print("Enter time: ");
        t = sc.nextDouble();

        SimpleInt s1 = new SimpleInt(p, r, t);
        System.out.println("The required simple interest is: " + s1.value());


    }
}