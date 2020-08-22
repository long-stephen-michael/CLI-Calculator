package homework;

import java.util.Scanner;

public class Calculator 
{
	
	
	public static void main(String[] args) 
	{
	
		System.out.println("Welcome to the CLI Calculator");
		
		System.out.println("Operations:");
		System.out.println("a: Addition");
		System.out.println("s: Subtraction");
		System.out.println("m: Multiplication");
		System.out.println("d: Division");
		System.out.println("e: Exit");
		
		char operator;
		double answer = 0;
		    
		Scanner input = new Scanner(System.in);
		
		    System.out.println("Enter a value for the first number:");
		    
		    double iNum1 = input.nextInt();
		
		    System.out.println("Enter a value for the  second number:");
		    
		    double iNum2 = input.nextInt();
		
		    System.out.println("Choose your operation: ");
		    
		     operator = input.next().charAt(0);
		     
		     if (operator == 'd' && iNum1 == 0 || iNum2 == 0)
				{
			
		    	 System.out.println("Dividing by 0: Enter a value for the first number:");
				    
				    iNum1 = input.nextInt();
				
				    System.out.println("Enter a value for the  second number:");
				    
				    iNum2 = input.nextInt();
				
				    System.out.println("Enter the operation:");
				    
				     operator = input.next().charAt(0);
				
				}
			else
				{
				;
				}
		     
		switch (operator)
		    {
		    case 'a': 
		    	answer = iNum1 + iNum2;
		    	break;
		    case 's': 
		    	answer = iNum1 - iNum2;
		    	break;
		    case 'm': 
		    	answer = iNum1 * iNum2;
		    	break;
		    case 'd':
		    	answer = iNum1 / iNum2;
		    	break;
		    case 'e':
		    	System.out.printf("Goodbye!");
		    	break;
		    }
		
	if (operator == 'd') {
		System.out.printf("The answer is: %.2f", answer);
	}
	else {
		System.out.printf("The answer is: %.0f", answer);
	}
		
	}

}