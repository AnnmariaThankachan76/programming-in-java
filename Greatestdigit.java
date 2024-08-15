import java.util.Scanner;
public class Greatestdigit 
{
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a,b,c,gn=0,sn=0;
	System.out.println("ENTER THE 3 DIGITS TO FIND THE LARGEST AND THE SMALLEST NUMBER THE CAN BE FOUND");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if((a>b)&&(a>c))
	{
		if(b>c)
		{
			gn=a*100+b*10+c;
			sn=c*100+b*10+a;
		}
		else
		{
			gn=a*100+c*10+b;
			sn=b*100+c*10+a;
		}
	}
	if((b>a)&&(b>c))
	{
		if(a>c)
		{
			gn=b*100+a*10+c;
			sn=c*100+a*10+b;
		}
		else
		{
			gn=b*100+c*10+a;
			sn=a*100+c*10+b;
		}
	}
	if((c>a)&&(c>b))
	{
		if(a>b)
		{
			gn=c*100+a*10+b;
			sn=b*100+a*10+c;
		}
		else
		{
			gn=c*100+b*10+a;
			sn=a*100+b*10+c;
		}
	}
	System.out.println("The greatest number that can be found is "+gn);
	System.out.println("The smallest number that can be found is "+sn);
	
	}
}
