import java.io.*;
public class upper_lower_triangle
{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix");
        int c=Integer.parseInt(br.readLine());
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1));
                 a[i][j]=Integer.parseInt(br.readLine());
            }
        }
            int k=1;
            for(int i=0;i<r;i++)
            {
                for(int l=0;l<i;l++)
                System.out.print("  ");
                for(int j=k;j<c;j++)
                   System.out.print(a[i][j]+" ");
                    k++;
                    System.out.println();
                 }
            k=0;
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<k;j++)
                  System.out.print(a[i][j]+" ");
                    k++;
                System.out.println();
            }
        }
    }         