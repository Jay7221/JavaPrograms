public class Puppy{
	int puppyAge;

	public Puppy()
	{
	}
	public Puppy(String name)
	{
		// This constructor has one parameter, name.
		System.out.println("Name chosen is :" + name);
	}

	public void setAge(int age)
	{
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy's age is :" + puppyAge);
		return puppyAge;
	}
	public static void main(String args[])
	{
		Puppy myPuppy = new Puppy("Tommy");

		myPuppy.setAge(2);
		myPuppy.getAge();

		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}
}
