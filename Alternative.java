class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans []=new int [nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
               if(pos<nums.length) ans[pos]=nums[i];
                pos=pos+2;
            }
            else{
               if(neg<nums.length)ans[neg]=nums[i];
               neg=neg+2; 
            }
        }
        return ans;
    }
}
