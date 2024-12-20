/*Given an integer numRows, return the first numRows of Pascal's triangle.

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

DATE:5|11|24
*/

import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle =new  ArrayList<>();
         for(int i=0;i<numRows;i++){
            List<Integer> row =new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                int val=triangle.get(i-1).get(j-1)+ triangle.get(i-1).get(j);
                row.add(val);
            }
            if(i>0)
                row.add(1);
            triangle.add(row);
         }
         return triangle;
    }
}
