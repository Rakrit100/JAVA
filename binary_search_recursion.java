import java.util.*;
public class binary_search_recursion
{
    int u=0,l=0,m=0;
    public void call(int i,int s)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[i];
        System.out.println("enter");
        for(int j=0;j<i;j++)
        a[j]=sc.nextInt();
        u=i-1;
        binary_search_recursion obj=new binary_search_recursion();
        System.out.println(recursion(i,a,s)+1);
    }
    public int recursion(int i,int a[],int s)
    {
        m=(u+l)/2;
        if(a[m]==s)
        return m;
        if(a[m]<s)
        {
        u=m-1;
        recursion(i,a,s);
       }
        if(a[m]>s)
       {
        l=m+1;
        recursion(i,a,s);
       }
       return 0;
    }
}