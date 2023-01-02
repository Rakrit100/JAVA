import java.util.*;
public class Base__Class
{
    public void Base()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        String x= sc.nextLine();
        System.out.println("Enter the second number");
        String y= sc.nextLine();
        int u=Integer.valueOf(x);
        int v=Integer.valueOf(y);
        String a="";
        String b="";
        String X[]=new String[19];
        String Y[]=new String[19];
        int p=0;
        int q=0;
        int m=20,n=20;
        for(int i=2;i<20;i++)
        {   a="";
            u=Integer.valueOf(x);
           while(u>0)
            {
            long d=u%i;
            if(d<10)
            a=a+Long.toString(d);
            else
            {
            if(d==10)
            a=a+"A";
            if(d==11)
            a=a+"B";
            if(d==12)
            a=a+"C";
            if(d==13)
            a=a+"D";
            if(d==14)
            a=a+"E";
            if(d==15)
            a=a+"F";
            if(d==16)
            a=a+"G";
            if(d==17)
            a=a+"H";
            if(d==18)
            a=a+"I";
            if(d==19)
            a=a+"J";
            }
            u=u/i;
           }
           X[p]=a;
           p++;
        }
           for(int j=2;j<20;j++)
           {
                b="";
                v=Integer.valueOf(y);
              while(v>0)
              {
                 long e=v%j;
                 if(e<10)
                 b=b+Long.toString(e);
                 else
                 {
                  if(e==10)
                  b=b+"A";
                  if(e==11)
                  b=b+"B";
                  if(e==12)
                  b=b+"C";
                  if(e==13)
                  b=b+"D";
                  if(e==14)
                  b=b+"E";
                  if(e==15)
                  b=b+"F";
                  if(e==16)
                  b=b+"G";
                  if(e==17)
                  b=b+"H";
                  if(e==18)
                  b=b+"I";
                  if(e==19)
                  b=b+"J";
                 }
                v=v/j;
              }
              Y[q]=b;
              q++;
            }
            int A[]=new int[18];
            int B[]=new int[18];
            int c=0;
            for(int i=0;i<18;i++)
            {
                for(int j=0;j<18;j++)
                {
                    if(X[i].equals(Y[j])==true)
                    {
                        A[c]=i+2;
                        B[c]=j+2;
                        c++;
                    }
                }
            }
            int sum=40;
            int g=0; 
            for(int f=0;f<c;f++)
            {
                if(sum>A[f]+B[f])
                sum=A[f]+B[f];
                g=f;
            }
            if(g!=0)
            System.out.println(x+" (base "+A[g]+") = "+y+" (base "+B[g]+")");
            else
            System.out.println(x+" is not equal to "+y+" in any base between 2 to 20");
        }
   }
        
        