/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

 Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Date 3|11|24

*/
package module;
import java.util.*;
public class Arrayfound {
	public static void main(String[] args) {
		int arr[]=new int[10];
		int i,n,target,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		 n=sc.nextInt();
		System.out.println("Enter the elements of the array");
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		target=sc.nextInt();
		Find find=new Find();
		result=find.searchInsert(arr, target);
		System.out.println(result);
	}
}
class Find {
    public int searchInsert(int[] nums, int target) {
    	 int i=0;
         while(i<nums.length){
             if(target==nums[i]){
                 return i;
             }
             if(i==0 && target<nums[i]){
                 return i;
             }
             if(i>0 && target>nums[i-1] && target<nums[i]){
                 return i;
             }
             i++;
         }
         return i;
     }
}

