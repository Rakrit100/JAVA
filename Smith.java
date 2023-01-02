import java.util.*;
public class Smith
{
    boolean check;
    int pf,n,n1,d1,d2,sum1=0,sum2=0;
           public void smith()
           {
             Scanner sc= new Scanner(System.in);
             System.out.println("enter the number");
             n1=sc.nextInt();
             n=n1;
              for(int i=2;i<=n;i++)
               {
                  for(int j=2;j<=n;j++)
                  {
                      if(n1%j==0)
                      {
                       check=primeno(j);
                           if(check==false)
                              continue;
                              
                             if(check==true)
                              {   
                              pf=j;
                              n1=n1/j;
                               if(pf<10)
                                 {
                                 sum1=sum1+pf;
                                 pf=0;
                                }
                                
                                if(pf>10)
                                {
                               
                                  while(pf!=0)
                                 {
                                   d1=pf%10;
                                    pf=pf/10;
                                    sum1=sum1+d1;
                                  }
                            
                               }
                           
                           }
                    
                     }
                   }
                }
            
              while(n!=0)
              {
                d2=n%10;
                n=n/10;
                sum2=sum2+d2;
              }
            
              if(sum1==sum2)
                 System.out.println("Smith no");
              else
                 System.out.println("Not smith no");
            }
            
           public boolean primeno(int x)
           {
                int count=0;
                for(int i=2;i<=x/2;i++)
                {
                    count=0;
                    if(x%i==0)
                    {
                     count =1;
                     continue;
                    }
                }
                if(count==0)
                return true;
                else
                return false;
           }
           
           public void main()
           {
                Smith ob1=new Smith();
                ob1.smith();
            
           }
       
            
    }     
                