import java.util.Scanner;

class Shape {
	double a, b;
	
	public void getDimension() {
		
		
		
		
		
	}
	
	public void area() {
		//		System.out.println("");
		System.out.println("Area");
	}
}

class Rectangle extends Shape {
	@Override
	public void area() {
		double area = a*b;
		System.out.println();
		System.out.println("Area of the rectangle is: " + area);
		System.out.println();
		System.out.println();
	}
}

class Circle extends Shape {
	@Override
	public void area() {
		double area = 3.14*a*a;
		System.out.println();
		System.out.println("Area of the rectangle is: " + area);
		System.out.println();
		System.out.println();
	}
}

class Triangle extends Shape {
	@Override
	public void area() {
		double area = 0.5*a*b;
		System.out.println();
		System.out.println("Area of the rectangle is: " + area);
		System.out.println();
		System.out.println();
	}
}


public class MethodOverriding {

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		
		Shape s1;
		
		while(true) {
			
			
			System.out.println("Choose any shape: ");
			System.out.println("1. Rectangle");
			System.out.println("2. Circle");
			System.out.println("3. Triangle");
			System.out.println("4. Exit");
			System.out.print("Choice: ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				s1 = new Rectangle();
				
				System.out.print("Enter length: ");
				s1.a = sc.nextDouble();
				System.out.print("Enter breadth: ");
				s1.b = sc.nextDouble();
				
				s1.area();
			}
			else if(choice == 2) {
				s1 = new Circle();
				System.out.print("Enter radius: ");
				s1.a = sc.nextDouble();
				s1.b = 0;
				
				s1.area();
			}
			else if(choice == 3) {
				s1 = new Triangle();
				System.out.print("Enter base: ");
				s1.a = sc.nextDouble();
				System.out.print("Enter height: ");
				s1.b = sc.nextDouble();
				
				s1.area();
			}
			else if(choice == 4) {
				break;
			}
			else {
				System.out.println("Invalid Choice!!");
			}
		}

	}

}
