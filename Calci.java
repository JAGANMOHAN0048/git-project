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