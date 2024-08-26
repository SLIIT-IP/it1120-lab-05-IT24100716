import java.util.Scanner;
     public class IT24100716Lab5Q3
{
    public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
	
	int startdate, enddate, numberday;
	double total_amount;


	   final int room_charge_per_date = 48000;
	   
	   final double discount_10=0.1;
	   
       final double discount_20=0.2;
	
	

    
	System.out.print(" Enter start Date (1-31) : ");
      startdate = input.nextInt();
	  
    System.out.print(" Enter End Date (1-31) : ");
      enddate = input.nextInt();
	  
	  
	 if (startdate < 1 || startdate > 31 && enddate < 1 || enddate > 31 )
	      
	 {    System.out.print(" Error : Days must be between 1 and 31 ");
		  
			return; }
	  
	  if (startdate > enddate)
	        
	            {System.out.print(" Error : start Date must be less than End Date ");
	  
	         return ;}
	  
	  
			 numberday = enddate - startdate;

			             total_amount = room_charge_per_date*numberday;

	  
	    if  ( numberday >= 3 && numberday <= 4)
		  {
	       
			
			
			total_amount = total_amount-(total_amount*discount_10); 
		   
		
		
		   }
	  
	  else if ( numberday >= 5 )
	       {
			
			
			total_amount= total_amount- (total_amount*discount_20);
		  
			
			}
	  
	  
	  
	         System.out.println("\n Room charge per Days Reserved :Rs 48000.0/= ");
	  
	                 System.out.println(" Number of Days Reserved : "+numberday);
	  
	                           System.out.println(" Total Amount to be paid : "+total_amount);
	  
	  
	  
	  
	  
	  
	  
}
}