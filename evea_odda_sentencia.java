import java.util.*;
public class evea_odda_sentencia

{
    public void sentencia()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        s=s+" ";
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        if(s.charAt(i)==' ')
        count++;
        if(count>5)
        {
            System.out.println("Invalid String!");
            System.exit(0);
        }
        int x=0,y=0;
        count=0;
        String s1="";
        for(int i =0;i<n;i++)
         {
            char ch = s.charAt(i);
            if(ch==(' '))
            {
                count++;
                y=i;
                s1 = s.substring(x,y);
                x=i+1;
                if(count%2!=0)
                 System.out.print(reverse(s1)+" ");
                else
                System.out.print(shift(s1)+" ");
            }
         }
        }
        String reverse(String s)
        {
            String s1="";
            int n=s.length();
            for(int i=0;i<n;i++)
               s1=s.charAt(i)+s1;
               return s1;
            }
            String shift(String s)
            {
                String s1="";
                int n=s.length();
              for(int i=0;i<n;i++)
                s1=s1+(char)((int)(s.charAt(i))+2);
             return s1;
            }
        }
                

        
    