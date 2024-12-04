/*pattern : 1
 * 			12
 * 			123
 * 			1234
 * 			12345
 * date: 4th dec,2024
 */


package workouts;
public class pattern6 {
	public static void main(String[] args) {
		int i,j;
		int n=5;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
