import java.io.*;
public class time
{
    public void clock()throws IOException
    {
        int x,y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number");
        x=Integer.valueOf(br.readLine());
        System.out.println("Enter the second number");
        y=Integer.valueOf(br.readLine());
        if(y==60)
        {
            y=y-60;
            x=x+1;
        }
        if(y>60)
        {
         System.out.println("Invalid time");
         System.exit(0);
        }
        String a[]=new String[14];
        a[1]="one";
        a[2]="two";
        a[3]="three";
        a[4]="four";
        a[5]="five";
        a[6]="six";
        a[7]="seven";
        a[8]="eight";
        a[9]="nine";
        a[10]="ten";
        a[11]="eleven";
        a[12]="twelve";
        a[13]="one";
        
         String hour="";
        if(y>30)
        hour =a[x+1];
        if(y<=30)
        hour =a[x];
        
        int n=0;
        if(y>30)
        n=60-y;
        if(y<=30)
        n=y;
        
        String b[]=new String[31];
        b[1]="one";
        b[2]="two";
        b[3]="three";
        b[4]="four";
        b[5]="five";
        b[6]="six";
        b[7]="seven";
        b[8]="eight";
        b[9]="nine";
        b[10]="ten";
        b[11]="eleven";
        b[12]="twelve";
        b[13]="thirteen";
        b[14]="fourteen";
        b[15]="fifteen";
        b[16]="sixteen";
        b[17]="seventeen";
        b[18]="eighteen";
        b[19]="nineteen";
        b[20]="twenty";
        b[21]="twenty one";
        b[22]="twenty two";
        b[23]="twenty three";
        b[24]="twenty four";
        b[25]="twenty five";
        b[2]="twenty six";
        b[27]="twenty seven";
        b[28]="twenty eight";
        b[29]="twenty nine";
        b[30]="thirty";
        
       
        String minutes = b[n];            
        if(y==0)
        System.out.println(hour+" 'o clock,"+x+":"+0+y);
        if(y==15)
        System.out.println("Quater past "+hour+","+x+":"+y);
        if(y==30)
        System.out.println("Half past "+hour+","+x+":"+y);
        if(y<30&&y!=15&&y!=0)
        System.out.println(minutes+" past "+hour+","+x+":"+y);
        if(y>30)
        System.out.println(minutes+" minutes to "+hour+","+x+":"+y);
         if(y<10&&y!=0)
        System.out.println(minutes+" past "+hour+","+x+":"+0+y);
    }
}

        
        