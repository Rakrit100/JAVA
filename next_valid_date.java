import java.util.*;
public class next_valid_date
{
    public void date()
    {
        Scanner sc=new Scanner(System.in);           //0123456789
        System.out.println("Enter the Date in the form(dd//mm//yy)");
        String s=sc.nextLine();
        int d= Integer.parseInt(s.substring(0,2));
        int m=Integer.parseInt(s.substring(4,6));
        int y=Integer.parseInt(s.substring(8));
        if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&d>31)
        System.out.println("Invalid Input");
         if((m==4|m==6||m==9||m==11)&d>30)
        System.out.println("Invalid Input");
         if(y%4==0&&m==2)
         {
             if(d>29)
             System.out.println("Invalid Input");
            }
          if(y%4!=0&&m==2)
           {
             if(d>28)
              System.out.println("Invalid Input");
            }
           if(m==1)
          {
             if(d!=31)
             {
             d=d+1;
            }
             if(d==31)
            {
               d=1;
               m=m+1;
            }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
             if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==2)
          {
             
            
              if(y%4==0)
              { 
               if(d!=29)
                d=d+1;
                if(d==29)
               {
                  d=1;
                 m=m+1;
               }
              }
              else if(y%4!=0)
              { 
               if(d!=28)
                d=d+1;
                if(d==28)
               {
                  d=1;
                 m=m+1;
               }
              }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
             if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
            if(m==3)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=m+1;
            }
             if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==4)
           {
             if(d!=30)
             d=d+1;
             if(d==30)
             
             {
               d=1;
               m=m+1;
            }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==5)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=m+1;
            }
             if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==6)
          {
             if(d!=30)
             d=d+1;
             if(d==30)
             
             {
               d=1;
               m=m+1;
            }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==7)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=m+1;
            }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
             if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);      
            }
          if(m==8)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=m+1;
            }
           if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
             if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==9)
          {
             if(d!=30)
             d=d+1;
             if(d==30)
             
             {
               d=1;
               m=m+1;
            }
             if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==10)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=m+1;
            }
            if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==11)
          {
             if(d!=30)
             d=d+1;
             if(d==30)
             
             {
               d=1;
               m=m+1;
            }
              if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
          if(m==12)
          {
             if(d!=31)
             d=d+1;
             if(d==31)
             
             {
               d=1;
               m=1;
               y=y+1;
            }
             if(d<10&&m>10)
             System.out.println("0"+d+"//"+m+"//"+y) ; 
             if(m<10&&d>10)
             System.out.println(d+"//0"+m+"//"+y) ; 
             if(m<10&&d<10)
             System.out.println("0"+d+"//0"+m+"//"+y) ; 
            if(d>=10&&m>=10)
             System.out.println(d+"//"+m+"//"+y) ;
             System.exit(0);
            }
    }
}
