class Solution {
    public int[] plusOne(int[] digits) {
          int[] arr=new int[digits.length+1];
         if(digits[digits.length-1]<9){
           digits[digits.length-1]= digits[digits.length-1]+1;
         }else if(digits[digits.length-1]==9&&digits.length==1){
           arr[0]=1;
           arr[1]=0;
           return arr;
         }
         else if( digits[digits.length-1] ==9&&digits.length>1 ){
            digits[digits.length-1]=0;
            int i=2;
            while(i<=digits.length&&digits[digits.length-i]==9){
              
               digits[digits.length-i]=0;
            
               i++;
            }
            if(digits[0]==0){
                  for(int j=0;j<digits.length+1;j++){
        
         if(j==0){
            arr[j]=1;
         }else{
          arr[j]=0;
         }
          return arr;
     }
            }
            digits[digits.length-i]=digits[digits.length-i]+1;
         }
     
     return digits;
    }
}