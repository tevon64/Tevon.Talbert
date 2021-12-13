import java.util.Scanner;

public class Reverse {
static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {  
                 
		
	        String Phase = "";    
	        Phase = sc.nextLine() ;	    
	        String reversedStr = "";    
	            
	      
	        for(int i = Phase.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + Phase.charAt(i);    
	        }    
	            
	        System.out.println("Original string: " + Phase);    
	       
	        System.out.println("Reverse of given string: " + reversedStr);    
	    }    
	}    


