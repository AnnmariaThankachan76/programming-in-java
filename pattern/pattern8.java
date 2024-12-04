/*pattern :
 * 	1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
date :4th dec,2024	
 */

package workouts;
public class pattern8 {
	public static void main(String[] args) {
		int i,j;
		int n=5;
		int r=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" "+r);
				r++;
			}
			System.out.println();
		}
	}
}
