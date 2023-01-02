import java.util.*;
public class series1_refer
{
   double sum;
   public void main()
   {
       series1_refer ob=new series1_refer();
        ob.series(ob);
    }
    public void series(series1_refer ob)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int n=sc.nextInt();
        System.out.println("Enter variable");
        int x=sc.nextInt();
        sum=1;
        for(int i=1;i<=n;i++)
        ob.sum=ob.sum+(Math.pow(x,(2*i-1))/factorial(i));
        System.out.println(ob.sum);
    }
    public int factorial(int i)
    {
        int count=1;
        for(int j=1;j<=i;j++)
        count=count*j;
        return count;
     }
    }
    
       