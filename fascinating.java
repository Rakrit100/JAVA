
public class fascinating
{
    public void fascinating_no(int n)
    {
        int n1,n2;
        n1=n*2;
        n2=n*3;
        String fn,N,N1,N2;
        N=Integer.toString(n);
        N1=Integer.toString(n1);
        N2=Integer.toString(n2);
        fn=N+N1+N2;
        int l=fn.length();
        char A[]={'1','2','3','4','5','6','7','8','9'};
        char B[]=new char[l];
        for(int o=0;o<l;o++)
        B[o]=fn.charAt(o);
        boolean check=false;
        for(int j=0;j<9;j++)
        {
            int count=0;
                for(int k=0;k<l;k++)
                {
                    if(A[j]==B[k])
                    {
                        check=true;
                        count=count+1;
                    }
                    if(count>1)
                    {
                    System.out.println("invalid");
                    System.exit(0);
                    }
                }
                if(check==false)
                {
                    System.out.println("invalid");
                    System.exit(0);
                }
                
            }
            System.out.println(n+" is valid");
                check=false;
        }
    }
                   