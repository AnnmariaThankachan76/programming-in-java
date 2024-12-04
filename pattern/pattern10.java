/*pattern:
 * 		1
 * 		0 1
 * 		1 0 1
 * 		0 1 0 1
 * 		1 0 1 0 1
 * date: 4th dec,2024
 */


package workouts;

public class pattern10 {
    public static void main(String[] args) {
        int i, j;
        int n = 5;
        
        // Loop through rows
        for (i = 1; i <= n; i++) {
            // Loop through columns in each row
            for (j = 1; j <= i; j++) {
                int sum = i + j;
                
                // Check if the sum is even or odd
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
