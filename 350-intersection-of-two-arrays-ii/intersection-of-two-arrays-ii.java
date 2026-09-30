class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> count = new HashMap<>();

        
        for (int value : nums1) {
            count.put(value, count.getOrDefault(value, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        
        for (int value : nums2) {
            if (count.getOrDefault(value, 0) > 0) {
                list.add(value);
                count.put(value, count.get(value) - 1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}