class Increment
{
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println(++i); //101
		System.out.println(i++); //101
		System.out.println(++i); //103
		System.out.println(i++ + ++i); //208
		System.out.println(i); //105
		System.out.println(++i + i++); //212
		System.out.println(i); //106
		System.out.println(i++); //107
		System.out.println(++i); //109
		System.out.println(i); //109
		
		
	}
}
