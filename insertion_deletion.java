import java.util.*;
public class insertion_deletion
{
   public void insert()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no. of numbers in the array");
      int n=sc.nextInt();
       int A[]=new int[n+1];
       for (int i=0;i<n;i++)
       {
           System.out.println("Enter");
           A[i]=sc.nextInt();
        }
        System.out.println("To insert a number");
        System.out.println("Enter the number to be inserted");
        int x=sc.nextInt();
        System.out.println("Enter the position (from 0) at which "+x+" must be inserted");
        int xp=sc.nextInt();
        int temp;
        for(int i=n;i>xp;i--)
        A[i]=A[i-1];
            
        A[xp]=x;
        System.out.println("To delete a number");
        System.out.println("Select the number to be deleted by entering");
        System.out.println("1. The number to be deleted, or 2. The position of the number to be deleted");
        int cho=sc.nextInt();
        int p=0;
        switch(cho)
        {
            case 1:System.out.println("Enter the number to be deleted");
                   int y=sc.nextInt();
                   for(int i=0;i<n;i++)
                   {
                     if(A[i]==y)
                      A[i]=0;
                      p=i;
                    }
                   break;
            case 2:System.out.println("Enter the position from which the number should be deleted");
                   int yp=sc.nextInt();
                   A[yp]=0;
                   p=yp;
                   break;
            default:System.out.println("Invalid choice");
        }
        for(int i=p;i<n;i++)
        A[i]=A[i+1];
        System.out.println("The array after insertion and deletion");
        for(int a=0;a<n;a++) 
        {
            if(A[a]!=0)
            System.out.print(A[a]+" ");
        }
        
    }
}
  
        
        