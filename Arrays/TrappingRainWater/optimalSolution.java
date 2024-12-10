import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,0,6,2,3};
        int length=arr.length;
        int[] larr=new int[length];
        int[] rarr=new int[length];
        // left max arr
        larr[0]=arr[0];
       int lmax=arr[0];
        for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>lmax)
                    lmax=arr[i];
                larr[i]=lmax;
            }
        rarr[length-1]=arr[length-1];
        int rmax=arr[length-1];
        for(int i=length-2;i>=0;i--)
            {
                if(arr[i]>rmax)
                    rmax=arr[i];
                rarr[i]=rmax;
            }
        int res=0;
        for(int i=0;i<arr.length;i++)
            {
                res+=Math.min(larr[i],rarr[i])-arr[i];
            }
        System.out.print("The amount of Water Trapped: "+res);
      // The time complexity of the solution is O(N)
    }
}
