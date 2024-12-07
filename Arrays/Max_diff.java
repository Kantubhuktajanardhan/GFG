public class Main {
    public static void main(String[] args) {
        int[] arr={2,3,10,6,4,8,1};
        int min=arr[0];
        int diff=arr[1]-arr[0];
        for(int j=1;j<arr.length;j++)
        {
                if(arr[j]-min>diff)
                {
                    diff=arr[j]-min;
                }
            if(arr[j]<min)
            {
                min=arr[j];
            }
        }

        System.out.print("Maximum difference: "+diff);
    }
}
