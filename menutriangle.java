import java.util.Scanner;
public class menutriangle 
{
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int s,b,a,c;
	double area=0.0d,d=0.0d;
	System.out.println("The results that will be given are");
	System.out.println("1.Equilateral triangle");
	System.out.println("2.Isosceles triangle");
	System.out.println("3.Scalene triangle");
	System.out.println("Enter your choice:");
	int n=sc.nextInt();
	switch(n)
		{
	case 1:
		System.out.println("Enter the side of the triangle");
		s=sc.nextInt();
		area=(Math.sqrt(3)/4)*s*s;
		System.out.println("The area is "+area);
		break;
	case 2:
		System.out.println("Enter the side and base of the triangle");
		s=sc.nextInt();
		b=sc.nextInt();
		area=(b/4)*(Math.sqrt((4*s*s)-(b*b)));
		System.out.println("The area is "+area);
		break;
	case 3:
		System.out.println("Enter the 3 sides of the triangle");
		s=sc.nextInt();
		a=sc.nextInt();
		c=sc.nextInt();
		d=(s+a+c)/2.0;
		area=(Math.sqrt(d*(d-s)*(d-a)*(d-c)));
		System.out.println("The area is "+area);
		break;
		default:
			System.out.println("Invalid option");
			
		}
	}

private static double d(double d) {
	// TODO Auto-generated method stub
	return 0;
}
}
