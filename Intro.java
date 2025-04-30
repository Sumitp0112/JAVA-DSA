import java.util.Scanner;

class  Intro
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String Sname = sc.next();`
		
		System.out.println("Enter Your Age: ");
		int Age = sc.nextInt();
		
		System.out.println("Enter Your Location: ");
		String Location = sc.next();
		
		System.out.println("Enter Your Mob.: ");
		int Mob = sc.nextInt();
		
		System.out.println("Enter Your EmailID: ");
		String Email = sc.next();
		
		System.out.println("Enter Your Collage Name: ");
		String Collage = sc.next();
		
		sc.next();
		System.out.println("Enter Your Degree: ");
		String Degree = sc.next();
		
		System.out.println("Enter Your Stream: ");
		String Stream = sc.next();
		
		System.out.println(Sname);
		System.out.println(Age);
		System.out.println(Location);
		System.out.println(Mob);
		System.out.println(Email);
		System.out.println(Collage);
		System.out.println(Degree);
		System.out.println(Stream);
	}
}
