import java.util.*;
class GFG
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] ch=str.toCharArray();
        int a =ch[0];
            System.out.println(Character.isDigit(a));
    }
}
