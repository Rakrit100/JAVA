import java.io.*;
public class multi_of_matrix
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
        if(r2!=c1)
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
        int a[][]=new int[r1][c2];
        int w=0,z=0;
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                while(w<c1||z<r2)
                {
                 a[i][j]=a[i][j]+(x[i][w]*y[z][j]);
                 w++;
                 z++;
                }
                w=0;z=0;
               }
        }
         for(int i=0;i<r1;i++)
         {
            for(int j=0;j<c2;j++)
            {
                System.out.print(a[i][j]+" ");
             }
                System.out.println();
         }
      }
 }        
                        