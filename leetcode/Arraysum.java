package module;
import java.util.*;

class Arraysum {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> maps = new HashMap<>(); // Initialize a hash map

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // Current number in the array
            int remainder = target - num; // Find the required remainder to reach the target

            // Check if the remainder already exists in the map
            if (maps.containsKey(remainder)) {
                // If it does, return the indices as an array
                return new int[]{maps.get(remainder), i};
            }

            // Otherwise, add the current number and its index to the map
            maps.put(num, i);
        }

        // Return an empty array if no solution is found
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array and get elements from the user
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask the user for the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Create an instance of Solution and call the twoSum method
        Arraysum arraysum = new Arraysum();
        int[] result = arraysum.twoSum(arr, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices of elements that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two elements add up to the target.");
        }

        scanner.close();
    }
}

