class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count=0;
        int Fcount=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==1)
        {
           count=count+1; 
        }
        else 
        {
            if(count>Fcount)
            Fcount=count;

            count=0;

        }
       }
       if(count>Fcount)
        Fcount=count;
        
        return Fcount;
        
       } 
      
    
}
