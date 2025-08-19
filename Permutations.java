import java.util.ArrayList;

public class Permutations {
    public static void main(String args[])
    {

      System.out.println(PermutationsArrayList("", "abc"));
    }
    public static void Permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());

            Permutations(f+ch+s,up.substring(1));
        }
    }

    public static ArrayList<String> PermutationsArrayList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> a=new ArrayList<>();
           a.add(p);
            return a ;
        }
        char ch=up.charAt(0);
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());

            ArrayList <String> ansfromabove=PermutationsArrayList(f+ch+s,up.substring(1));

            list.addAll(ansfromabove);
        }
        return list;
    }
}
