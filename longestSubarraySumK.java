class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
      int len=0;
      HashMap<Integer,Integer>mpp=new HashMap<>();
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
          sum=sum+arr[i];
          
          if(sum==k)
          {
              len=Math.max(len,i+1);
          }
          
          if(!mpp.containsKey(sum))
          {
              mpp.put(sum,i);
          }
          
          if(mpp.containsKey(sum-k))
          {
              len=Math.max(len,i-mpp.get(sum-k));
          }
      }
      return len;
    }
}
