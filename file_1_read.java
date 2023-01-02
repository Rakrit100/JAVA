import java.io.*;
public class file_1_read
{
    public void files()throws IOException
    {
        boolean EOF=false;
        FileInputStream fw=new FileInputStream("somename.bin");
        DataInputStream bw=new DataInputStream(fw);
        while(!EOF)
        {
            try
            {
             int r,m1,m2,tot;   
        r=bw.readInt();
        m1=bw.readInt();
        m2=bw.readInt();
        tot=bw.readInt();
        System.out.println(r);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(tot);
    }
    catch(EOFException e)
    {
        System.out.println("end of file");
        EOF=true;
    }
}
     bw.close();
        fw.close();
    
}
}

