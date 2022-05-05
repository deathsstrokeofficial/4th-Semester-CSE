import java.util.Scanner;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        
        int arr[] = {0, 1, 2, 3, 4};
        int data;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index(max. size of array is 5): ");
        int index = sc.nextInt();

        try {
            data = arr[index];
            System.out.println("Data at index " + index + " is " + data);
        } catch (Exception e) {
            System.out.println("Exception::" + e);
        }



    }
    
}