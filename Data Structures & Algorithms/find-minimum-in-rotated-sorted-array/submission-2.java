class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<end){
         mid=(start+end)/2;
         if (nums[start] < nums[end]) {
    return nums[start];
}
         if(nums[start]>nums[mid]){
                //left is not sorted
                end=mid;
         }else{
            start=mid+1;
         }
        }
        return nums[start];
    }
}
