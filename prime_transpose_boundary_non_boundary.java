import java.io.*;
public class prime_transpose_boundary_non_boundary

{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows and coloums in the matrix");
        int n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        System.out.println("Enter prime numbers");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1));
               int x=Integer.parseInt(br.readLine());
               if(prime(x)==true)
               a[i][j]=x;
               else
               {
                   System.out.println("Entered number is not prime number");
                   j--;
                }
            }
        }
            System.out.println("The boundary elements are:");
            for(int i=0;i<n;i++)       
           {  
            for(int j=0;j<n;j++)
            {
                if((i==0||i==n-1)||(j==0||j==n-1))
                {    
                    System.out.print(a[j][i]+" "); 
                } 
                else 
                System.out.print("  "); 
              }                        
                 System.out.println();    
                }
                System.out.println("The non boundary elements are:");
                for(int i=0;i<n;i++) 
                {
                    for(int j=0;j<n;j++) 
                    {
                        if(!((i==0||i==n-1)||(j==0||j==n-1))) 
                        {
                            System.out.print(a[j][i]+" ");
                        }
                        else
                        System.out.print("  "); 
                    }     
                    System.out.println(); 
                }
            }
            boolean prime(int x)
            {
                int count=0;  
                for(int j =2;j<=x/2;j++)
                {
                    if(x%j==0)
                    {
                        count=1;
                    } 
                }
                if(count==1)
                {
                   return false;
                }
                else
                {
                    return true;
                }
                }
            }
            
        