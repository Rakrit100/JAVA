import java.io.*;
public class book_number
{
    public void valid()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number");
        String s=br.readLine();
        int l=s.length();
        if(l!=10)
        System.exit(0);
        double def=0;
        char ch;
        ch=s.charAt(0);
        int nu;
        int n=0;
        nu=Integer.valueOf(ch);
        if(nu>0&&nu<9)
        {
            
           for(int i=0;i<10;i++)
            {
              ch=s.charAt(i);
              
              n=Integer.valueOf(ch);
              def=def+Math.pow(n,i);
            }
        }
        else
         def=10.0;
         
         if(def%11==0.0)
         System.out.println("The given Book number is valid");
         else
          System.out.println("The given Book number is not valid");
        }
    }
    