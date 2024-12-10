// buy and sell stock
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int[] arr={1,5,3,8,12};
        int start=0;
        int end=arr.length-1;
        int res=maxprofit(arr,start,end);
        System.out.print("The maximum profit: "+res);
    }

    public static int maxprofit(int[] arr,int start,int end)
    {
        
        if(end<=start)
            return 0;
        int profit=0;
        for(int i=start;i<end;i++)
            {
                for(int j=i+1;j<=end;j++)
                    {
                        if(arr[j]>arr[i])
                        {
                              int current_profit=arr[j]-arr[i]+maxprofit(arr,start,i-1)+maxprofit(arr,j+1,end);
                              profit= Math.max(current_profit,profit);
                        }
                    }
            }
        return profit;
    }
}
