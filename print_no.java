import java.util.*;
public class print_no
{
  int x,y;
  public void initialize(int u,int v)
  {
      x=u;
      y=v;
    }
    public void println(int x)
    {
        while(x<=y)
        {
            System.out.print(x);
            println(x++);
        }
        return;
    }
    public void main()
    {
        print_no pl=new print_no();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start no");
        int u=sc.nextInt();
         System.out.println("enter end no");
        int v=sc.nextInt();
        pl.initialize(u,v);
        int x=u;
        pl.println(x);
    }
}

            