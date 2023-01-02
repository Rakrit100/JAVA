import java.util.*;
public class decode1
{
   public void code()
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the code");
       String s=sc.nextLine();
       s=s.toUpperCase();
       int n=s.length();
       String s1="";
       for(int i=0;i<n;i++)
       {
           char ch=s.charAt(i);
           if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
           {
               continue;
           }
           else
           {
              if(ch=='K'&&(s.charAt(i+1))=='K')
               {
                   int m=s1.length();
               if(s1.charAt(m-1)==' ')
               {
               i=i+1;
               continue;
               }
               else
               {
               s1=s1+" ";
               i++;
               }
             }
             else if(ch=='Y')
             {
               s1=s1+'A';
              }
              else if(ch=='Z')
             {
                s1=s1+'B';
              }
              else
             {
               int x=(int)ch;
                x=x+2;
               s1=s1+(char)x;
            }
         }
        }
        s1=" "+s1;
        s1=s1.toLowerCase();
        for(int i=0; i<s1.length();i++)
        {  if(s1.charAt(i)==' ')
            s1=s1.replace(s1.charAt(i+1),Character.toUpperCase(s1.charAt(i+1)));
        }
            s1=s1.trim();
            System.out.println(s1);
    }
}