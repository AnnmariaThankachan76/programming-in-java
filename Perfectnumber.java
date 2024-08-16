//example=6. factors=1,2,3   1+2+3=6
import java.util.Scanner;
public class Perfectnumber
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked as perfect number");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
         if(sum==n)
        	 System.out.println("Yes, it is a perfect number");
         else
        	 System.out.println("Sorry, it is not a perfect number");
	}
}
         