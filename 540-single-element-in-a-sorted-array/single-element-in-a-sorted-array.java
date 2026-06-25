class Solution {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums.length==1){
                return nums[0];
            }
           else if (i != 0 && i != (nums.length - 1) && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]||i == 0 && nums[i] != nums[i + 1]
                    || i == (nums.length - 1) && nums[nums.length - 1] != nums[nums.length - 2]) {
                return nums[i];
            } 
        }
        return -1;
    }
}