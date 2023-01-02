package Lab_Programs;

public class instance_variable {
	String name;
		char c;
		short s;
		byte b;
		int a;
		long l;
		float f;
		double d;
		boolean flag;
		public static void main(String[] args) 
	{
			instance_variable iv = new instance_variable();
			System.out.println("String = "+iv.name);
			System.out.println("Char = "+iv.c);
			System.out.println("Byte = "+iv.b);
			System.out.println("Short = "+iv.s);
			System.out.println("Int = "+iv.a);
			System.out.println("Long = "+iv.l);
			System.out.println("Float = "+iv.f);
			System.out.println("Double = "+iv.d);
			System.out.println("Boolean = "+iv.flag);
			System.out.println("These are the default values of all the pre-built datatypes");
			
		}

	}
	 

