import java.io.*;
public class factorial_reference
{
    int f;
    public void main()throws IOException
    {
        factorial_reference ob=new factorial_reference();
        ob.factorial(ob);
    }
    public void factorial(factorial_reference ob)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int l=Integer.parseInt(br.readLine());
        f=1;
        for(int i=1;i<=l;i++)
        ob.f=f*i;
        System.out.println(ob.f);
  
    }
}

    