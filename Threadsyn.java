/*								Thread Synchronization
 * 
Write a multithreaded java program to create the addition table for for any 2
given numbers( limit 10) and implement thread synchronization while generating
the table.
*/
package module;
import java.util.Scanner;
class Table {
	public void printtable(int n) {
		synchronized(this) {
			for(int i=0;i<10;i++) {
			System.out.println(n+" + "+i+" = "+(n+i));
		}
			 System.out.println("---------------------");
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
  }
}
class Mythread1 extends Thread{
	Table t,object;
	int num1;
public Mythread1(Table t) {
	object=t;
	}
  public void run() {
	 object.printtable(num1);
 }

}
class Mythread2 extends Thread{
	Table table;
	int num2;
public Mythread2(Table table) {
	this.table=table;
	}
  public void run() {
	 table.printtable(num2);
 }	
}
public class Threadsyn {
 public static void main(String[] args) {
	 Table table=new Table();
	 Mythread1 mythread1=new Mythread1(table);
	 Mythread2 mythread2=new Mythread2(table);
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number for finding the addition table of it using thread1");
	 mythread1.num1=sc.nextInt();
	 System.out.println("Enter the number for finding the addition table of it using thread2");
	 mythread2.num2=sc.nextInt();
	 mythread1.start();
	
	 mythread2.start();
 }
}
