import java.util.*;
public class lucky
{
    int c,i;
    public void  check()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the last no.");
        int n=sc.nextInt();
        char cha=' ';
        int A[]=new int[n];
        for( int i=0;i<n;i++)
            A[i]=i+1;
        c=2;
        int count=0;
        for(i=0;i<n;i++)
                 {

                    if(A[i]!=0)
                        count=count+1;

                    if(count==c)
                    {
                        A[i]=0;
                        count=0;
                         
  
                }
                if(i==n-1)
                {
                    i=-1;
                   if(c!=n/2)
               
                       {
                           c=c+1;
                       count=0;
                    }
                      if(c==n/2)
                {
                    for(i=0;i<n;i++)
                    {

                        if(A[i]!=0)
                            System.out.println(A[i]);
                    }
                }   
              }
          }  
            }
        }
                   