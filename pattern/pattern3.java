/*pattern :  *****
 * 			 *   *
 * 			 *   *
 * 			 *   *
 * 			 *****
 * 
 * date :4 dec ,2024
 */



package workouts;

public class pattern3 {
	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=4;i++) {
			for(j=1;j<=5;j++) {
				if(i==1 || j==1 || j==5 || i==4 ) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
	}
}
