import java.io.*;
public class Principle
{
    public void matrix()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of rows in the matrix");
        int r=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of columns in the matrix");
        int c=Integer.parseInt(br.readLine());
        if(r!=c)
        System.exit(0);
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter number in column "+(j+1)+" in row "+(i+1));
                 a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        int sum=0;
        for(int i=0;i<r;i++)
        {
           for(int l=0;l<i;l++)
                System.out.print("  ");
            System.out.println(a[i][i]);
            sum=sum+a[i][i];
        }
        System.out.println(sum);
    }          
}
                 