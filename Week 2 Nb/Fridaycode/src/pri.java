import java.util.Scanner;

public class pri {

	
	String ask = "*";
	static int j = 0;
	public pri(int j ) 
	{
	       pri.j = 7;
	}
		
	
	  public static void main(String agrs[]) {
 System.out.println("The Pattern is");
	        for (int i = 0; i < 7; i++) {
	            for (int j = 0; j < 7; j++) {
	                if (j <= i) {
	                    System.out.print("  *");
	                }else {
	                    System.out.print("   ");
	                }
	            }
	            System.out.println();
	        }
	  }
	  }
	  
