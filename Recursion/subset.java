
public class Main {
    public static void main(String[] args) {
        String input="abcd";
        String current="";
        int i=0;
        subset(input,current,i);
    }

    public static void subset(String input,String current,int i)
    {
        if(i == input.length())
        {
            System.out.println(current);
            return;
        }
        subset(input,current,i+1);
        subset(input,current+input.charAt(i),i+1);
    }
}
