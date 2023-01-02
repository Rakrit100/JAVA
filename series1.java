import java.io.*;
public class series1
{
    public void name()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. 1/n!  2. x^n/n1   3. x^n");
        int choice=Integer.valueOf(br.readLine());
        switch(choice)
        {
            case 1: System.out.println("Enter Limit");
                    int l=Integer.parseInt(br.readLine());
                    float result=1;
                      for(int i=2;i<=l;i++)
                      result=result+(1/factorial(i));
                    System.out.println(result);
                    break;
            
            case 2: System.out.println("Enter Limit");
                    int m=Integer.parseInt(br.readLine());
                    System.out.println("Enter variable");
                    int x=Integer.parseInt(br.readLine());
                    double result1=x;
                    int count=1;
                     for(int i=2;i<=m;i++)
                     {
                      result1=result1-((Math.pow(x,i)/factorial(i))*Math.pow(-1,count));
                      count++;
                    }
                      System.out.println(result1);
                    break;  
            case 3: System.out.println("Enter Limit");
                    int n=Integer.parseInt(br.readLine());
                    System.out.println("Enter variable");
                    int y=Integer.parseInt(br.readLine());
                    double result2=1;
                    for(int i=2;i<=n;i++)
                      result2=result2+Math.pow(y,i);
                    System.out.println(result2);
                    break;  
                    default:System.out.println("Invalid choice");
                    break;
                }
            }
            public int factorial(int x)
            {
                int i,count=1;
                for(i=1;i<=x;i++)
                {
                    count=count*i;
                }
                return count;
            }
        }
        