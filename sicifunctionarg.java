import java.io.*;
public class sicifunctionarg 
{
	public static void main(String[] arg)throws IOException
	{ 
		int p,r,t;
		InputStreamReader read= new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		System.out.println("Enter the values of principle,rate and time \n");
		p=Integer.parseInt(in.readLine());
		r=Integer.parseInt(in.readLine());
		t=Integer.parseInt(in.readLine());
		
		double si=0.0d,amt=0.0d,ci=0.0d,diff=0.0d;
		si=(p*r*t)/100.0;
		amt = p*(Math.pow((1+(r/100.0)), t));
		ci= amt-p;
		diff=ci-si;
		System.out.println("The simple interest is "+si);
		System.out.println("The compound  interest is "+ci);
		System.out.println("The difference between simple interest and compound interest is "+diff);
	}
}
