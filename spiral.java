import java.util.*;
public class spiral
{
    public void array()
    {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter 'n'");
           int n=sc.nextInt();
           int a[][]=new int[n][n];
           int A=1;
           int con=n;
             for( int s=0;s<con;s++)
           {
            for(int d=0;d<con;d++)
            {a[s][d]=A;
                A++;
            }
        }
           int y[][]=new int [n][n];
                              
           
           
           int no=1;
           int k=1;
                         
          
                  
              {
               n=n-1;
               int i=n,j=n;
               int x=n;
               int de=n;
               int c=n,d=n;
               System.out.println(a[i][i]);
               
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
                        System.out.println(a[i][j]);
                       
                        x--;
                    }
                    
                    x=n;
                    while(x>0)
                    {
                        i=i+1*(int)(Math.pow(-1,k));
                          System.out.println(a[i][j]);
                        
                        x--;
                    }
                       no++;
                       k=k+1;
                       n--;
                       x=n;
                    }
                }
                
          /*    for( int s=0;s<con;s++)
           {
            for(int v=0;v<con;v++)
            {
                if(a[s][v]<10)
                System.out.print(a[s][v]+"  ");
                if(a[s][v]>=10)
                System.out.print(a[s][v]+" ");
            
            }
            System.out.println();
          
           }*/
    }
}         
                   