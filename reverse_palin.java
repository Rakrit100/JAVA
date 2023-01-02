import java.io.*;
public class reverse_palin
{
    public void rever_palin()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        String s1="";
        int n = s.length();
        String s2="";
            for(int i=0;i<n;i++)
               s1=s.charAt(i)+s1;
        s1=s1+" ";
        s=s+" ";
        int x=0,y;
         for(int i =0;i<=n;i++)
         {
            char ch = s.charAt(i);
            if(ch==(' '))
            {
                y=i;
                s2 = s.substring(x,y);
                boolean check=palin(s2);
                if(check == true)
                 System.out.println(s2+" is palindrome");
                x=i+1;
            }
         }
        System.out.println(s1);
        }
    public boolean palin(String s)
       {
        int n=s.length();
        String s2 = "";
        for(int i=n-1;i>=0;i--)
          s2=s2+s.charAt(i);
          if(s2.equals(s)) 
          return true;
          else 
          return false;
        }
    }
    