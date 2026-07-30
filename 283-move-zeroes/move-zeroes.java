class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>(); // FIX: empty list, Arrays.asnums hata diya
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr.add(nums[i]);
            }
        }
        int[] result = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {
            if (k < arr.size()) {
                result[k] = arr.get(k);
            } else {
                result[k] = 0;
            }
        }
         for (int m = 0; m < nums.length; m++) {
            nums[m] = result[m];
        }
    }
}