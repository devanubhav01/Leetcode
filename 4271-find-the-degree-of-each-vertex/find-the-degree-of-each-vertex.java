class Solution {
    public int[] findDegrees(int[][] matrix) {
        int sum=0;
        int arr[]=new int[matrix.length];
          for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[i].length;j++){
         sum+=matrix[i][j];
     }
     arr[i]=sum;
     sum=0;
     }
     return arr;
    }
}