import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // finding the larger element in the array'
      int[] arr={10,4,54,19,23,100};
     int largest=Integer.MIN_VALUE;
    int index=0;
    for(int i=0;i<arr.length;i++)
        {
            if(arr[i] >largest)
            {
                largest=arr[i];
                index=i;
            }
        }
        System.out.print("Index: "+index+"      "+largest);
        
        
    }
}
