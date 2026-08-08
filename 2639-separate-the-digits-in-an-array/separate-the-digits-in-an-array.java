class Solution {
    public int[] separateDigits(int[] nums) {
        String s1 = "";           

        for (int i = 0; i < nums.length; i++) {
            s1 += nums[i];            
        }
         
        int[] arr = new int[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);        
            arr[i] = ch - '0';            
        }
        return arr;
    }
}