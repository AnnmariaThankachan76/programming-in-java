/*pattern : 12345
 * 			1234
 * 			123
 * 			12
 * 			1
 * date:4th dec,2024
 */


package workouts;
public class pattern7 {
	public static void main(String[] args) {
		int i,j;
		int n=5;
		for(i=n;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
