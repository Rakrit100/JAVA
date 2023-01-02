import java.util.*;
public class decimal_to_hexa_decimal
{
    String s;
    public void code()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal");
        long r=sc.nextInt();
        s="";
        System.out.print("The number in hexa-decimal is: ");
        System.out.println(convertion(r));
    }
    public String convertion(long r)
    {
       if(r>0)
       {
         long d=r%16;
         if(d<10)
         s=Long.toString(d)+s;
         if(d==10)
         s=s+"A";
         if(d==11)
         s=s+"B";
         if(d==12)
         s=s+"C";
         if(d==13)
         s=s+"D";
         if(d==14)
         s=s+"E";
         if(d==15)
         s=s+"F";
         convertion(r/16);
       }
       return s;
    }
}