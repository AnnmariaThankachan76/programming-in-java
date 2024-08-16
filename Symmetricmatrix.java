import java.util.Scanner;
public class Symmetricmatrix 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int i,j,flag=0;
	int a[][]=new int[20][20];
	int b[][]=new int[20][20];
	System.out.println("Enter the dimentions of the matrix\n");
	System.out.println("Enter the row of the matrix\n");
	int r=sc.nextInt();
	System.out.println("Enter the column of the matrix \n");
	int c=sc.nextInt();
	if(c==r)
	{
	System.out.println("Enter the matrix to be checked");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
		a[i][j]=sc.nextInt();	
		}
	}
	System.out.println("the entered matrix is:\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.println(a[i][j]+"\n");
		}
		//System.out.println("\n");
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			b[i][j]=a[j][i];
			
		}
	}


	
	System.out.println("the transpose of the matrix is:\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			System.out.println(b[i][j]+"\n");
			
		}
		//System.out.println("\n");
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(b[i][j]!=a[i][j]);
			{
				flag=1;
				break;
			}
			
		}
	}
	if(flag==0)
		System.out.println("The matrix is not symmetric\n");
	
	else
		System.out.println("Yes, the matix is symmmetric\n");
	}
	else
		System.out.println("The matrix can't be symmetric because it is not a square matrix\n");
	
		
	
}
}
