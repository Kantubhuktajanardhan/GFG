
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={5,0,6,2,3};
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            int lmax=arr[i];
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]>lmax)
                lmax=arr[j];
            }
            int rmax=arr[i];
            for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]>rmax)
                    rmax=arr[j];
                }
            res=res+(Math.min(lmax,rmax)-arr[i]);
        }
        System.out.print("The water level trapped in the heights is: "+res);
        // time complexity of the solution is O(n^2)
    }
}
