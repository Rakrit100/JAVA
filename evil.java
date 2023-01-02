import java.io.*;

    public class evil
    {
        public void evil_no(int a)
        {
          String no="";
          int re=0; 
          String ch="";
          int x=a;
            if(a<2||a>100)
            {
              System.out.println("INPUT : N = "+x);
              System.out.println("OUTPUT : NUMBER OUT OF RANGE");
              return;
            }
            while(a!=0)
            {
              re=a%2;
              a=a/2;
              ch=Integer.toString(re);
              no=ch+no;
            }
            int l= no.length();
            int count=0;
            for(int i=0;i<l;i++)
            {
                char c=no.charAt(i);
                if(c==('1'))
                count=count+1;
            }
            if(count%2==0)
            {
                System.out.println("INPUT : N = "+ x);
                System.out.println("BINARY EQUIVALENT : "+no);
                System.out.println("NUMBER OF 1's : "+count);
                System.out.println("OUTPUT : EVIL NUMBER");
            }
            else
            {
                System.out.println("INPUT : N = "+ x);
                System.out.println("BINARY EQUIVALENT : "+no);
                System.out.println("NUMBER OF 1's : "+count);
                System.out.println("OUTPUT : NOT EVIL NUMBER");
            }
        }
    }
    
            
                