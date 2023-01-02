import java.util.*;
public class multiplcation_table
{
   int m;
   public void initialize(int x)
   {
       m=x;
    }
       public void tables(int che)
       {
        while(che<=10)
        {
            System.out.println(m+" x "+che+" = "+(m*che));
            che+=1;
           
        }
        return;
    }
    public void main()
    {
        multiplcation_table mu=new multiplcation_table();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();
        mu.initialize(x);
        int c=1;
        mu.tables(c);
    }
}
        
   