
public class special
{
     public void number(int x)
      {
       int d=0, sum=0,clone=x;
       while(x!=0)
       {
           d=x%10;
           x=x/10;
            int count =1;
        for(int i=1;i<=d;i++)
        {
          count =count*i;
        }
           sum+=count;
        }
       if(sum==clone)
        System.out.println("it is a Special no.");
       else
         System.out.println("it is not a Special no.");
        }
     
    }
    