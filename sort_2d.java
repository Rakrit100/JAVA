import java.util.*;
  public class sort_2d
  {
     public void matrix()
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number of rows in the matrix");
          int r1=sc.nextInt();
          System.out.println("Enter the number of columns in the matrix");
          int c1=sc.nextInt();
          int x[][]=new int[r1][c1];
          for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c1;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1)+" of matrix");
                x[i][j]=sc.nextInt();
            }
          }
         int temp=0;
         for(int i=0;i<r1;i++)
          {
            for(int l=0;l<c1;l++)
            {
                  for(int j=0;j<r1;j++)
                 {
                  for(int k=0;k<c1;k++)
                  {
                   if(x[j][k]>x[i][l])
                   {
                     temp=x[i][l];
                     x[i][l]=x[j][k];
                    x[j][k]=temp;
                   }
                  } 
                 }
           }
          }
       
           
          for(int i=0;i<r1;i++)
          {
           for(int j=0;j<c1;j++)
           {
            System.out.print(x[i][j]+" ");
           }
           System.out.println();
          }
     }
  }


   