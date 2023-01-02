import java.io.*;
public class denomination
{
    public void rupees()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the amount");
        int a =Integer.parseInt(br.readLine());
        int fi=0,tw=0,te=0,fiv=0,two=0,on=0;
        if(a>=100&&a<=1000)
        {
        fi=a/50;
        a=a%50;
        if(a>=20)
        {
        tw=a/20;
        a=a%20;
       }
       if(a>=10)
       {
        te=a/10;
        a=a%10;
       }
       if(a>=5)
       {
           fiv=a/5;
           a=a%5;
        }
        if(a>=2)
        {
            two=a/2;
            a=a%2;
        }
        if(a>=1)
        {
            on=a/1;
            a=a%1;
        }
        if(fi!=0)
        System.out.println("50 rupee note = "+fi);
        if(tw!=0)
        System.out.println("20 rupee note = "+tw);
        if(te!=0)
        System.out.println("10 rupee note = "+te);
        if(fiv!=0)
        System.out.println("5 rupee note = "+fiv);
        if(two!=0)
        System.out.println("2 rupee note = "+two);
        if(on!=0)
        System.out.println("1 rupee note = "+on);
    }
    else
    System.out.println("Invalid Choice");
   }

}
