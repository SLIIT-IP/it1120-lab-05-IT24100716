import java.util.Scanner;
     public class IT24100716Lab5Q3
{
    public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
	
	int startdate, enddate, numberofday;
	int roomchargeperdate = 48000;
	double discountrate,discount,amount,totalamount;
	

    
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
	  
	  
	  
	  
	  
	  
	  

	  
	  if (numberofday < 3 ){
	  discountrate = 0.0;  }
	  
	  else if  ( numberofday >= 3 && numberofday <= 4){
	  discountrate = 0.10; }
	  
	  else   {discountrate = 0.20;}
	  
	  
	  
	  numberofday = enddate - startdate;
	  amount = roomchargeperdate * numberofday;
	  discount = amount * discountrate;
	  totalamount = amount - discount;
	   
	  
	  
	  
	  System.out.println("\n Room charge per Days Reserved : 48000.0/= ");
	  
	  System.out.println(" Number of Days Reserved : "+numberofday);
	  
	  System.out.println(" Total Amount to be paid : "+totalamount);
	  
	  
	  
	  
	  
	  
	  
}
}