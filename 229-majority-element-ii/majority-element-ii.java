class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          arr.put(nums[i], arr.getOrDefault(nums[i], 0) + 1);
          if (arr.get(nums[i]) > nums.length / 3&&!a.contains(nums[i])){
            
         a.add(nums[i]);
            
     }
     }
     
     Collections.sort(a); 
     return a;
    }
}