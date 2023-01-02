import java.util.*;
public class reverse_recursion
{
    int x,f,n;
    void initialize()
    {
     f=0;
    }
   public int check(int v)
     {
        if(v>0)
        {
        x=10;
        n=v%x;
        f=n+f*10;
        v=v/x;
        check(v);
      }
     return f;
      }
      int as;
    void main()
    {
        reverse_recursion ob =new reverse_recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int v=sc.nextInt();
        ob.initialize();
        ob.check(v);
    }
        
}