package Lab_Programs;
import java.util.*;
public class Arithematic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int A,B;
	int C;
	System.out.println("Enter no.");
	A=sc.nextInt();
	B=sc.nextInt();
	C=A+B;
	System.out.println("Add :"+C);
	C=A-B;
	System.out.println("Subtract :"+C);
	C=A*B;
	System.out.println("Multiply :"+C);
	C=A/B;
	System.out.println("Divide :"+C);
	C=A%B;
	System.out.println("Remainder :"+C);
	
}
}
