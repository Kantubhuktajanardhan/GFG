import java.util.*;
public class Main {
    public static void main(String[] args) {

        int n=23;
            int a =11,b=9,c=12;
        System.out.print(maxpices(n,a,b,c));
    }

    public static int maxpices(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;

        int resA = maxpices(n - a, a, b, c);
        int resB = maxpices(n - b, a, b, c);
        int resC = maxpices(n - c, a, b, c);

        // Find the maximum result among the three
        int res = Math.max(resA, Math.max(resB, resC));

        if(res==-1)
            return -1;
        
            return res+1;
    }
}
