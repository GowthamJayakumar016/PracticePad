class Solution {
    public int[] twoSum(int[] arr, int target) {
       HashMap<Integer,Integer> mpp=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
        int rem=target-arr[i];
        if(mpp.containsKey(rem))
        {
            return new int []{i,mpp.get(rem)};
        }
        else {
            mpp.put(arr[i],i);
        }
       }
       
        return new int[]{-1,-1};
    }
}
