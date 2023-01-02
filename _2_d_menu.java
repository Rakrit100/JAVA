import java.util.*;
public class _2_d_menu
{
    public void _2d_sort()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows/columns");
        int r=sc.nextInt();
        int c=r;
        int A[][]=new int[r][c];
        String B[][]=new String[r][c];
        int i,j;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.println("Enter");
                A[i][j]=sc.nextInt();
                B[i][j]=Integer.toString(A[i][j]);
                }
        }
        int sum=0;
        for(i=0,j=0;i<r;i++,j++)
        {
            if(j<c)
            {
                sum=sum+A[i][j];
            }
        }
        for(i=0,j=c-1;i<r;i++,j--)
        {
            if(j>=0)
            {
                if(i!=j)
                {
                    sum=sum+A[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal elements is "+sum);
        i=0;
        j=0;
        while(i<r&&j<c)
        {
               A[i][j]=0;
               B[i][j]="0";
               i++;
               j++;
        }
        System.out.println("The Altered Array after replacing the principle diagonal is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Upper triangle is:");
             int k=1;
            for(i=0;i<r;i++)
            {
                for(int l=0;l<=i;l++)
                System.out.print("  ");
                for(j=k;j<c;j++)
                {
                   System.out.print(B[i][j]+" ");
                   A[i][j]='#';
                   B[i][j]="#";
                }
                    k++;
                    System.out.println();
                 }
                 System.out.println("The Altered Array is:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

    }
}
            
                
            