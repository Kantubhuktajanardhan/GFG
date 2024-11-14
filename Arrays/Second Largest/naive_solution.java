import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // finding the second largest element in the array
        // naive solution O(n^2)
       // int[] arr={10,10,10};
        int[] arr={10,20,30,40,50};
        int largest=firstLargest(arr);
        int res=-1;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i] != arr[largest])
                {
                    res=i;
                }
                if(res != -1)
                {
                    if(arr[i] > arr[res])
                    {
                        res=i;
                    }
                }
            }   
      System.out.print(res);
    }
    public static int firstLargest(int[] arr)
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>arr[res])
                {
                    res=i;
                }
            }
        return res;
    }
}
