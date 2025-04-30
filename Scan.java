import java.util.Scanner;
class  Scan
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First Number: ");
		
		int n1 = sc.nextInt();
		
		System.out.println("Enter your Second Number: ");
		int n2 = sc.nextInt();
		
		int Add = n1+n2;
		System.out.println("The Addition Of Given Number is: "+n1+" and " +n2+ " is " +Add);
	}
}
