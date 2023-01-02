import java.util.*;
public class Security_code
{
    public void code()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code(should only consists of: A,C,E,G,I,K)");
        String s=sc.nextLine();
        System.out.println("Enter the length of the code");
        int n=sc.nextInt();
        if(n>6)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        char A[]=new char[n];
        for(int i=0;i<n;i++)
        {
         if((int)(s.charAt(i))==65||(int)(s.charAt(i))==67||(int)(s.charAt(i))==69||(int)(s.charAt(i))==71||(int)(s.charAt(i))==73||(int)(s.charAt(i))==75)
            A[i]=s.charAt(i);
            else
            {
                System.out.println("Invalid");
                System.exit(0);
            }
        }
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                if(j!=k)
                {
                if(A[j]==A[k])
                {
                    System.out.println("Invalid");
                    System.exit(0);
                }
            }
            }
        }
        System.out.println("Valid");
           }
}