import java.util.*;
public class string_diverse
{
    public void string()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        s=s+" ";
        int n=s.length();
        int count=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                count++;
            }
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                count1++;
            }
            if(Character.isUpperCase(ch)==true)
            {
                count2++;
            }
        }
        int no_words=count;
        int no_vowels=count1;
        int no_upper=count2;
        System.out.println("Number of words in the string "+no_words);
        System.out.println("Number of vowels in the string "+no_vowels);
        System.out.println("Number of upper case characters in the string "+no_upper);
        String s1=s;
        s1=s.toUpperCase();
        int count4=0;
        System.out.println("Frequency of alphabets");
        for(int x=65;x<90;x++)
        {
            for(int i=0;i<n;i++)
            {
               if(s1.charAt(i)==x)
               {
                count4++;
               }
            }
              if(count4>0)
            {
                System.out.println((char)(x)+"="+count4);
            }
            count4=0;
        }
        System.out.println("Frequency of each word");
        int x=0,y=0;
        String A[]=new String[count+1];
        int r=0;
        outer:for(int i=0;i<n;i++)
        {
            String d;
            if(s.charAt(i)==' ')
            {
                y=i;
                d=s.substring(x,y);
                x=i+1;
                boolean f=false;
                for(int w=0;w<r;w++)
                {
                f=A[w].equalsIgnoreCase(d);
                if(f==true)
                break;
            }
            
            if(f==true)
            continue outer;
            if(f==false)
            {
                A[r]=d;
                r++;
                int a=0,b=0;
                int count5=0;
                for(int j=0;j<n;j++)
                {
                    String c=" ";
                    if(s.charAt(j)==' ')
                    { 
                        b=j;
                        c=s.substring(a,b);
                        a=j+1;
                    }
                    if(d.equalsIgnoreCase(c)==true)
                    {
                        count5++;
                    }
                }
            
                if(count5>0)
                System.out.println(d+"="+count5);
            }
         }
        
      }
    }
}
                    