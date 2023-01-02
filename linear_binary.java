import java.util.*;
public class linear_binary
{
    int A[];
    public void enter(int y)
    {
        Scanner sc=new Scanner(System.in);
        A=new int[y];
        for(int i=0;i<y;i++)
        {
            System.out.println("enter the number");
            A[i]=sc.nextInt();
        }
          System.out.println("enter the number to be searched");
          int s=sc.nextInt();
          System.out.print("Position in linear search ");
          linear(s);
          System.out.print("Position in binary search ");
          binary(s);
    }
    public void linear(int ch)
    {
        int i;
        for(i=0;i<A.length;i++)
        {
            if(A[i]==ch)
            System.out.println(i+1);
        }
        
        return ;
    }
    public void binary(int ch)
    {
        int u=A.length;
        int l=0;
        int m;
        while(l<u)
        {
            m=(u+l)/2;
            if(ch==A[m])
            System.out.println(m+1);
            if(ch<A[m])
            u=m+1;
            if(ch>A[m])
            l=m-1;
        }
        return;
    }
}

            