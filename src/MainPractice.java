
public class MainPractice {

	public static void main(String[] args)
	{
		
		
		Basic easy = new Basic();
		

		System.out.println("Hello Wide Wide World!");
		
		easy.helloWorld(); 
		
		System.out.println(easy.anyHello("french"));
	
		easy.returnHello("Have a great day!!");
		
		System.out.println("The sum of these integers = " + easy.method(12, 33));
	
		System.out.println(easy.conditionals(5, 10, true));
		System.out.println(easy.conditionals(5, 10, false));
	
		System.out.println(easy.conditionals2(5, 0));
		System.out.println(easy.conditionals2(5, 5));
		System.out.println(easy.conditionals2(0, 8));
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("i = " + i);
			System.out.println("conditionals2 gives us " + easy.conditionals2(2, i));
		}
		
		//creating an array and adding the values in the {} to it.
		int [] array10 = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9}; 
		String [] arrayTen = {"one", "two", "three", "four", "...", "ten"};
		System.out.println(array10[3]);
		System.out.println(arrayTen[3]);
		
		for (int i : array10)
		{
			System.out.println(array10[i]);
		}
		
		for (int i = 0 ; i < arrayTen.length ; i++ )
		{
			System.out.println(arrayTen[i]);
		}
		
		easy.enterArray(24);
		
	}
}
