import java.io.*;
public class longestrecursion
{

    String s2;
    int x,y,i,l;
    public void longest()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        s=s+" ";
        s2="";
        x=0;
        i=0;
        int l=length(s);
         System.out.println(s2+" is the longest word");
        System.out.println(l+" is the length of "+s2);
    }
        public int length(String s)
        {
            int n = s.length();
            String s1="";
            for(i=x;i<=n-1;i++)
        {  char ch = s.charAt(i);
            if(ch==(' '))
            { 
                y=i;
                s1 = s.substring(x,y);
                x=i+1; 
                 if(l<s1.length())
            {
              s2=s1;
              l=s1.length();
             
            }
             length(s);
          }
        }
        return l;
    }
}
        