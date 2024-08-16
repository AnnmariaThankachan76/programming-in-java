import java.util.Scanner;
public class Compositeorsmallest
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("1.To check and display whether a number is composite or not\n");
		System.out.println("2.To print the smallest digit ina number \n");
		System.out.println("Enter your option\n");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			int flag=0;
			System.out.println("Enter the number \n");
			int n=sc.nextInt();
			for(i=2;i<n;i++)
			{
				if(n%i!=0)
					flag=1;
					break;
			}
			if(flag==0)
				System.out.println("Yes, it is a composite number");
			else
				System.out.println("no,it is not a composite number");
			break;
			
		case 2:
			System.out.println("Enter the number\n");
			int st=sc.nextInt();
			int small=9,p;
			while(st>0)
			{
				p=st%10;
				if(p<small)
					{
						small=p;
					}
				st=st/10;
			}
			System.out.println("The smallest digit is "+small);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
			
			
			
			
			
		
		