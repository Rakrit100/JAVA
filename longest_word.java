import java.io.*;
public class longest_word
{
    public void longest()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        s=s+" ";
        int n = s.length();
        int l=0,a=0,b=0;
        int x=0,y=0;
        String s1="";
        String s2="";
        for(int i=0;i<=n-1;i++)
        {  char ch = s.charAt(i);
            if(ch==(' '))
            { 
                y=i;
                s1 = s.substring(x,y);
                x=i+1;
                if(l<s1.length())
                {
                l=s1.length();   
                s2=s1;
               }
            }
       }

        System.out.println(s2+" is the longest word");
        System.out.println(l+" is the length of "+s2);
    }
}
