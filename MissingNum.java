//Cyclic Sort 
// 0-N || 1-N



class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
       while(i<arr.length)
        {
            int corx=arr[i];
            if(corx>=0 && corx<arr.length && arr[i]!=arr[corx])
            {
                int temp=arr[i];
                arr[i]=arr[corx];
                arr[corx]=temp;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!=k)
            {
                return k;
            }
        }return arr.length;

    }
}
