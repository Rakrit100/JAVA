import java.util.*;
public class decode2
{
    public void coding()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encoded text");
        String s=sc.nextLine();
        s=s.toUpperCase();
        int n=s.length();
        if(s.charAt(n-1)!='.'&&s.charAt(n-1)!='?'&&s.charAt(n-1)!='!')
        {
            System.out.println("Invalid code");
            System.exit(0);
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
          if(s.charAt(i)==' ')
          count++;
        }
        count++;
        s=s.replace(s.charAt(n-1),' ');
        n=s.length(); 
        String A[]=new String[count];
        int x=0;
        int p=0;
        for(int j=0;j<n;j++)
        {
            if(s.charAt(j)==' ')
            {
                A[p]=s.substring(x,j);
                x=j+1;
                p++;
            }
        }
        int P[]=new int[count];
        for(int k=0;k<count;k++)
        {
           if(k>0)
            System.out.print(",");
            int sum=0;
            for(int b=0;b<A[k].length();b++)
            {
                sum=sum+(int)A[k].charAt(b);
            }
            P[k]=sum;
           System.out.print(A[k]+"="+sum);
        }
        System.out.println();
            int t=0;
            String temp="";
            for(int l=0;l<count;l++)
        {
            for(int m=0;m<count-l-1;m++)
            {
            if(P[m]>P[m+1])
            {
                t=P[m];
                temp=A[m];
                P[m]=P[m+1];
                A[m]=A[m+1];
                P[m+1]=t;
                A[m+1]=temp;
            }
           }
          }
          for(int y=0;y<count;y++)
          {
              System.out.print(A[y]+" ");
            }
        }
    }
      