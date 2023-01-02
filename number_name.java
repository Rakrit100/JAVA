import java.io.*;
public class number_name
{
    public void name()throws IOException
    {
        int n,d=0,x=100;
        String s="";
        String n1="",n2="",n3="",n4="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number");
        n=Integer.valueOf(br.readLine());
        String a[]=new String[20];
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
        a[13]="thirteen";
        a[14]="fourteen";
        a[15]="fifteen";
        a[16]="sixteen";
        a[17]="seventeen";
        a[18]="eighteen";
        a[19]="nineteen";
        
            while(n!=0)
        {
            d=n%x;
            n=n-d;
            x=x*10;
            
            if(d>=0&&d<=19)
            {
                n1=a[d];
            }
                 if(d>=20&&d<=99)
                  {
                  int y=0,z=0;
                  y=d%10;
                  z=d-y;
                  n1=a[y];
                  switch(z)
                  {
                      case 20:n2="twenty";
                      break;
                      case 30:n2="thirty";
                      break;
                      case 40:n2="fourty";
                      break;
                      case 50:n2="fifty";
                      break;
                      case 60:n2="sixty";
                      break;
                      case 70:n2="seventy";
                      break;
                      case 80:n2="eighty";
                      break;
                      case 90:n2="ninety";
                      break;
                    }
                } 
                    if(d>=100&&d<=900)
                    {
                     d=d/100;   
                     n3=a[d];
                    }
                    
                      if(d>=1000&&d<=9000)
                    {
                     d=d/1000;
                     n4=a[d];
                    }
                }
                System.out.println(n4+" thousand "+n3+" hundred and "+n2+" "+n1);
            }
        }
                     