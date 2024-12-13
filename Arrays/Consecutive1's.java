import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={0,1,1,0,1,1,1};
        int current=0; int res=0;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i] == 0)
                    current=0;
                else
                    current++;
                    res=Math.max(current,res);
            }
        System.out.print("The maximum consecutive 1's are : "+res);
    }
}
