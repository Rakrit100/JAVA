import java.io.*;
public class mirror_sort
{
    public void mirror()throws IOException
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
        if(c%2==0)
        {
            int f=(c/2)-1;
            int temp;
            for(int i=0;i<c;i++)
             {
                 for(int j=0;j<c-i-1;j++)
                { if(a[j][f]>a[j+1][f])
                    {
                        temp=a[j][f];
                        a[j][f]=a[j+1][f];
                        a[j+1][f]=temp;
                    }
                }
            }
            for(int i=0;i<c;i++)
             {
                 for(int j=0;j<c-i-1;j++)
                { if(a[j][f+1]>a[j+1][f+1])
                    {
                        temp=a[j][f+1];
                        a[j][f+1]=a[j+1][f+1];
                        a[j+1][f+1]=temp;
                    }
                }
            }
        }
        else{
            int temp;
            int f=((c+1)/2)-1;
            for(int i=0;i<c;i++)
             {
                 for(int j=0;j<c-i-1;j++)

                    {
                        if(a[j][f]>a[j+1][f])
                        {
                        temp=a[j][f];
                        a[j][f]=a[j+1][f];
                        a[j+1][f]=temp;
                       }
                    }
                }
            }
      
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
                   
            