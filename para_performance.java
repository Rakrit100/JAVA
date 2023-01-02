import java.util.*;
public class para_performance
{
    public void para()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paragraph with a maximum 4 sentences");
        System.out.println("The words are to be seperated with a single blank space and are in UPPER CASE");
        System.out.println("The sentence may end with '.' or '?'");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='.'||s.charAt(i)=='?')
            {
                count++;
            }
        }
        if(count>4)
        {
            System.out.println("Sentence exeeded limit");
            System.exit(0);
        }
        int count1=0;
        for(int j=0;j<n;j++)
        {
            if(s.charAt(j)==' ')
            count1++;
            if(s.charAt(j)=='.'||s.charAt(j)=='?')
            {
                count1++;
                j=j+2;
            }
        }
        System.out.println("Number of words "+count1);
        /*for(int k=0;k<n;k++)
        {
            if(s.charAt(k)=='.')
            s.replace(s.charAt(k),' ');
            if(s.charAt(k)=='?')
            s.replace(s.charAt(k),' ');
        }*/
        int x=0,y=0;
        String r[]=new String[n];
        for(int q=0;q<n;q++)
        {
            r[q]=" ";
        }
        int countx=0;
        boolean zx=false;
        outer:
        for(int i=0;i<n;i++)
        {
            String d;
            if(s.charAt(i)==' '||s.charAt(i)=='.'||s.charAt(i)=='?')
            {
                y=i;
                d=s.substring(x,y);
                x=i+1;
                d=d.trim();
                
                for(int o=0;o<n;o++)
                {
                    if(r[o].compareTo(d)==0)
                    {
                        zx=true;
                        continue outer;
                     }
                    }
                    if(zx==false)
                        
                    {
                        r[countx]=d;
                        countx++;
                    }
                
                int a=0,b=0;
                int count5=0;
                for(int j=0;j<n;j++)
                {
                    String c=" ";
                    char ch=s.charAt(j);
                    if(ch==' '||ch=='.'||ch=='?')
                    { 
                        if((s.charAt(j-1)==' '||s.charAt(j-1)=='.'||s.charAt(j-1)=='?')&&ch==' ')
                        continue;
                        else
                        {
                        b=j;
                        c=s.substring(a,b);
                        a=j+1;
                        c=c.trim();
                    }
                    }
                    if(c.equals(' ')==false)
                    {
                    if(d.equals(c)==true)
                    {
                        count5++;
                    }
                }
            }
                if(count5>0)
                System.out.println(d+"="+count5);
            }
        }
    }
}

     