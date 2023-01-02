import java.util.*;
public class factor
{
    int x;
      public void main()
    {
        Scanner sc=new Scanner(System.in);
        factor ob=new factor();
        System.out.println("enter the number");
        x=sc.nextInt();
        int che=1;
        ob.check(che);
    }
    public void check(int che)
    {
        while(che<x)
        {
            if(x%che==0)
          {
            System.out.println(che);
          }
          che+=1;
             check(che);
        }
    }
  
}
