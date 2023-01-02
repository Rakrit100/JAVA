
import java.util.*;
public class insertion
{
   public void insert()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("max strength");
      int n=sc.nextInt();
       int A[]=new int[n];
       for (int i=0;i<n;i++)
       {
           System.out.println("enter");
           A[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(A[j]<A[j-1])
                {
                    temp=A[j];
                    A[j]=A[j-1];
                    A[j-1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++)
       {
           System.out.println(A[i]);
        }
    }
}

        
           
