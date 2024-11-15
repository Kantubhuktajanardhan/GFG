import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // Revome Duplicates of the sorted array
        int[] arr={10,20,30,40,50};
        int res=1;
        for(int i=1;i<arr.length;i++)
            {
                if(arr[i] != arr[res-1])
                {
                    arr[res]=arr[i];
                    res++;
                }
            }
        System.out.println(Arrays.toString(arr));
        System.out.print("The no of distint elements in Array: "+res);
    }
    
}
