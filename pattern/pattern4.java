/*pattern :  * * * *
 * 			 * * *
 * 			 * *
 * 			 *
 * date 4 dec,2024
 * 
 */


package workouts;

public class pattern4 {
	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=4;i++) {
			for(j=5;j>i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
