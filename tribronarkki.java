
import java.io.*;
public class tribronarkki
{
    public void narkki(int x)
    {
        int a=0,b=1,c=2;
        System.out.print(a+" ");
        System.out.print(b+" ");
        System.out.print(c+" ");
        int sum=0;
        do
        {   
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
            
            System.out.print(sum+" ");
        }while(c<=x);
    }
}
