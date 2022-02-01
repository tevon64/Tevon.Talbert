package Com.Revature;

import java.util.Scanner;

public class methods 
{
	String LogUser = "";
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void Login()
	{
		
		
		String user = "Tevon";
		String userPassword = "1993";
		String user2 = "Chloe";
		String userPassword2 = "1127";
		System.out.println("Go");
		String input = sc.next();
	     System.out.println("Please enter your username then hit enter and enter password");
	   int enterpass = sc.nextInt();
	    
		if(enterpass == 1993)
		{
			LogUser =  "Tevon" ;
			Welcome();
		}
		else if(input == "Chloe" && enterpass == 1127)
		{
			LogUser = "Chloe";
			Welcome();
		}
		else
		{
			System.out.println("Login Failed, Please try again");
			System.out.println(input);
			System.out.println(enterpass);
			Login();
		}
	
	}
	
	public void Welcome()
	{
		System.out.println("Welcome "  + LogUser);
	}

}
