package Lab_Programs;

import java.util.Scanner;

public class Add {
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		Add obj1=new Add();
		System.out.println("Enter the no. 1 :");
		int a=sc.nextInt();
		System.out.println("Enter the no. 2 :");
		int b=sc.nextInt();
		int c=obj1.add(a, b);
		System.out.println("Sum = "+c);
	}
}
