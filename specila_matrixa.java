import java.util.*;
public class specila_matrixa
{
    public void spanish()
    {
          Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order of elements");
        int o=sc.nextInt();
        int r = o/10;
        int c = o%10;
        if(r!=c)
        {
        System.out.println("Invalid Input");
        System.exit(0);
       }
       int a[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
            a[i][j]=sc.nextInt();     
        }
       }
       System.out.println("\f");
       System.out.println("Enter the order of matrix");
       System.out.println(o);
       System.out.println("Enter the elements");
       for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
            System.out.print(a[i][j]+"  ");     
        }
         System.out.println(" ");
       }
    
       System.out.println("");
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
            if(a[i][j]>100)
            System.out.print(check(a[i][j])+"  "); 
            else
            System.out.print(a[i][j]+"   ");
        }
         System.out.println(" ");
       }
    }
    
     public int check(int v)
     {
         int x=10;
         int d=0;
         int f=0;
        while(v>0)
        {
            d=v%10;
            v=v/10;
            f=d+f*10;       
      }
      return f;

      }
}