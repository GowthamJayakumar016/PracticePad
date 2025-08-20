class Solution {
    public int getSecondLargest(int[] arr) {
       int Largest=0;
       int SecondLargest=0;
       if(arr.length<=1)
       {
           return -1;
       }
       
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]>Largest)
           {
              SecondLargest=Largest;
              Largest=arr[i];
           }
           else if(SecondLargest<arr[i] && arr[i]!=Largest && arr[i]<Largest)
            {
                   SecondLargest=arr[i];
               }
           }
       
       
       if(SecondLargest==0)return -1;
        
        return SecondLargest;
    }
}
