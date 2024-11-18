import java.util.*;
// naive solution
public class First {
     public static void main(String[] args) {
    	// left rotation of the array by d elements
    	System.out.println("Enter the d value:");
    	Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
    	int[] arr= {1,2,3,4,5,6,7,8,9};
    	for(int i=0;i<d;i++)
    	leftrotate(arr);
    	System.out.print(Arrays.toString(arr));
    		
	}
     
    public static void leftrotate(int[] arr)
    {
    	int temp=arr[0];
    	for(int i=1;i<arr.length;i++)
    	{
    		arr[i-1]=arr[i];
    	}
    	arr[arr.length-1]=temp;
    	
    }
}
