import java.util.Scanner;
Interface Calci
{
	public int add(int a, int b);
	public int sub(int a, int b);
}
class CalciImpl implements Calci
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}
class CalciDriver
{
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		CalciImpl i = new CalciImpl();
		System.out.println(n1 + " + " + n2 + " = " + i.add(n1,n2));
		System.out.println(n1 + " - " + n2 + " = " + i.sub(n1,n2));

	}
}