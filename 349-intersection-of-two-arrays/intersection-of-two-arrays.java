class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> arr1=new HashSet<>();
        Set <Integer> arr2=new HashSet<>();
        for(int value:nums1){
            arr1.add(value);
        }
        for(int value:nums2){
           if(arr1.contains(value)){
            arr2.add(value);
           }
        }
        int[] arr = new int[arr2.size()];

int i = 0;
for (int x : arr2) {
    arr[i] = x;
    i++;
}
return arr;
    }
}