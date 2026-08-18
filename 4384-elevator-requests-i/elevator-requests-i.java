class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int i=0;
        int sum=0;
        int z=0;
        
        while(i<requests.length){
            if(i==0){
              z=0-requests[0];
                sum+=Math.abs(z); 
                z=0;
            }else{
        
              z=requests[i-1]-requests[i];
              sum+=Math.abs(z); 
                z=0;
            }
            i++;
        }
        return sum;
    }
}