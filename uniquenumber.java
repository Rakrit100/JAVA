import java.io.*;
public class uniquenumber
{
  public void number()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        int m=Integer.valueOf(br.readLine());  
        System.out.println("Enter the second number");
        int n=Integer.valueOf(br.readLine()); 
        String s="";
        int tot=0;
        for(int i= m;i<=n;i++)
        {
            s=Integer.toString(i);
            int l=s.length();
            int  count =0;
            for(int c=0;c<l;c++)
            {
               char check=s.charAt(c);
               for(int j=0;j<l;j++)
               {
                  if(c!=j)
                  {
                   if((s.charAt(c))==(s.charAt(j)))
                   count=count+1;
                }
              }
             }
            if(count==0)
            {
                System.out.print(i+",");
                tot=tot+1;
            }
        }
         System.out.println();
          System.out.println("Total number of unique number is "+tot);
    }
   }

            