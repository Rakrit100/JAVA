import java.util.*;
public class anticlockwise
{
    public void array()
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter 'n'");
           int n=sc.nextInt();
           int a[][]=new int[n][n];
           int A=n*n;
                              
           int con=n;
           
           int no=1;
           int k=1;
            
           
                   //   if(n%2==1)
              
               n=n-1;
               int i=n,j=n;
               int x=n;
               (a[i][i])=A;
               A--;
               for(int o=1;o<=con+con-1;o=o+2)
               {
                   while(x>=0)
                   {
                       j=j+1*(int)(Math.pow(-1,k));
                        if(j==-1)
                        {
                        j=0;
                        break;
                        }
                       (a[i][j])=A;
                       A--;
                        x--;
                    }
                    
                    x=n;
                    while(x>0)
                    {
                        i=i+1*(int)(Math.pow(-1,k));
                         (a[i][j])=A;
                        A--;
                        
                        x--;
                    }
                       no++;
                       k=k+1;
                       n--;
                       x=n;
                    }
                
                //else

             for( int s=0;s<con;s++)
           {
            for(int d=0;d<con;d++)
            {
                if(a[s][d]<10)
                System.out.print(a[s][d]+"  ");
                if(a[s][d]>=10)
                System.out.print(a[s][d]+" ");
            
            }
            System.out.println();
          
           }
    }
}         
                   