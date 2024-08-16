//example.126 sum=1+2+6=9 and 126 is divisible by 9

import java.util.Scanner;
public class Nivennumber
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked whether it is a niven number or not");
		int n=sc.nextInt();
		int number=n;
		int sum=0,num;
		do
		{
		num=n%10;
		sum=sum+num;
		num=num/10;
		}
		while(num!=0);
		if(number%sum==0)
			System.out.println("YES,it is a Niven number\n");
		else
			System.out.println("Sorry,it is not a Niven number\n");
		
	}
}