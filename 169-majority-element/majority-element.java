class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                z=nums[i];
            }
            if(nums[i]==z){
                c++;
            }
            else{
                c--;
            }
        }
        return z;
    }
}