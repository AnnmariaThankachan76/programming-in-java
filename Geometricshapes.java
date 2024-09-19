
import java.util.Scanner;
abstract class Geometricshapes1 {
abstract void  area();
abstract void perimeter();
}
 class Rectangle extends Geometricshapes1{
	 void area(float length,float breath) {
		System.out.println("the area of the rectangle"+length*breath);
		}
	void perimeter(float length,float breath) {
		System.out.println("the perimeter of the rectangle"+2*(length*breath));	
	}
}
 class Square extends Geometricshapes1{
	 void  area(int side) {
		 System.out.println("the area of the Square "+side*side);
	 }
	 void perimeter(int side) {
		 System.out.println("the perimeter of the Square "+(4*side));
	 }
}
public class Geometricshapes{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breath of rectangle ");
		float length=sc.nextFloat();
		float breath=sc.nextFloat();
		Rectangle rectangle=new Rectangle();
		rectangle.area(length,breath);
		rectangle.perimeter(length,breath);
		System.out.println("------------------------------- ");
		System.out.println("Enter the length of one  side of the square  ");
		int sides=sc.nextInt();
		Square square=new Square();
		square.area(sides);
		square.perimeter(sides);
		
	}
	
}