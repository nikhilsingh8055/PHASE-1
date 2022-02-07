package assignmentproject;

public class Accessmodifier {
	
	private int add(int a, int b)
	{
		return a+b;
	}
	
	protected int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		Accessmodifier a = new Accessmodifier();
		System.out.println(a.add(5,5));
		System.out.println(a.sub(5,5));
		System.out.println(a.mul(5,5));
	}
}

