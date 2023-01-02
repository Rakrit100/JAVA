import java.io.*;
import java.util.*;
public class file
{
    public void files()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no.");
        int r=sc.nextInt();
        System.out.println("Enter the name of student");
        String s=sc.next();
        System.out.println("Enter the marks in subject 1");
        int m1=sc.nextInt();
        System.out.println("Enter the marks in subject 2");
        int m2=sc.nextInt();
        int tot=m1+m2;
        FileWriter fw=new FileWriter("somename.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println(r);
        pw.println(s);
        pw.println(m1);
        pw.println(m2);
        pw.println(tot);
        pw.close();
        bw.close();
        fw.close();
        System.out.println(r);
        System.out.println(s);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(tot);
        }
}
