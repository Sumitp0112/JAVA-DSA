import java.util.Scanner;
class  MergeName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Yours First Name: ");
		String FirstName = sc.next();
		
		System.out.println("Enter Your Second Name: ");
		String SecondName = sc.next();
		
		String FullName = FirstName+"  "+SecondName;
		System.out.println("Your Full Name Is: " +FullName);
	}
}
