/* pattern:
 * 		1
		00
		111
		0000
		11111
		
date: 4th dec,2024
*/

package workouts;
public class pattern9 {
	public static void main(String[] args) {
		int i,j;
		int n=5;
		int r=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				if(i==1 || i==3 ||i==5)
				System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
}
}