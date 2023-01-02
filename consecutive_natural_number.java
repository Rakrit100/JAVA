import java.util.*;
public class consecutive_natural_number
{
    public void binary_decimal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++)
       {  int sum=0;
          for(int x=0;x<n;x++)
          {
            sum=sum+(i+x);
            if(sum==n)
            {
                System.out.print(i);
                for(int y=1;y<=x;y++)
                System.out.print("+"+(i+y));
                System.out.println();
            }
           
          }
          
       }
    }
}