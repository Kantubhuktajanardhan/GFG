import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // finding the second highest in the array in a single iteration
        int[] arr={20,30,50,60};
        int res=-1;
        int large=0;
        for(int i=1;i<arr.length;i++)
            {
                if(arr[i] >arr[large])
                {
                    res=large;
                    large=i;                   
                }
                else if( arr[i] != arr[large])
                {
                    if(res == -1 || arr[i]>arr[res])
                    {
                        res=i;
                    }
                }
            }
System.out.print(res);
    }
    
}
