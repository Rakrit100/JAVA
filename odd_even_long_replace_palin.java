import java.util.*;
public class odd_even_long_replace_palin
{ 
    public void sentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        int count=0;
        s=s+" ";
        int n=s.length();
        String s1="",st="";
        int x=0,y=0;
        String l="";
        for(int i=0;i<n;i++)
        
        {
            String s2="";
          if(s.charAt(i)==' ')
          {
                count++;
                y=i;
                 s2=s.substring(x,y);
                x=y+1;
            if(count%2!=0)
            { 
               s1=s1+odd(s2)+" ";
            }
            else
            {
               s1=s1+even(s2)+" ";
            }
            if(l.compareTo(s2)>0)
            l=s2;
            if(palin(s2)==true)
            System.out.println(s2+" is a palindrome");
            else
            System.out.println(s2+" is not a palindrome");
            
          }
        }
                for(int a=0;a<s1.length();a++)
           {
            char c=s1.charAt(a);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
                st=st+'A';
                else
                st=st+c;
            }
            System.out.println(l+" is the longest word");
            System.out.println("And after replacing vowels with 'A' the new string is: "+st);
        
    }
    public String odd(String s)
    {
        int n=s.length();
        String s1="",x;
        int c;
        for(int i=0;i<n;i++)
        {
        c= s.charAt(i);
        c=c+2;
       s1=(char)(c)+s1;
       }
        System.out.println("Since "+s+" is a odd no. word, its letters are shifted by 2 "+s1);
        return s1;
    }
    public String even(String s)
    {
        int n=s.length();
        String s1="";
        for(int i=0;i<n;i++)
        s1=s.charAt(i)+s1;
        System.out.println("Since "+s+" is a even no. word, its reverse is "+s1);
        return s1;
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
    