import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        // [2,3,7,8,9,11] i want to delete an element at the index 2
        int index=2;
        Integer[] arr={2,3,7,8,9,11};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
        for(int i=index;i<al.size()-1;i++)
            {
                al.add(i,al.get(i+1));
                al.remove(i+1);
            }
       al.remove(al.size()-1);
        System.out.print(al);
        
    }
}
