import java.util.Scanner;

class If1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Bill Amount: ");
		double Amt = sc.nextDouble();
		
		System.out.println("Having A Cupon Code?");
		boolean ip = sc.nextBoolean();
		
		if(ip)
		{
			Amt -=100;
			System.out.println("Rs. 100.0 of Applied");
		}
		System.out.println("Amount Payable: " +Amt);
		
	}
}
