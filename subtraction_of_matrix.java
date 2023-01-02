import java.io.*;
public class subtraction_of_matrix
{
  public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix 1");
        int r1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix 1");
        int c1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of rows in the matrix 2");
        int r2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix 2");
        int c2=Integer.parseInt(br.readLine());
        if(r1!=r2&&c1!=c2)
        System.exit(0);
        
        int x[][]=new int[r1][c1];
        int y[][]=new int[r2][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1)+" of matrix 1");
                x[i][j]=Integer.parseInt(br.readLine());
            }
        }
            for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1)+" of matrix 2");
                y[i][j]=Integer.parseInt(br.readLine());
            }
        }
        int a[][]=new int[r1][c1];
           for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
               a[i][j]=x[i][j]-y[i][j];
            }
        }
           for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
               System.out.print(a[i][j]+" ");
            }
             System.out.println();
        }
    }
}

        
        