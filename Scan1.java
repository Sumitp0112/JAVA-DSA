import java.util.Scanner;

class Scan1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Byte Value: ");
		byte b =sc.nextByte();
		
		System.out.println("Enter Your Short Value: ");
		short s = sc.nextShort();
		
		System.out.println("Enter Your int Value: ");
		int i = sc.nextInt();
		
		System.out.println("Enter Your long Number: ");
		long l = sc.nextLong();
		
		System.out.println("Enter Your Float Value: ");
		float f = sc.nextFloat();
		
		System.out.println("Enter Your Double Value: ");
		double d = sc.nextDouble();
		
		System.out.println("Enter Your Boolean Value: ");
		boolean b1 = sc.nextBoolean();
		
		System.out.println("Enter Your String: ");
		String s1 = sc.next();
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b1);
		System.out.println(s1);
	}
}
