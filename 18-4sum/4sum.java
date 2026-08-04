class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
          for(int i=0;i<n;i++){
         if(i>0&&nums[i]==nums[i-1]){
            continue;
         }
         for(int j=i+1;j<n;j++){
              if(j>i+1&&nums[j]==nums[j-1]){
            continue;
         }
         int left=j+1;
         int right=n-1;
         
         while(left<right){
         long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
            List<Integer> z=new ArrayList<>();
            if(sum==target){
            z.add(nums[i]);
            z.add(nums[j]);
            z.add(nums[left]);
            z.add(nums[right]);
            arr.add(z);
            while(left<right&&nums[left]==nums[left+1]){
                left++;
            }
            while(left<right&&nums[right]==nums[right-1]){
                right--;
            }
            left++;
            right--;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
         }
         }
     }
     return arr;
    }
}