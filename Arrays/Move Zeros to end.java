/*  Naive solution
class Main
{
    public static void main(String args[])
    {
      // Move zeors to the end
        int[] arr={10,0,20,0,30,40,0,60};
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i] == 0)
                {
                    for(int j=i+1;j<arr.length;j++)
                        {
                            if(arr[j] != 0)
                            {
                                // swap
                                int temp=arr[j];
                                arr[j]=arr[i];
                                arr[i]=temp;
                            }
                        }
                }
            }
        
    System.out.print(Arrays.toString(arr));
    }   
}

*/

// Efficent solution
import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
         int[] arr={10,60,0,40,0,30,0,20};
        int count=0;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i] != 0)
                {
                    int temp=arr[i];
                    arr[i]=arr[count];
                    arr[count]=temp;
                    count++;;
                }
            }
        System.out.print(Arrays.toString(arr));
    }
}
