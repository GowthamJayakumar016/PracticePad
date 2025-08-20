public class Solution {
    public static int longestSubarrayWithSumK(int []arr, long k) {
      int len=0;
      int r=0;
      int l=0;
      long sum=0;
while(r<arr.length){
if(r<arr.length)
        sum+=arr[r];

        while(l<=r && sum>k)
        {
                sum=sum-arr[l];
                l++;
        }
        if(sum==k)
        {
            len=Math.max(len,r-l+1);
        }
         r++;   
    }
      return len;
    }
}
