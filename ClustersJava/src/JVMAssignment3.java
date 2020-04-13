import java.util.Scanner;

public class JVMAssignment3 {
	public static void main(String arg[])
	{
		double minutesInYear=60*24*365;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Input the number of minutes: ");
		double min=input.nextDouble();
		long years=(long)(min/minutesInYear);
		int days=(int)(min/60/24)%365;
		
		System.out.println((int)min+ " minutes is approx " 
		+ years+ " years and "+days+ " days");
		
		
		
	}
}