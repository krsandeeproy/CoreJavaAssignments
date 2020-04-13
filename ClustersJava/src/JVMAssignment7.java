import java.util.Scanner;

public class JVMAssignment7 {

	static int factorial(int num)
	{
		if(num==0||num==1)
			return 1;
		else
			return num*factorial(num-1);
	}
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int input=sc.nextInt();
		
		System.out.println("Factorial of "+input+" is "+factorial(input));
	}
}
