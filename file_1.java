import java.io.*;
import java.util.*;
public class file_1
{
    public void files()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no.");
        int r=sc.nextInt();
        System.out.println("Enter the marks in subject 1");
        int m1=sc.nextInt();
        System.out.println("Enter the marks in subject 2");
        int m2=sc.nextInt();
        int tot=m1+m2;
        FileOutputStream fw=new FileOutputStream("somename.bin");
        DataOutputStream bw=new DataOutputStream(fw);
        bw.writeInt(r);
        bw.writeInt(m1);
        bw.writeInt(m2);
        bw.writeInt(tot);
        bw.close();
        fw.close();
        System.out.println(r);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(tot);
        }
}
