public class Main {
    public static void main(String[] args) {
        //finding the leaders and print the leaders
        int[] arr={7,10,4,3,6,5,2};
        int n=arr.length-1;
        current_leader=arr[n];
        System.out.print(current_leader+" ");
        for(int i=n-2;i>=0;i--)
            {
                if(arr[i] > current_leader)
                {
                    System.out.print(arr[i]+" ");
                    current_leader=arr[i];
                }
            }
    }
}
