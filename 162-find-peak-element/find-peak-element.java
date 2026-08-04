class Solution {
    public int findPeakElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums.length==1){
                return i;
            }
            else if(i==0&&nums[i]>nums[i+1]){
             return i;
         }else if(i==nums.length-1&&nums[nums.length-1]>nums[nums.length-2]){
             return nums.length-1;
         }
          else if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]){
             return i;
         }
     }
       return -1; 
    }
}