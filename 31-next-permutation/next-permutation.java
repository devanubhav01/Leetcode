class Solution {
    public void nextPermutation(int[] nums) {
         int n=nums.length;
        if (n <= 1) {
            return;
        }
        int pivot=n-2;
       while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

          if (pivot < 0) {
            Arrays.sort(nums);
            return;
        }
        int successor=pivot+1;
        for(int i=pivot+1;i<n;i++){
            if(nums[i]>nums[pivot]&&nums[i]<=nums[successor]){
                successor=i;
            }
        }
         int temporary = nums[pivot];
        nums[pivot] = nums[successor];
        nums[successor] = temporary;

        
        Arrays.sort(nums, pivot + 1, n);
    }
}