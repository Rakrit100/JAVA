import java.io.*;
public class prime
{
    int che;
  public void number()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        int n=Integer.parseInt(br.readLine());
        che=2;
        boolean check=primorial(n);
        if(check==true)
        System.out.println("Entered number is a prime number");
        else
        System.out.println("Entered number is not a prime number");
    }
       public boolean primorial(int n)
       {
           while(che<=n/2)
           {
           if(n%che!=0)
           {
               che++;
            primorial(n);
            }
           else 
            return false;
        }
        return true;
    }
}

               
           