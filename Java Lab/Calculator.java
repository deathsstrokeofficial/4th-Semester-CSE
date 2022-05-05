// Creating a simple calculator using switch case

import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result=0;
        char op;

        System.out.println();
        System.out.println("***** Calculator *****");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextDouble();
        
        System.out.print("Choose an operation: ");
        op = sc.next().charAt(0);

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        
            default:
                System.out.println("Invalid Choice of operator!!");
                System.out.println();
                break;
        }

        System.out.println();
        System.out.println("Result: " + result);
        System.out.println();
        System.out.println();

        sc.close();
    }
    
}