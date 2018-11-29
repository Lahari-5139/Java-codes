class Swap
{
	public static void main(String[] args)
	{
		int a,b;
		a = 10;
		b = 20;
		System.out.println("values of a and b before swaping:" + a +","+ b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("values of a and b after swaping:" + a +","+ b);
	}
}
