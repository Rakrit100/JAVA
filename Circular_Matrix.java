import java.util.*;
class Circular_Matrix
    {
        public static void matrix()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of rows/columns : ");
            int n = sc.nextInt();
            int A[][]=new int[n][n];
            for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    System.out.println("Enter");
                    A[x][y]=sc.nextInt();
                }
            }
            System.out.println("The Original Matrix:-");
                        for(int x=0;x<n;x++)
            {
                for(int y=0;y<n;y++)
                {
                    System.out.print(A[x][y]+"\t");
                }
                System.out.println();
            }
            int B[][] = new int[n][n];
            int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
            int u=0,v=0;
            while(u<n)
            {
                    for(int i=c1;i<=c2;i++)
                    {
                        B[u][v]=A[r1][i];
                        v++;
                        if(v==n)
                        {
                          v=0;
                          u++;
                        }
                    }
 
                    for(int j=r1+1;j<=r2;j++)
                    {
                        B[u][v]=A[j][c2];
                        v++;
                        if(v==n)
                        {
                          v=0;
                          u++;
                        }
                    }
 
                    for(int i=c2-1;i>=c1;i--)
                    {
                        B[u][v]=A[r2][i];
                        v++;
                        if(v==n)
                        {
                          v=0;
                          u++;
                        }
                    }
 
                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        B[u][v]=A[j][c1];
                        v++;
                       if(v==n)
                        {
                          v=0;
                          u++;
                        }
                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
   
            System.out.println("The Circular Matrix is:-");
            for(int i=n-1;i>=0;i--)
                {
                    for(int j=n-1;j>=0;j--)
                        {
                            System.out.println(B[i][j]);
                        }
                    }
        }    
    }