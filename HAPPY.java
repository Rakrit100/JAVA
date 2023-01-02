

public class HAPPY
{
    public void no(int x)
    {
        int sum=0;
        int d=0,n=x;
        while(n>9)
        {
            while(x!=0)
            {
                d=x%10;
                x=x/10;
                sum=sum+d*d;
            }
            x=sum;
            n=sum;
            sum=0;
        }
        if(n==1)
        System.out.println("Happy no.");
        else
        System.out.println("not Happy no.");
    }
}

        