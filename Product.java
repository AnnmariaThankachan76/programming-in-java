import java.util.Scanner;
public class Product {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers to find the product of two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int p=a*b;
		System.out.println("the product of "+a+" and "+b+" is " +p);
		
	}
}
