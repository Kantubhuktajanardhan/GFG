// sorted array
import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
       // Revome Duplicates of the sorted array
        int[] arr={10,10,20,30,40,40,50};
        int length=arr.length;
        int[] temp=new int[length];
        temp[0]=arr[0];
        int size=1;
        for(int i=1;i<length;i++)
            {
                if(arr[i] != temp[size-1])
                {
                    temp[size]=arr[i];
                    size++;
                }
            }
        arr=temp;
        System.out.print(Arrays.toString(arr));
    }
    
}
