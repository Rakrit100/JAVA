import java.io.*;
  public class valid_string
  {
    
     public void valid()throws IOException
      {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string with paranthesis");
        String s=br.readLine();
        int n=s.length();
        String ch="";
        boolean check1=false,check2=false;
        int count1=0,count2=0;
          for(int i=0;i<n;i++)  
          {
            ch=s.substring(i,i+1);
             if(ch.equals("("))
             {
                check1=true;
                count1+=1;
             }
             
             if(ch.equals(")"))
             {
                check2=true;
                count2+=1;
             }
             
          }
        String s1=s;
            if(check1==true&&check2==true&&count1==1&&count2==1)
            {
              s1=s1.replace("(","");
              s1=s1.replace(")","");
            }
            System.out.println(s1);
      }
   }
    
            