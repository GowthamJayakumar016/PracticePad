class Solution {
    int thirdLargest(int arr[]) {
      
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>f)
            {
                t=s;
                s=f;
                f=arr[i];
            }
            else if (arr[i]>s )
            {
                t=s;
                s=arr[i];
            }
            else if(arr[i]>t )
            {
                t=arr[i];
            }
        }
        return t==Integer.MIN_VALUE?-1:t;
    }
}
