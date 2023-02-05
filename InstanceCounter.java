public class InstanceCounter
{
	private static int numInstances = 0;
	protected static int getCount()
	{
		return numInstances;
	}
	private static void addInstance()
	{
		++numInstances;
	}
	InstanceCounter()
	{
		InstanceCounter.addInstance();
	}
	public static void main(String args[])
	{
		System.out.println("Started with : " + InstanceCounter.getCount());
		final InstanceCounter inst = new InstanceCounter();
		for(int i = 0; i < 500; ++i)
		{
			inst.addInstance();
		}
		System.out.println("Number of Instances : " + InstanceCounter.getCount());
	}
}
