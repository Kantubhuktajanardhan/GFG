import java.util.*;
public class First {
     public static void main(String[] args) {
    	// rotation of the array
    	int[] arr= {1,2,3,4,5,6,7,8,9};
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
