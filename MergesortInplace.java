import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[]=new int[]{5,4,3,2,1};
        MergeSorting(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void MergeSorting(int arr[],int s,int e)
    {
        if(e-s==1)
        {
            return;
        }

         int mid = s + (e - s) / 2;

    MergeSorting(arr, s, mid);
      MergeSorting(arr, mid, e);

         merge(arr, s,mid,e);


    }
    public static void merge(int []arr,int s,int m,int e)
    {
        int mix[]=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<m)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
         while(j<e)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        
        for(int li=0;li<mix.length;li++)
        {
            arr[s+li]=mix[li];

        }
    }

    
}
