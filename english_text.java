  import java.io.*;
  public class english_text
  {
    
      public void text()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=br.readLine();
        int n=s.length();
        String ch="";
          for(int i=0;i<n;i++)  
          {
            ch=s.substring(i,i+1);
             if(ch.equals("'")||ch.equals(".")||ch.equals(",")||ch.equals(";")||ch.equals(":")||ch.equals("!")||ch.equals("?"))
                  {
                 s=s.replace(ch,"");  
                 n=n-1;
                }
                
             }
             s=s+" ";
             char cha;
             String s1="";
             String s2="";
             n=s.length();
               for(int i=0;i<n;i++)
               {
                 cha=s.charAt(i);
                   if(cha!=(' '))
                    s2=s2+cha;
                    
                   if(cha==(' '))
                   {
                     s1=s2+" "+s1;
                     s2="";
                    }
                    
                }
                System.out.println(s1);
            }
            
        }    
            