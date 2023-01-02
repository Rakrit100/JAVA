import java.util.*;
import java.io.*;
public class menu_driven_sort
{
    public void sort()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select whether the array should be integer array or string array");
        System.out.println("1. String,2. Integer");
        int type=sc.nextInt();
        switch(type)
        {
           case 1:
                    System.out.println("Enter the strength of the array"); 
                    int n=sc.nextInt(); 
                    String A[]=new String[n];  
                    for (int i=0;i<n;i++)  
                    {           
                        System.out.println("Enter"); 
                        A[i]=br.readLine();     
                    }
                    System.out.println("Select the type of Sort");
                    System.out.println("1.Bubble,2.Selection,3.Insertion");
                    int ch=sc.nextInt();
                     switch(ch)
                    {
                        case 1:
                                String temp="";
                                for(int i=0;i<n;i++)
                                {
                                    for(int j=0;j<n-i-1;j++)
                                    {
                                        if(A[j].compareToIgnoreCase(A[j+1])>0)
                                        {
                                            temp=A[j];
                                            A[j]=A[j+1];
                                            A[j+1]=temp;
                                        }
                                    }
                                }
                                break;
                        case 2:
                               String temp2="";
                               int pos=0;
                               String small="";
                               for(int i=0;i<n-1;i++)
                               {
                                   small=A[i];
                                   pos=i;
                                   for(int j=i+1;j<n;j++)
                                   {
                                       if(A[j].compareToIgnoreCase(small)<0)
                                       {
                                           small=A[j];
                                           pos=j;
                                        }
                                        temp2=A[i];
                                        A[i]=A[pos];
                                        A[pos]=temp2;
                                    }
                                }
                                    break;
                        case 3:
                               String temp1="";
                               for(int i=0;i<n-1;i++)
                               {
                                   for(int j=i+1;j>0;j--)
                                   {
                                       if(A[j].compareToIgnoreCase(A[j-1])<0)
                                       {
                                           temp1=A[j];
                                           A[j]=A[j-1];
                                           A[j-1]=temp1;
                                        }
                                    }
                                }
                                break;
                         default:
                                 System.out.println("Invalid choice");
                      }
                        for (int i=0;i<n;i++)  
                    {           
                        System.out.println(A[i]); 
                    }
                    break;
           case 2:
                  System.out.println("Enter the strength of the array"); 
                    int m=sc.nextInt(); 
                    int B[]=new int[m];  
                    for (int i=0;i<m;i++)  
                    {           
                        System.out.println("Enter"); 
                        B[i]=sc.nextInt();     
                    }
                    System.out.println("Select the type of Sort");
                    System.out.println("1.Bubble,2.Selection,3.Insertion");
                    int cho=sc.nextInt();
                    
           switch(cho)
           {
               case 1:        
                       int temp;
                                for(int i=0;i<m;i++)
                                {
                                    for(int j=0;j<m-i-1;j++)
                                    {
                                        if(B[j]>B[j+1])
                                        {
                                            temp=B[j];
                                            B[j]=B[j+1];
                                            B[j+1]=temp;
                                        }
                                    }
                                }
                                break;
                        case 2:
                               int temp2=0;
                               int pos=0;
                               int small=0;
                               for(int i=0;i<m-1;i++)
                               {
                                   small=B[i];
                                   pos=i;
                                   for(int j=i+1;j<m;j++)
                                   {
                                       if(B[j]<small)
                                       {
                                           small=B[j];
                                           pos=j;
                                        }
                                    }
                                        temp=B[i];
                                        B[i]=B[pos];
                                        B[pos]=temp;
                                }
                                    break;
                        case 3:
                               int temp1=0;
                               for(int i=0;i<m-1;i++)
                               {
                                   
                                 for(int j=i+1;j>0;j--)
                                 {
                                  if(B[j]<B[j-1])
                                   {
                                    temp1=B[j];
                                    B[j]=B[j-1];
                                    B[j-1]=temp1;
                                   }
                                }
                               }
                                break;
                         default:
                                 System.out.println("Invalid choice");
                      }
                        for (int i=0;i<m;i++)  
                    {           
                        System.out.println(B[i]); 
                    }
                   
    }
}
}
                 
                             
                               
                                  
                                
                                
                   
    

