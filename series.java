import java.io.*;
public class series
{
    public void name(int x,int n)
    {
        int count=1;
        
        double result1=1;
               for(int i=2;i<=n;i=i+2)
               {
                   result1=result1+((Math.pow(x,i)/factorial(i))*Math.pow(-1,count));
                   count++;
                }
                  System.out.println(result1);
                    
                }
                    public int factorial(int x)
            {
                int i,count=1;
                for(i=1;i<=x;i++)
                {
                    count=count*i;
                }
                return count;
            }
        }