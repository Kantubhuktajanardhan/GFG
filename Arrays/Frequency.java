
// sorted Array
public class Main {
    public static void main(String[] args) {
        int[] arr={40,50,50,50};
        int prev=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] == prev)
            {
                count++;
            }
            else
            {
                System.out.println(prev+":"+count);
                count=1;
            }
            prev=arr[i];
        }
        System.out.println(prev+":"+count);
        
    }
}
