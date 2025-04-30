class Decrement 
{
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println(--i); //99
		System.out.println(i--); //99
		System.out.println(i); //98
		System.out.println(--i + --i); //193
		System.out.println(i); //96
		System.out.println(--i + i--); //190
		System.out.println(i); //94
		System.out.println(i-- + --i); //186
		System.out.println(i); //92
		
	}
}
