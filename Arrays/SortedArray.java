import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // finding the array is sorted or not
        int[] arr={10,10,10,20,20,0};
        boolean b=true;
        for(int i=0;i<arr.length-1;i++)
        {
                if(arr[i]>arr[i+1])
                {
                       b=false;
                    break;
                }               
        }
        System.out.print(b);
    }
    
}
