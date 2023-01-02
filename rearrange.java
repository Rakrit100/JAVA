import java.util.*;
public class rearrange
{
    public void arrange(int n)
    {
        if (n>50)
        System.exit(0);
        int a[]=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter");
            a[i]=sc.nextInt();
        }
        int temp;
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n-j-1;k++)
            {
                if(a[k]<a[k+1])
                {
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }
            }
        }
        int m=0;
        if(n%2!=0)
        m=n/2;
        if(n%2==0)
        m=(n/2)-1;
        int c =0;
        int k=1;
        int ck[]=new int[n];
        ck[m]=a[0];
        float x=0;
        for(int y=1;y<n;y++)
        {
            x=(int)Math.pow(-1,c);
            m=m+k*(int)x;
            ck[m]=a[y];
            c++;
            k++;
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(ck[i]);
        }
    }
}
