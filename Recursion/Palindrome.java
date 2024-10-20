public class Main {
    public static void main(String[] args) {
        String input="abba";
        int start=0;
        int end=input.length()-1;
        System.out.print(palindrome(input,start,end));
    }

    public static boolean palindrome(String str,int start,int end)
    {
        if(start>end)
            return true;

        if(str.charAt(start) == str.charAt(end))
           {
            return palindrome(str,start+1,end-1);
           }
        else
        {
            return false;
        }
    }
}
