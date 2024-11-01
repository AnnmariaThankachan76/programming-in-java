/* Write a Java program to create an abstract class GeometricShape 
 * with abstract methods area() and perimeter(). 
 * Create subclasses Triangle and Square that extend the GeometricShape class 
 * and implement the respective methods to calculate the area and perimeter of each shape. 
	Date:1|11|24  
	question:w3resources abstract class
*/
package module;
import java.util.*;
abstract class  GeometricShape{
	abstract void area();
	abstract void perimeter();
}
class Triangle extends GeometricShape{
	float area;
	float perimeter;
	void area(int base ,int height) {
		area=(float)(.5*base)*height;
		System.out.println("The area of the triangle is "+area);
	}
	void perimeter(int side1,int side2,int side3) {
		perimeter=side1+side2+side3;
		System.out.println("The perimeter of the triangle is "+perimeter);
	}
}
class Square extends GeometricShape{
	float area;
	float perimeter;
	void area(int side){
		area=side*side;
		System.out.println("The area of the triangle is "+area);
	}
	void perimeter(int side) {
		perimeter=4*side;
		System.out.println("The perimeter of the triangle is "+perimeter);
	}
}

public class Abstractshape {
	public static void main(String[] args) {
		Triangle triangle=new Triangle();
		Square square=new Square();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and height of Triangle");
		int base=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("Enter the sides of the triangle");
		int side1=sc.nextInt();
		int side2=sc.nextInt();
		int side3=sc.nextInt();
		System.out.println("Enter the side of square");
		int sides=sc.nextInt();
		System.out.println("---------------------------------------------");
		triangle.area(base, height);
		triangle.perimeter(side1, side2, side3);
		System.out.println();
		square.area(sides);
		square.perimeter(sides);
}
}
