class wages extends worker
{
        int hrs;float rate; float wages; float overtime;
        public void main(String s,float b,int h,float r)
         {
             wages wr=new wages(s,b,h,r);
             wr.cal();
             wr.display();
            }
          wages(String n,float b,int h,float r)
           {
            super(n,b);
            hrs=h;
            rate=r;
            
        }
        public void cal()
        {
            overtime=hrs*rate;
            wages=overtime+basic;
         }
         public void display()
         { super.display();
            System.out.println("Hours "+name+" worked = "+hrs);
            System.out.println("Rate per hour= "+rate);
            System.out.println("Overtime amount "+overtime);
            System.out.println("Wages recived by "+name+" is "+wages);             
            }
         
         
 }