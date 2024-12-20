/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

 Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Date.2|10|24
 */
package module;
import java.util.*;
class Arraysuml{
    public int[] twoSum(int[]arr,int target){
        Map<Integer,Integer>maps=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int reminder=target-num;
            if(maps.containsKey(reminder)){
                return new int[]{maps.get(reminder),i};
            }
            maps.put(num,i);
        }
        return new int[]{};
    }
}