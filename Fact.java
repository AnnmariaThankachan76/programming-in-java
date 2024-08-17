import java.util.Scanner;
public class Fact
{
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" enter the number to find factorial");
	int n=sc.nextInt();
	int i,fact=1;
	for(i=n;i!=0;i--)
	{
	 	fact=fact*i;
	 }
	 System.out.println(" Thefactorial is"+fact);
}
}

