import java.util.Scanner;
import java.lang.Math;

public class TechNumber {

    public static boolean check(int n, int digits) {

        // Using some temporary variables
        // temp1 to store 1st half of n, temp2 to store 2nd half of n
        // t to store a temporary value(for convenience)
        // sum to store the "sum" of the two halves
        int temp1, temp2, t, sum;

        t = (int) Math.pow(10, (digits/2));

        // The number modulo t gives us the last half of the number
        temp1 = n%t;
        // System.out.println(temp1);

        // The number minus the last half and divided by 't' gives the other part
        temp2 = (n-temp1)/t;
        // System.out.println(temp2);

        // Setting sum equals to sum of the two parts
        sum = temp1 + temp2;

        // Storing the square root of sum in "sqroot"
        int sqroot = (int) Math.sqrt(sum);

        // If the sq. root on squaring gives exactly the number that is same as "sum". Then "sum" is a perfect square. Return true.
        if(sum == sqroot*sqroot) {
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        
        // Initializing the Scanner object sc
        Scanner sc = new Scanner(System.in);

        // Initializing variables num(to store the given input), counter(to count the number of digits in num)
        int num, counter=1;

        // temp is initialized to 10, because place value of 2nd digit is 10. Using temp to get the number of digits.
        int temp = 10;

        // Getting user input.
        System.out.print("Enter number: ");
        num = sc.nextInt();

        // Using while loop to get the number of digits. It checks if the number on dividing by 10 to the power something
        // is the number again. If yes then we reached the end of our loop and the counter variable gives the no. of digits
        while((num%temp) != num) {
            counter++;
            temp *= 10;
        }

        // System.out.println(counter);

        // If-else condition. If the output of the "check" function is true then Yes. Else No.
        if(check(num, counter)) {
            System.out.println("Yes, it is a tech number.");
        }
        else {
            System.out.println("No, it is not a tech number.");
        }
    }
}
