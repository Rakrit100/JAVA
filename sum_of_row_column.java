import java.io.*;
public class sum_of_row_column
{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix");
        int c=Integer.parseInt(br.readLine());
        int a[][]=new int[r][c];
        int x=0;
        int y=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1));
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        for(int i=0;i<r;i++)
         {
            for(int j=0;j<c;j++)
            {
               x=x+a[i][j];
            }
        
        System.out.println("Sum of row of line "+(i+1)+" is "+x);
        x=0;
    }   
        for(int i=0;i<r;i++)
          {
            for(int j=0;j<c;j++)
            {
               y=y+a[j][i];
            }
          System.out.println("Sum of column of line "+(i+1)+" is "+y);
          y=0;
          }
      
}
}