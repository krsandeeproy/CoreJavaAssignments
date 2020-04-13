import java.util.Scanner;

public class JVMAssignment6 {
	//static int arr[]= {10,22,0,45,33,229,21,2,65,76,44};
	
    int maximum(int[] array)
	{
		int max=array[0];
		
		for(int i=0;i<array.length;i++)
			if(array[i]>max)
			
				max=array[i];
		
		return max;
		
		
	}
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int in=sc.nextInt();
		System.out.println("Enter values: ");
		int[] arr=new int[in];
		for(int i=0;i<in;i++)
			arr[i]=sc.nextInt();
		
		JVMAssignment6 obj=new JVMAssignment6();
		
		System.out.println("Greatest number in an array is: "+obj.maximum(arr));
	}
}
