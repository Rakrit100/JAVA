import java.util.*;
public class sort_swap_array
{
    public void for_sort()
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
        int A[][]=new int[x][y];
        int i,j;
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.println(" enter values for array");
                A[i][j]=sc.nextInt();
                
            }
        }
        int t;
        for(int l=0;l<x;x++)
        {
       for( i=0;i<x-1;i++)
        {
            for(int k=0;k<y;k++)
            {
            for(j=0;j<y-1;j++)
            {
            if(A[i][j]>(A[i][j+1]))
            {
                t=A[i][j];
                A[i][j]=A[i][j+1];
                A[i][j+1]=t;
                
            }
          }
        }
       }
    }
       for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.println(A[i][j]);
            }
        }
    }

public void swap()
{
        int x,y;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x");
        x=sc.nextInt();
        System.out.println("Enter y");
        y=sc.nextInt();
        int A[][]=new int[x][y];
        int i,j;
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.println(" enter values for array");
                A[i][j]=sc.nextInt();
            }
        }
        int t;
        for(i=0;i<x;i++)
        {
             t=A[i][0];
                A[i][0]=A[i][y];
                A[i][y]=t;
            }
        for(int f=0;f<x;f++)
        {
            
            if(A[f][2]>(A[f+1][2]))
            {
                t=A[f][2];
                A[f][2]=A[f+1][2];
                A[f][2]=t;
                
            }
        }
       }
    }
                
        