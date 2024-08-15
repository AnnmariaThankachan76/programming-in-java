import java.util.Scanner;
public class Multiplicationtable
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p;
		System.out.println("enter the  numberto display its multiplication table");
		int a=sc.nextInt();
		for(int i=0;i<=10;i++)
		{
			p=a*i;
			System.out.println(a+"*"+i+"="+p);
		}
	}
}