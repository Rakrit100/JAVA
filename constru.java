package Lab_Programs;

public class constru {
	constru()
	{
		System.out.println("Constructor 1");
	}
	constru(int a,float b)
	{
		System.out.println("Constructor 2");
	}
	constru(float a, int b)
	{
		System.out.println("Constructor 3");
	}
	constru(int a,int b, int c)
	{
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) {
		constru obj1=new constru();
		constru obj2=new constru(10,11.5f);
		constru obj3=new constru(10.2f,12);
		constru obj4=new constru(11,12,13);
	}
}
