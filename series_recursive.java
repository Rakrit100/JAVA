
public class series_recursive
{
    
        int sum=0;
        public void check(int n)
        {
            if(n>=1)
            {
                sum=sum+n;
                --n;
                check(n);
            }
                 System.out.println(sum);
                }
    }
    