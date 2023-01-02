import java.io.*;
public class hexa_to_octal
{
    
    public void binary_decimal()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        String a =br.readLine();
        double re=0; 
        int i=0;
        char cha;
        if(a.equals("0"))
        {
          System.out.println("0");
          System.exit(0);    
        }
        while(i<=a.length())       
        {
         
            cha=a.charAt(i);
            if(cha=='1'||cha=='2'||cha=='3'||cha=='4'||cha=='5'||cha=='6'||cha=='7'||cha=='8'||cha=='9')
            {
                re=re+((double)cha*Math.pow(16,i+1));
            }
            if(cha=='A')
            re=re+(10*Math.pow(16,i+1));
            if(cha=='B')
            re=re+(11*Math.pow(16,i+1));
            if(cha=='C')
            re=re+(12*Math.pow(16,i+1));
            if(cha=='D')
            re=re+(13*Math.pow(16,i+1));
            if(cha=='E')
            re=re+(14*Math.pow(16,i+1));
            if(cha=='F')
            re=re+(15*Math.pow(16,i+1));
             i+=1;
          }
        double d=0;
        String sum="";
        String c="";
         while(re!=0)
         {
           d=re%8;
           c=Double.toString(d);
           sum=d+sum;
           re=re/8;
        }
        System.out.println(sum);
        
           
        
      }
    }
