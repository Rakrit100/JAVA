package Lab_Programs;

import java.util.Date;

class employee {
 String name;
 Date appdate;
 
 public employee(String nm,Date apdt) {
  name = nm;
  appdate =apdt;
 }
 public void display() {
  System.out.println("employee name:"+ name +"\t appointment date:\t"+ appdate.getDate() + "/" + appdate.getMonth() + "/" + appdate.getYear());
 }
}

public class empdate {
public static void main(String args[]) {
 employee emp[] = new employee[5];
 emp[0] = new employee("raju",new Date(1999,05,22));
 emp[1] = new employee("rama",new Date(2003,03,26));
 emp[2] = new employee("sita",new Date(1998,11,29));
 emp[3] = new employee("tomy",new Date(2020,07,12));
 emp[4] = new employee("king",new Date(2012,03,18));
System.out.println("list of employees");
for(int i =0;i<emp.length; i++)
 emp[i].display();

for(int i =0;i<emp.length; i++) {
for(int j=i+1;j<emp.length; j++) {
 if(emp[i].appdate.after(emp[j].appdate)) {
  employee t=emp[i]; 
  emp[i] =emp[j];
  emp[j] =t;
 }
}
}
System.out.println("\n list of employees seniority wise");
for(int i = 0; i < emp.length; i++)
 emp[i].display();
}
}

