public abstract class SuperClass
{
	abstract void sayHello();
	public static void main(String args[])
	{
		SubClass s = new SubClass();
		s.sayHello();
	}
}


class SubClass extends SuperClass
{
	void sayHello()
	{
		System.out.println("Hello Java World!");
	}
}
