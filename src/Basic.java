
public class Basic {

	public int method(int a, int b)
	{
		return a + b;
	}

	public void helloWorld()
	{
		System.out.println("Hello World!");
	}
	
	public String anyHello(String hello)
	{
		return "Hello Hello!";
	}

	public void returnHello(String hi)
	{
		System.out.println(hi);
	}
	
	// this is a method that if boob is true then it returns the sum and if its false it multiplies the integers inputted 
	public int conditionals(int a, int b, boolean boob)
	{
		if (boob)
		{
			return a + b; 
		}
		else 
		{
			return a * b; 
		}
	}

	public int conditionals2(int a, int b)
	{
		if (a == 0)
		{
			return b;
		}
		if (b == 0)
		{
			return a;
		}
		else 
		{
			return a + b;
		}
	}

	// setting an array under the name intoArray to be of integers of length 10
	int [] intoArray = new int[10]; 
	

	public void enterArray(int a)
	{
		for (int i = 0; i < intoArray.length; i++)
		{
			int c = a * i;
			intoArray[i] = 10 * c;
			System.out.println(intoArray[i]);
		}
	}
	
	
}
