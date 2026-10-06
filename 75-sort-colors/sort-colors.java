class Solution {
    public void sortColors(int[] nums) {
       int left=0;
       int current=0;
       int right=nums.length-1;
       while(current<=right){
        if(nums[current]==0){
            int temp=nums[current];
            nums[current]=nums[left];
            nums[left]=temp;
             left++;
             current++;
        }else if(nums[current]==1){
 current++;
        }else{
            int temp=nums[current];
            nums[current]=nums[right];
            nums[right]=temp;
            right--;
        
        }
       }
    }
}