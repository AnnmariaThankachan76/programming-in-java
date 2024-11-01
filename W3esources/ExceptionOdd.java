/*Write a Java program to create a method that
 *  takes an integer as a parameter and throws 
 *  an exception if the number is odd. 
 *  date: 1|11|24
 *  resources"W3resorces exception
 */
package module;
import java.util.*;
class OddException extends Exception{
	OddException(String message){
		super(message);
	}
}

class Validateodd{
	Validateodd(int number)throws OddException{
		if((number%2)!=0) {
			throw new OddException("The entered number is odd.");
			}
			else {
				System.out.println("YES,entered number is even");
			}
		}
}
public class ExceptionOdd {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked whether the number is odd or even");
		int number=sc.nextInt();
		try {
			Validateodd validateodd=new Validateodd(number);
			}
		catch(OddException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
