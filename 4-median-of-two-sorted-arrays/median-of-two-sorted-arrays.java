class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int[] merged=new int[nums1.length+nums2.length]; 
      // Copy arr1
        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        // Copy arr2
        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }
        for (int i = 0; i < merged.length - 1; i++) {

            for (int j = 0; j < merged.length - 1 - i; j++) {

                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }
        double z=0.00000;      
        // Print merged array using normal for loop
    
            if(merged.length%2==0){
                z=(merged[((merged.length/2)-1)]+merged[merged.length/2])/2.00000;
                
            }else{
                z=merged[(merged.length-1)/2];
            }
            
        return z;
        
    }
    
}