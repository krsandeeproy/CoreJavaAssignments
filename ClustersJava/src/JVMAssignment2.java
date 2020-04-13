
public class JVMAssignment2 {

	public static void main(String arg[])
	{
		int a1=-5, b1=8, c1=6;
		int a2=55, b2=9, c2=9;
		int a3=20, b3=-3, c3=5, d3=8;
		int a4=c3, b4=15, c4=3, d4=2, e4=8, f4=3;
		
		int sol1=a1+b1*c1;
		int sol2=(a2+b2)%c2;
		int sol3=a3+b3*c3/d3;
		int sol4=a4+b4/c4*d4-e4%f4;
		
		System.out.println("Solution of A: "+sol1);
		System.out.println("Solution of B: "+sol2);
		System.out.println("Solution of C: "+sol3);
		System.out.println("Solution of D: "+sol4);
	}
}
