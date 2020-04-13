import java.util.Scanner;

public class JVMAssignment5 {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 4 digit number");
		int num= sc.nextInt();
		int sum=0;
		
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		
		System.out.println("Sum of 4 digits number is "+sum);
	}

}
