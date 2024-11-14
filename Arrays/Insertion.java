import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        // [2,3,7,8,9] i want to insert an element at 3rd index
        Integer[] arr={2,3,7,8,9};
        int pos=1;
        int index=pos-1;
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
         for(int i=al.size()-1;i>=index;i--)
             {
                 al.add(i+1,al.get(i));
                 al.remove(i);
             }
        al.add(index,10);
        System.out.print(al);
    }
}
