import java.util.*;
class gfg{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String[] st=str.trim().split(" ");
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for(String s:st)
        {
            if(hm.containsKey(s))
            {
                hm.put(s,hm.get(s)+1);
            }else
            {
                hm.put(s,1);
            }
        }
        
        Set<String> s=hm.keySet();
        for(String ss:s)
        {
            if(hm.get(ss)>1)
            System.out.println(ss+"="+hm.get(ss));
        }
        
    }
}
