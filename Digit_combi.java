import java.util.*;

public class Digit_combi
{
    public void combi()
    {
        Scanner sc=new Scanner (System.in);
        System .out.println("Enter any number from 2 to 5 (both inclusive)");
        int n=sc.nextInt();
        int count =0;
        char ch;
       /* for(int i=1;i<=n;i++) 
        {
            for(int j=1;j<=n;j++)  
            {
                if(i==j)
                    continue;
                for(int k=1;k<=n;k++) 
                {
                    if(k==j||k==i)
                        continue;
                    for(int l=1;l<=n;l++)  
                    {
                        if(l==i||l==j||l==k)
                            continue;
                        for(int m=1;m<=n;m++)
                        {
                        if(m==i||m==j||m==k||m==l)
                            continue;
                        System.out.println(i+" "+j+" "+k+" "+l+" "+m);
                        count++;
                    }
                   if(n==4)
                   {
                    System.out.println(i+" "+j+" "+k+" "+l);
                        count++;
                    }
                }
                    if(n==3)
                    {
                        System.out.println(i+" "+j+" "+k);
                        count++;
                    }
                }
                if(n==2)
                {
                    System.out.println(i+" "+j);
                    count++;
                }
            }
        }*/
        if(n==2)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==j)
                    continue;
                    System.out.println(i+""+j+" ");
                    count++;
                }
            }
        }
        if(n==3)
        {
            for(int k=1;k<=n;k++)
            {
                for(int l=1;l<=n;l++)
                {
                    for(int m=1;m<=n;m++)
                    {
                    if(m==k||m==l||l==k)
                    continue;
                    System.out.println(k+""+l+""+m+" ");
                    count++;
                    }
                }
            }
        }
        if(n==4)
        {
            for(int o=1;o<=n;o++)
            {
                for(int p=1;p<=n;p++)
                {
                    for(int q=1;q<=n;q++)
                    {
                        for(int r=1;r<=n;r++)
                        {
                    if(r==q||r==p||r==o||q==p||q==o||p==o)
                    continue;
                    System.out.println(o+""+p+""+q+""+r+" ");
                    count++;
                    }
                }
               }
            }
        }
          
         if(n==5)
        {
            for(int s=1;s<=n;s++)
            {
                for(int t=1;t<=n;t++)
                {
                    for(int u=1;u<=n;u++)
                    {
                        for(int v=1;v<=n;v++)
                        {
                            for(int w=1;w<=n;w++)
                            {
                             if(s==t||s==u||s==v||s==w||t==u||t==v||t==w||u==v||u==w||v==w)
                             continue;
                             System.out.println(s+""+t+""+u+""+v+""+w+" ");
                             count++;
                            }
                        }
                     }
               }
            }
        }
          
       System.out.println("There were "+count+" lines of output");
       System.out.println("");
      }
}