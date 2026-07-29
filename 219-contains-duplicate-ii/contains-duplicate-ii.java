class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> nda=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nda.containsKey(nums[i])){
                int lastIndex=nda.get(nums[i]);
                if(i-lastIndex<=k){
                    return true;
                }
            }
            nda.put(nums[i],i);
        }
       return false; 
    }
}