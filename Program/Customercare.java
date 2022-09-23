/*@author: Madhubala L
Date : 23/09/2022
Title : Customercare Program
Question : Customercare Support
*/

import java.util.*;
class Customercare

{
				
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type number");
		String Call = sc.next();
		switch(Call)
		{
			case "1":
			System.out.println("Call to Customer care");
			break;
			case "2":
			System.out.println("Enter the main menu");
			break;
			case "3":
			System.out.println("Complaint has been registered");
			break;
			case "4":
			System.out.println("You are moving to main menu");
			break;
			case "5":
			System.out.println("Exit");
			break;
		}
		
	}
}