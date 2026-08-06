class Solution {
    public int maxProduct(int[] nums) {
       int largest=0;
       for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
        int ans=(nums[i]-1)*(nums[j]-1);
        if(ans>largest){
            largest=ans;
        }
        }
        
       }
       return largest;
    }
}