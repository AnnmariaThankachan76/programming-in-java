import java.util.Scanner;
public class Rectangle
{
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter length and breath of rectangle");
	int l=sc.nextInt();
	int b=sc.nextInt();
	int area=l*b;
	System.out.println(" The Area is "+area);
	}
}