import java.util.*;
class GFG
{
    public static void main(String args[])
    { int ans=0,n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int[] arr=new int[n];
     for(int i=0;i<n;i++)
     { if(in.hasNextInt()){
          arr[i]=in.nextInt();
         if(i%2==0)
         ans+=Math.pow(arr[i],3);
         else
         ans+=Math.pow(arr[i],2);
    }}
    System.out.println(ans);
}
}
