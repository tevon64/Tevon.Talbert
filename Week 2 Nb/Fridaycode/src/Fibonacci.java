import java.util.Scanner;

public class Fibonacci {
  
	static Fibonacci r1 = new Fibonacci();
	static int x = 8;
	static int y;
	static int Z;
	static Scanner sc = new Scanner(System.in);

	
	public static int meth () {
	System.out.println("enter");
     sc.nextInt(x);
		y = x - 1;
	 Z = x + y ;
	 System.out.println(x);
	 System.out.println(y);
	 System.out.println(Z);
	return x;
	
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meth();
	}

}
