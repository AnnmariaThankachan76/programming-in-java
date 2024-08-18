import java.util.Scanner;
public class Random 
{
public static void main(String[] arg)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose the option you need");
	System.out.println("type 'A' if needed a random number between 1 and the number you entered");
	System.out.println("type 'B' if needed a random number between two numbers as you needed");
	System.out.println("Enter your option below ");
	char ch=sc.next().charAt(0);
	char che=Character.toUpperCase(ch);
	switch(che)
	{
	case 'A':
		System.out.println("Enter the last number \n");
		int n=sc.nextInt();
		int r=(int)(Math.random()*n)+1;
		System.out.println("Your random number is :\n"+r);
		break;
	case 'B':
		System.out.println("Enter the starting number\n");
		int s=sc.nextInt();
		System.out.println("Enter thr final number\n");
		int f=sc.nextInt();
		int ra=(int)(Math.random()*(f-s))+s;
		System.out.println("Your random number is :\n"+ra);
		break;
	default:
		System.out.println("Invalid entry");
		break;
		
	}
}
}
