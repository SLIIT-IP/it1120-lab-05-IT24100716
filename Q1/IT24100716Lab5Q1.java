import java.util.Scanner;

public class IT24100716Lab5Q1 {
    public static void main(String[] args) {
	
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the first integer: ");
 int num1=scanner.nextInt();
 
 
  System.out.print("Enter the second integer: ");
 int num2=scanner.nextInt();
  
  System.out.print("Enter the third integer: ");
 int num3=scanner.nextInt();
 
 int smallest = num1;
 if
	 (smallest>num2){
		 smallest = num2;
	  }
	  
if  (smallest>num3){
     smallest = num3;

}
  
  int largest = num1;
  
  if(largest < num2){
	  largest = num2;
  }
  
  if (largest<num3){
largest=num3;

 }
  
  System.out.println();
  
  System.out.println("user entered numbers are: "+num1+ "  "  +num2+ "  "  + num3+ "  " );
  System.out.println("smallest number is: " +smallest);
  System.out.println ("largest number is: " +largest);
  
  scanner.close();
  }
  
  
  



}