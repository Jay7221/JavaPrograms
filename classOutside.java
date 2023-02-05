public class classOutside
{
	public static void main(String args[])
	{
		classOutside c1 = new classOutside();
		classInside c2 = new classInside();
		System.out.println("Do nothing");
	}
	static class classInside
	{
		public void sayHello()
		{
			System.out.println("Hello!");
		}
	}
};
