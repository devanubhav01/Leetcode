class Solution {
    public int[] searchRange(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = nums.length-1; j >=i; j--) {

                if (nums[i] == target && nums[j] == target) {

                    int[] arr = { i, j };
                    return arr;
                }

            }
        }

        int[] arr = { -1, -1 };
        return arr;
    }
}