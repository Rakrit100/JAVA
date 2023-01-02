import java.io.*;
public class lcm_hcf_of_2
{
    public void lcm_hcf()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        int n1 = Integer.parseInt(br.readLine());
        System.out.println("Enter the second number");
        int n2 = Integer.parseInt(br.readLine());
         if((n1==0)||(n2==0))
           System.exit(0);
        float lcm=0,hcf=0;
        int a=0,b=0;
            if(n1>n2)
            { 
              a=n1;
              b=n2;
            }
            
            if(n2>n1)
            {
              a=n2;
              b=n1;
            }
            
            for(int i=1;i<=a/2;i++)
            {
               if(a%i==0&&b%i==0)
               hcf=i;
              
            }
               
                 for(int i=2 ;i<=a*b;i++)
               {
                   if(i%n1==0&&i%n2==0)
                   {
                       lcm=i;
                       break;                
                }
            }            
            System.out.println(hcf);
            System.out.println(lcm);
        }
    }
    
            
            
              
        