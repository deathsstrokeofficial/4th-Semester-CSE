import java.util.Scanner;

class MyException extends Exception {
    MyException() {
        System.out.println("My Exception!");
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        
        int data;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for user defined exception: ");
        data = sc.nextInt();

        try {
            if(data == 0) {
                throw new MyException();
            }
            else {
                System.out.println("No exceptions encountered!");
            }
        }
        catch(Exception e) {
            System.out.println("Exception::" + e);
        }
        


    }
    
}