class Solution {
    public List<Integer> majorityElement(int[] nums) {
         int candidate1=nums[0];
        int candidate2=nums[0];
        int count1=0;
        int count2=0;
        for(int value:nums){
            if(value==candidate1){
                count1++;
            }else if(value==candidate2){
                count2++;
            }else if(count2==0){
                candidate2=value;
                count2=1;
            }else if (count1 == 0) {
                candidate1 = value;
                count1 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        int var1=0;
        int var2=0;
        int target=nums.length/3;
        for(int value:nums){
            if(value==candidate1){
                var1++;
            }else if(value==candidate2){
                var2++;
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
        if(var1>target){
            arr.add(candidate1);
        }
        if(var2>target&&candidate2!=candidate1){
            arr.add(candidate2);
        }
        return arr;
    }
}