
import java.util.*;
public class demo_test
{
    public void test()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence ending with a full stop (maximum 80 letters including spaces and fullstop)");
        String s=sc.nextLine();
        int n=s.length();
        if(n>80)
        System.exit(0);
        if(s.charAt(n-1)!='.')
        System.exit(0);
      
        String s2="";
        char ch;
        int count=1;
                      
        for(int i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(i==0)
            {
               ch=Character.toUpperCase(ch);
               s.replace(s.charAt(0),ch);
                }
            if(ch==' ')
            {
                count+=1;
                if(s.charAt(i+1)!=' ')
                {
                    s.replace(s.charAt(i+1),Character.toUpperCase(s.charAt(i+1)));
                }
            }
        }
        s=s+" ";
        n=s.length();
        String A[]=new String[count];
        int x=0,y=0;
        int c=0;
         for(int i=0;i<n;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                y=i;
                A[c]=s.substring(x,y);
                x=i+1;
                c+=1;
            }
        }  
        String t="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
            if(A[j].compareTo(A[j+1])<0)
            {
                t=A[j];
                A[j]=A[j+1];
                A[j+1]=t;
                
            }
            if(A[j].equals(A[j+1]))
            {
                if(A[j].compareTo(A[j+1])<0)
                {
                 t=A[j];
                A[j]=A[j+1];
                A[j+1]=t;
             }
           }
          int r=A.length;
          for(i=0;i<=r;i++)
          System.out.println(A[i]);
       }
    }
  }
}
        
                
    