import java.io.*;
public class bin_dec
{
    public void binary_decimal()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        long a =Long.parseLong(br.readLine());
        String no="";
        long re=0; 
        String ch="";
        if(a==0)
        no="0";
        
        while(a>0)
        {
          re=a%2;
          a=a/2;
          ch=Long.toString(re);
          no=ch+no;
        }
        System.out.println(no);
    }
}

        
        