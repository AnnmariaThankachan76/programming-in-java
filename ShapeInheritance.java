
/*Write a Java program to create a class called Shape with methods 
 * called getPerimeter() and getArea(). Create a subclass called 
 * Circle that overrides the getPerimeter() and getArea() methods 
 * to calculate the area and perimeter of a circle.
 * */
import java.util.Scanner;
class Shape{
	void getPerimeter(float radius) {
		System.out.println("The perimeter of circle is "+(2*3.14*radius));
	}
	void getArea(float radius){
		System.out.println("The perimeter of the circle is "+(2*3.14*radius));
	}
}
class Circle extends Shape{
 void getPerimeter(float radius) {
		System.out.println("The perimeter of the circle is "+(2*3.14*radius));
	}
	void getArea(float radius){
		System.out.println("The area of the circle is "+(3.14*radius*radius));
	}
}
public class ShapeInheritance {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle circle=new Circle();
	System.out.println("Enter the value of radius");	
	float radius=sc.nextFloat();
	circle.getPerimeter(radius);
	circle.getArea(radius);
	}
	
}