import java.io.*;
public class file_read
{
    public void files()throws IOException
    {
        FileReader fw=new FileReader("somename.txt");
        BufferedReader bw=new BufferedReader(fw);
        String text="";
         while((text=bw.readLine())!=null)
         {
         
         System.out.println(text);
        }
        bw.close();
         fw.close();
    }
}
