import java.io.*;
public class Prime_Triplets
{
 
    public void triplets()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Start limit");
        int s=Integer.valueOf(br.readLine());  
        System.out.println("Enter the Stop limit");
        int l=Integer.valueOf(br.readLine());  
        int i=0,tot=0;
        int count1=0,n1=0; 
        int count2=0,n2=0;
        int count3=0,n3=0;
        int count4=0,n4=0;
        for(i=s+1;i<l;i++)
        {
            count1=0;
            for(int j =2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                 count1=1;
                }
            }
                if(count1==0)
                  n1=i;
            
            if(count1==0)
            {
               count2=0;n2=0;
              for(int k =2;k<=(i+2)/2;k++)
              {
                if((i+2)%k==0)
                {
                  count2=1;
                }
            }
                if(count2==0)
                  n2=i+2;
             
              count3=0;n3=0;
              for(int n =2;n<=(i+4)/2;n++)
              {
                if((i+4)%n==0)
                {
                  count3=1;
                }
            }
                 if(count3==0)
                   n3=i+4;
              
              count4=0;n4=0;
              for(int m =2;m<=(i+6)/2;m++)
              {
                if((i+6)%m==0)
                {
                  count4=1;
                }
            }
                if(count4==0)
                  n4=i+6;
               
            }
            
            if(count1==0&&count2==0&&count4==0)
            {
                System.out.println(n1+"   "+n2+"   "+n4);
                tot = tot+1;
            }
            if(count1==0&&count3==0&&count4==0)
            {
                System.out.println(n1+"   "+n3+"   "+n4);
                tot = tot+1;
            }
        }
         System.out.println("Total number of prime numbers is "+tot);
    }
}

       