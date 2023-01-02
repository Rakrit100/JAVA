import java.util.*;
public class binary_addition
{
    public void add()
    {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter the first no.");
         String m=sc.nextLine();
         System.out.println("Enter the second no.");
         String n=sc.nextLine();  
         int k = m.length();
         int l = n.length();
         if(k-l<0)
          for(int i=0;i<l-k;i++)
           m="0"+m;
         if(l-k<0)
          for(int i=0;i<k-l;i++)
           n="0"+n;
        
         k = m.length();
         l = n.length();
         String s="";
         char r='0';
       
         for(int i=k-1;i>=0;i--)
         {
             char a=m.charAt(i);
             char b=n.charAt(i);
              if(a=='1'&&b=='1'&&r=='1')
             {
             s='1'+s;
             r='1';
             }
             else if(a=='1'&&b=='1'&&r=='0')
             {
             s='0'+s;
             r='1';
             }
            else if(a=='1'&&b=='0'&&r=='1')
             {
             s='0'+s;
             r='1';
             }        
              else if(a=='1'&&b=='0'&&r=='0')
             {
             s='1'+s;
             r='0';
             }
              else if(a=='0'&&b=='1'&&r=='1')
             {
             s='0'+s;
             r='1';
             }
             else if(a=='0'&&b=='1'&&r=='0')
             {
            s='1'+s;
             r='0';
             }
              else if(a=='0'&&b=='0'&&r=='1')
             {
             s='1'+s;
             r='0';
             }
              else if(a=='0'&&b=='0'&&r=='0')
             {
             s='0'+s;
             r='0';
             }
            if(i=='0'&&r=='1')
            {
                s='1'+s;
            }
            }
            s=r+s;
         System.out.println("");
         System.out.println(s);
    }
}

        