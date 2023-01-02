 import java.util.*;
public class menu_driven_2_D_Array
{
   public void menu()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows/columns(greater than 3)");
       int r=sc.nextInt();
       if(r<=3)
       {
       System.out.println("The number of rows and column is not sufficient");
       System.exit(0);
       }
       int c=r;
       int A[][]=new int[r][c];
       for(int i=0;i<r;i++)
       {
           for(int j=0;j<c;j++)
           {
               System.out.println("Enter");
               A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Choose");
        System.out.println("1.Swap rows,2.Highest value,3.Lowest value");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                   for(int x=0;x<c;x++)
                   {
                       System.out.print(A[r-1][x]+" ");
                    }
                    System.out.println();
                    for(int y=1;y<r-1;y++)
                    {
                        for(int z=0;z<c;z++)
                        {
                            System.out.print(A[y][z]+" ");
                        }
                        System.out.println();
                    }
                    for(int w=0;w<c;w++)
                    {
                        System.out.print(A[0][w]+" ");
                    }
                    System.out.println();
                    break;
                    
            case 2:
                    int l=0;
                    for(int i=0;i<r;i++)
                    {
                      for(int j=0;j<c;j++)
                      {
                          if(l<A[i][j])
                          l=A[i][j];
                        }
                    }
                    System.out.println("Highest value = "+l);
                    break;
             
            case 3:
                   int s=A[0][0];
                   for(int i=0;i<r;i++)
                    {
                      for(int j=0;j<c;j++)
                      {
                          if(s>A[i][j])
                          s=A[i][j];
                        }
                    }
                    System.out.println("Smallest value = "+s);
                    break;
                 
            default: System.out.println("Invalid choice");
        }
    }
}
                     