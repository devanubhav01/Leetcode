class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }else if(nums[i]==target-1){
return i+1;
            }else if(nums[i]==target+1&&i!=0){
return i;
            }else if(nums[nums.length-1]<target){
return nums.length;
            }
        }
        return 0;
    }
}