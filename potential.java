import java.util.*;
public class potential
{     public void input(String s)
    {
         s=s+" ";
        int l=s.length();
        int count=0;
        for(int i=0;i<l;i++)
         if(s.charAt(i)==' ')
          count++;
        int A[] = new int[count];
        String S[]=new String[count];
        int x=0,y=0;
        int c=0;
        String s1="";
        for(int i=0;i<l;i++)
        { 
            if(s.charAt(i)!=' ')
            A[c]=A[c]+(int)(s.charAt(i));
          if(s.charAt(i)==' ')
          {
              y=i;
              s1=s.substring(x,y);
              x=i+1;
              System.out.print(s1);
              S[c]=s1;
              System.out.println("   "+A[c]);
              c++;            
              
          }
        }
        String temp="";
           for(int i=0;i<c-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(S[j].compareTo(S[j-1])>0)
                {
                    temp=S[j];
                    S[j]=S[j-1];
                    S[j-1]=temp;
                }
            }
        }
        System.out.println("");
        for (int i=0;i<c;i++)
        {
           System.out.println(S[i]);
        }
        
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String s=sc.nextLine();
        int l=s.length()-1;
        s=s.toUpperCase();
        char c=s.charAt(l);
        potential obj=new potential();
        if(c=='.'||c==','||c=='!'||c=='?')
        obj.input(s.substring(0,l));
        else 
        System.out.println("invalid input");
    }
}
       
    

