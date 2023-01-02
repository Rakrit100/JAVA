import java.util.*;
public class fibronarkki_reference
{
    int sum;
    public void main()
    {
        fibronarkki_reference ob=new fibronarkki_reference();
        ob.fibro(ob);
    }
    public void fibro(fibronarkki_reference ob)
    {
        sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int n=sc.nextInt();
        int a= 0,b=1,temp=0;
        do
        {
            ob.sum=a+b;
            temp=a;
            a=b;
            b=b+temp;
        }while(b<=n);
        
        System.out.println(ob.sum);
    }
}
