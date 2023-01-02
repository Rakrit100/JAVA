import java.io.*;
public class transvese_matrix
{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of column in the matrix");
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
        System.out.println("the transverse of the matrix is");
        for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
               System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}


