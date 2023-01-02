import java.io.*;
public class non_boundary
{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix");
        int c=Integer.parseInt(br.readLine());
        String a[][]=new String[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1));
                 a[i][j]=br.readLine();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
             if(!((i==0||i==r-1)||(j==0||j==c-1)))
             {
                 System.out.print(a[i][j]+" ");
                }
                else
                System.out.print("  ");
            }
                        System.out.println();
        }
    }          
}
                 