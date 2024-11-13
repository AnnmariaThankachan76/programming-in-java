class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-1)/2;
            if(nums[mid]==key)
                return mid;
            else if(nums[mid]> key )
                 r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
