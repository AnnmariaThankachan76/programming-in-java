/*   pattern:     *
 * 			     **
 *              ***
 *             ****
 *             
 *  date :4th dec ,2024
 */


package workouts;
public class pattern5 {
	public static void main(String[] args) {
		int i,j;
		int n=4;
		for(i=1;i<=n;i++) {
			for(j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("*");			
				}
		System.out.println();
	}
	}

}
