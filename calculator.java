package calculator;

import java.util.Scanner;
import java.io.*;
 
public class Calculator {
	
	public int add(int num1, int num2){
	
		int sum;
		sum = num1 + num2;
		
		return sum;
	}
	
	public int subtract(int num1, int num2){
	
		int sum;
		sum = num1 - num2;
		
		return sum;
	}
	
	public int multiply(int num1, int num2){
	
		int sum;
		sum = num1 * num2;
		
		return sum;
	}
	
	public int divide(int num1, int num2){
	
		int sum;
		sum = num1 / num2;
		
		return sum;
	}
	

    
    public static void main(String args[]) {
    	
    	int choice;
    	int x;
    	int y;
    	int sum;
    	
    	
    	Calculator calc = new Calculator();
    
    	
    	do
    	{
    		System.out.println("Girish Calculator");
    		System.out.println("--------------------\n");
    		System.out.println("1.  Add");
    		System.out.println("2.  Subtract");
    		System.out.println("3.  Multiply");
    		System.out.println("4.  Divide");
    		System.out.println("99. End Program\n");
    		System.out.println("Enter Choice: ");
    		
    		Scanner input = new Scanner(System.in);
    		choice = input.nextInt();
    		
    		while ((choice < 1 || choice > 4) && choice != 99)
    		{
    			System.out.println("Please enter a 1, 2, 3, or 4: " );
    			choice = input.nextInt();
    		}
    			
    	try
    	{
    		FileWriter fstream = new FileWriter("calculatorlog.txt");
    		BufferedWriter out = new BufferedWriter(fstream);
    	
    	
    	switch (choice)
    	{
    		case 1: 
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.add(x,y);
    			System.out.printf("The sum is %d\n\n",sum);
    			out.write(x + "+" + y + "=" + sum);
    			break;
    			
    		case 2:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.subtract(x,y);
    			System.out.printf("The subtract is %d\n\n",sum);
    			out.write(x + "-" + y + "=" + sum);
    			break;
    			
    		case 3:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.multiply(x,y);
    			System.out.printf("The multiply is %d\n\n",sum);
    			out.write(x + "*" + y + "=" + sum);
    			break;
    			
    		case 4:
    			System.out.println("Please enter 2 numbers only: ");
    			x = input.nextInt();
    			y = input.nextInt();
    			sum = calc.divide(x,y);
    			System.out.printf("The divide is %d\n\n",sum);
    			out.write(x + "/" + y + "=" + sum);
    			break;
    			
    	}
    	out.close();
    	}
    	catch(Exception e)
    	{
    		System.out.println("ERROR: Could not open file!");
    	}
    	
    	
    	}
    	while (choice != 99);
    	System.out.println("Ending program...");
    	
    }
}
