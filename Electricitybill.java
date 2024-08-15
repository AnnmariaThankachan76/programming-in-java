import java.util.Scanner;
public class Electricitybill 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double amt=0.0d;
		System.out.println("\tELECTRICITY BILL");
		System.out.println("Enter the name of consumer:");
		String st=sc.nextLine();
		System.out.println("Enter the consumer id:");
		int id=sc.nextInt();
		System.out.println("Enter the unit used:");
		int u=sc.nextInt();
		if(u<=100)
			amt=u*5.50;	
		if((u>100)&&(u>=300))
			amt=(100*5.50)+((u-100)*6.50);
		if((u>300)&&(u>=600))
			amt=(100*5.50)+((200*6.50)+((u-300)*7.50));
		if(u>=600)
			amt=(100*5.50)+((200*6.50)+(300*7.50)+((u-600)*8.50));
			System.out.println("\t*************************************");
			System.out.println("\tRECEIPT");
			System.out.println("Consumers name:"+st);
			System.out.println("Consumer id:"+id);
			System.out.println("The final amount to be paid  is "+amt);
			
		
			
	}

}
