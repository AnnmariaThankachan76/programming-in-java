/*Write a Java program to create an interface Resizable 
 * with methods resizeWidth(int width) and resizeHeight(int height) 
 * that allow an object to be resized. Create a class Rectangle that 
 * implements the Resizable interface and implements the resize methods. 
 * */
package module;

import java.util.Scanner;
 interface Resizable{
	 public void resizeWidth(int width,int w);
	 public void resizeHeigth(int height,int h);
 }
 class Rectangle implements Resizable{
	 public void resizeWidth(int width,int w) {
		 
		 System.out.println("the width has been changed from "+w+" to "+width);
	 }
	 public void resizeHeigth(int height,int h) {
		 System.out.println("the width has been changed from "+h+" to "+height);
	 }
	 
 }
public class InterfaceResize {
	public static void main(String[] args) {
		System.out.println("Enter the intinal width anf height of rectangle");
		Scanner sc=new Scanner(System.in);
		 int w=sc.nextInt();
		 int h=sc.nextInt();
		System.out.println("Enter the new width and height to resize the rectangle");
		int width=sc.nextInt();
		int height=sc.nextInt();
		System.out.println("The initial dimentions of Rectangle were width="+w+" height="+h);
		System.out.println("Now");
		Rectangle rectangle=new Rectangle();
		rectangle.resizeWidth(width,w);
		rectangle.resizeHeigth(height, h);
	}

}
