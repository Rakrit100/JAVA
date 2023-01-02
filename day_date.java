import java.util.*;
import java.io.*;
public class day_date
{
       public void day()throws IOException
       {
         Scanner sc =new Scanner(System.in);
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the day");
         int d=sc.nextInt();
         System.out.println("Enter the month");
         int m=sc.nextInt();
         System.out.println("Enter the year");
         int y=sc.nextInt();
         System.out.println("Enter the day on the date: 01//01//"+y+"(All CAPS)");
         String s=br.readLine();
         
         String S[]={"MONDAY","TUESDAY","WEDNESDAY","THUSDAY","FRIDAY","SATURDAY","SUNDAY"};
             int n=0;
         for(int i=0;i<7;i++)
        {
            if(S[i].equals(s))
            n=i;
        }
         int a;
         int tot=0;
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
         tot=d;
         a=31;
         if(m==2)
         {
              tot=a+d;
            }
              if(y%4==0)
              a=a+29;
              if(y%4!=0)
              a=a+28;
           
            if(m==3)
         tot=a+d;
         a=a+31;
          if(m==4)
         tot=a+d;
         a=a+30;
          if(m==5)
         tot=a+d;
         a=a+31;
          if(m==6)
         tot=a+d;
         a=a+30;
          if(m==7)
         tot=a+d;
         a=a+31;
          if(m==8)
         tot=a+d;
         a=a+31;
          if(m==9)
         tot=a+d;
         a=a+30;
          if(m==10)
         tot=a+d;
         a=a+31;
          if(m==11)
         tot=a+d;
         a=a+30;
          if(m==12)
         tot=a+d;
         a=a+31;
         
         
         
         int c=n+(tot-1)%7;
         if(c>=7)
         c=c-7;
         System.out.println("The given date is on a "+(S[c]));

       }
}
