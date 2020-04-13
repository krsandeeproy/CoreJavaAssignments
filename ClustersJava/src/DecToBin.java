import java.util.Scanner;


public class DecToBin {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal no. to translate");
		int dec= sc.nextInt();
		int[] bin=new int[100];
		int i=0;
		while(dec>0)
		{
			bin[i++]=dec%2;
			dec=dec/2;
			
		}
		
		System.out.println("Binary no. is: ");
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(bin[j]);
		}
		
	}

}
