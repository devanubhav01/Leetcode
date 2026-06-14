class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int z=0;
             for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    z++;
                }
             }
             if(z>1){
                return nums[i];
             }
        }
        return -1;
    }
}