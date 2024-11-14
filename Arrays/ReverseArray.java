import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // reverse of the array
        int[] arr={10,20,30,40,50};
        int start=0;
        int end=arr.length-1;
        while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        System.out.print(Arrays.toString(arr));
    }
    
}
