import java.io.*;
public class Julian_date
{
    public void name()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the day");
        int d=Integer.valueOf(br.readLine());
         System.out.println("Enter the month");
        int m=Integer.valueOf(br.readLine());
         System.out.println("Enter the year");
         int y=Integer.valueOf(br.readLine());
         int a;
         if(y%4==0&&m==2)
         {
             if(d>29)
             System.exit(0);
            }
         if(y%4!=0&&m==2)
         {
             if(d>28)
             System.exit(0);
            }
         if(m==1)
         System.out.println(d);
         a=31;
         if(m==2)
         {
              System.out.println(a+d);
            }
              if(y%4==0)
              a=a+29;
              if(y%4!=0)
              a=a+28;
           
            if(m==3)
         System.out.println(a+d);
         a=a+31;
          if(m==4)
         System.out.println(a+d);
         a=a+30;
          if(m==5)
         System.out.println(a+d);
         a=a+31;
          if(m==6)
         System.out.println(a+d);
         a=a+30;
          if(m==7)
         System.out.println(a+d);
         a=a+31;
          if(m==8)
         System.out.println(a+d);
         a=a+31;
          if(m==9)
         System.out.println(a+d);
         a=a+30;
          if(m==10)
         System.out.println(a+d);
         a=a+31;
          if(m==11)
         System.out.println(a+d);
         a=a+30;
          if(m==12)
         System.out.println(a+d);
         a=a+31;
        }
    }
    