/*@author: Madhubala L
Date : 28/07/2022
Title : House Rent Program
Question : calculate house rent 
           - default house normed
           - Adding  water chargers 
           - current bill depending meter rating  
           -service charges
		   -printing total house rents
*/

package com.example;
import java.util.Scanner;
interface House_Manager
{
	 public static void  details()  //parent class method
     {
        System.out.println(" House Rent Details ");
     }
}
 class House_1 implements House_Manager 
{
	int house_rent1;
	
	int water_charge1;
	int Service_charge1;

	public int current_bills=0;

	
	
		private static Scanner bc;
		
		{
			int current_bill1;
			double Amount, Sur_Charge, current_bills;
			bc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Units that you Consumed  : ");
			current_bill1= bc.nextInt();
	  
		  	if ( current_bill1 < 50)
		  	{
		        Amount = current_bill1 * 2.60;
		  		Sur_Charge = 25;  	
		  	} 
		  	else if (current_bill1 <= 100)
		  	{
		  		
		  		Amount = 130 + ((current_bill1 - 50 ) * 3.25);
		  		Sur_Charge = 35; 	
		  	}
		  	else if (current_bill1 <= 200)
		  	{
		  		
		  		Amount = 130 + 162.50 + ((current_bill1- 100 ) * 5.26);
		  		Sur_Charge = 45; 	
		  	}
		  	else
		  	{
		  		
			   	Amount = 130 + 162.50 + 526 + ((current_bill1 - 200 ) * 7.75); 
			   	Sur_Charge = 55; 
			}
			
		  	current_bills = Amount + Sur_Charge;
			System.out.println("\n Electricity Bill  =  " + current_bills);	
			current_bills = Amount + Sur_Charge;
		}


	//Constructor Declared
       public House_1(int house_rent1,int current_bills,int water_charge1,int Service_charge1)
	    {
		
	    this.house_rent1=house_rent1;
	    this.current_bills=current_bills;
	    this.water_charge1=water_charge1;
	    this.Service_charge1=Service_charge1;		    
	    }
	
     
}
class House_2 extends House_1 
{
	
	int house_rent2;
	
	int water_charge2;
	int Service_charge2;

	public int current_bill2=0;

	public int current_bill3=0;
	private static Scanner gc;
		
		{
		 	int current_bill2;
			double Amount, Sur_Charge, current_bill3;
			gc = new Scanner(System.in);
			
			System.out.print(" Please Enter the Units that you Consumed  : ");
			current_bill2 = gc.nextInt();
	  
		  	if ( current_bill2 < 50)
		  	{
		        Amount = current_bill2 * 2.60;
		  		Sur_Charge = 25;  	
		  	} 
		  	else if (current_bill2 <= 100)
		  	{
		  		// For the First Fifty Units Charge = 130 (50 * 2.60)
		  		// Next, we are removing those 50 units from total units
		  		Amount = 130 + ((current_bill2 - 50 ) * 3.25);
		  		Sur_Charge = 35; 	
		  	}
		  	else if (current_bill2 <= 200)
		  	{
		  		// First Fifty Units charge = 130, and 50 - 100 is 162.50 (50 * 3.25)
		  		// Next, we are removing those 100 units from total units
		  		Amount = 130 + 162.50 + ((current_bill2- 100 ) * 5.26);
		  		Sur_Charge = 45; 	
		  	}
		  	else
		  	{
		  		/* First Fifty Units = 130, 50 - 100 is 162.50, 
		  		 and 100 - 200 is 526 (100 * 5.65)
		  		Next, we are removing those 200 units from total units */
			   	Amount = 130 + 162.50 + 526 + ((current_bill2 - 200 ) * 7.75); 
			   	Sur_Charge = 55; 
			}
			
			current_bill3 = Amount + Sur_Charge;
			System.out.println("\n Electricity Bill  =  " + current_bill3);
		}

	
	//Constructor Declared
	      public House_2(int house_rent1,int current_bills,int water_charge1,int Service_charge1,int house_rent2,int current_bill3,int water_charge2,int Service_charge2)
		  {
	    super (house_rent1,current_bills,water_charge1,Service_charge1);
	    this.house_rent2=house_rent2;
	    this.current_bill3=current_bill3;
	    this.water_charge2=water_charge2;
	    this.Service_charge2=Service_charge2;
		    
		  }
}
public class interface_1 {
private static final int Amount = 0;
private static final int Sur_Charge = 0;

String name1;
String name2;
public static void main(String[] args)
 {
  // scanner class
  

	

	int current_bills = 0;
	House_1 obj = new House_1 (5500,1000,500,current_bills);
	 //obj.details();
	 
	int current_bill3 = 0;
	House_2 obj1 = new House_2(5500,1000,500,current_bills,7500,1500,1000,current_bill3);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your Name");
        String name1 = sc.next();
	 System.out.println("House rent amount is = "+obj. house_rent1);
     System.out.println("The current_bill  amount is = "+obj. current_bills);
      System.out.println("The water_charge  amount is = "+obj. water_charge1);
	 System.out.println("The Service_charge  amount is = "+obj. Service_charge1);
     System.out.println("your total house_rent1 Amount is "+ "="+" " +(obj.house_rent1+obj.current_bills+obj.water_charge1+obj.Service_charge1));
	 Scanner cs = new Scanner(System.in);// cs -user defined.
	 System.out.println("Enter your Name");
     String name2 = cs.next();
	 System.out.println("House rent amount is = "+obj1. house_rent2);
     System.out.println("The current_bill  amount is = "+obj1. current_bill3);
     System.out.println("The water_charge  amount is = "+obj1. water_charge2);
	 System.out.println("The Service_charge  amount is = "+obj1. Service_charge2);
  System.out.println("your total house_rent2 Amount is "+ "="+" " +(obj1.house_rent2+obj1.current_bill3+obj1.water_charge2+obj1.Service_charge2));
	 
	 
 }
}