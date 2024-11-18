import java.util.*;
public class First {
     public static void main(String[] args) {
    	// left rotation of the array by d elements using the auxliary space
    	System.out.print("Enter the d value:");
    	Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
    	int[] arr= {1,2,3,4,5,6};
    	
    	 int[] temp=new int[d];
    	 for(int i=0;i<d;i++)
    	 {
    		 temp[i]=arr[i];
    	 }
    	 for(int i=d;i<arr.length;i++)
    	 {
    		 arr[i-d]=arr[i];
    	 }
    	 for(int i=0;i<temp.length;i++)
    	 {
    		 arr[d+i]=temp[i];
    	 }
    	 System.out.println(Arrays.toString(arr));
    		
	}
     
   
}
