
import java.io.*;
public class three_array
{
    public void three()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of names in Array A");
        int n=Integer.valueOf(br.readLine());
        System.out.println("Number of names in Array B");
        int m=Integer.valueOf(br.readLine());
        String A[]=new String[n];
        String B[]=new String[m];
        String t;
      
        int q=0;
       System.out.println("Enter the names for Array A");
       while(q<n)
        {
           
            System.out.println("Enter the name");
            A[q]=br.readLine();
            q++;
        }
        int y=0;
        System.out.println("Enter the names for Array B");
       while(y<m)
        {
           
            System.out.println("Enter the name");
            B[y]=br.readLine();
            y++;
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
             if(A[j].compareTo(A[j+1])>0)
             {
                t=A[j];
                A[j]=A[j+1];
                A[j+1]=t;
             }
            }
      
        }
     
       for(int i=0;i<m;i++)
        {
            for(int j=0;j<m-i-1;j++)
            {
            if(B[j].compareTo(B[j+1])>0)
            {
                t=B[j];
                B[j]=B[j+1];
                B[j+1]=t;
            }
          }
       }
    
      System.out.println("Names in Array A");
       for(int a=0;a<n;a++)
        {
            System.out.println(A[a]);
        }
        System.out.println("Names in Array B");
        for(int b=0;b<m;b++)
        {
            System.out.println(B[b]);
        }
       int x =n+m;
        String C[]=new String[x];
        int i=0,j=0;
         for (int k=0;k<x;)
       {
           if(i<n&&j<m)
          {
              if(i>=n)
            {
            for (;k<n+m;)
            {
                C[k]=B[j];
                j++;
                k++;
            }
            break;
           }
              if(j>=m)
            {
              for (;k<n+m;)
              {
                C[k]=A[i];
                i++;
                k++;
              }
              break;
            }
             if(B[j].compareTo(A[i])>0)
             {
              C[k]=A[i];
              i++;
              k++;
             }
             if(i>=n)
            {
            for (;k<n+m;)
            {
                C[k]=B[j];
                j++;
                k++;
            }
            break;
           }
              if(j>=m)
            {
              for (;k<n+m;)
              {
                C[k]=A[i];
                i++;
                k++;
              }
              break;
            }  
             if(B[j].compareTo(A[i])<0)
             {
                C[k]=B[j];
                j++;
                k++;
             }
           }
           /* 
            if(i>=n)
            {
            for (;k<n+m;)
            {
                C[k]=B[j];
                j++;
                k++;
            }
            break;
           }
              if(j>=m)
            {
              for (;k<n+m;)
              {
                C[k]=A[i];
                i++;
                k++;
              }
              break;
            }
          */
       }
            
     
        
        
        
        
        
        
        
        System.out.println("Names when list is combined"); 
        for(int k=0;k<n+m;k++)
        {System.out.println(C[k]);
        }
    }
}
        