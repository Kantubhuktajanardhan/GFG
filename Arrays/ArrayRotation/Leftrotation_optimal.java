import java.util.*;
public class First {
     public static void main(String[] args) {
    	// left rotation of the array by d elements
    	System.out.print("Enter the d value:");
    	Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
    	int[] arr= {1,2,3,4,5,6,7};
    	// reversal algorithm
    	reverseArray(arr,0,d-1);
    	reverseArray(arr,d,arr.length-1);
    	reverseArray(arr,0,arr.length-1);
    	System.out.println(Arrays.toString(arr));
    		
	}
     
    public static void reverseArray(int[] arr,int s,int e)
    {
    	while(s<e)
    	{
    		int temp=arr[s];
    		arr[s]=arr[e];
    		arr[e]=temp;
    		s++;
    		e--;
    	}
    }
     
   
}
