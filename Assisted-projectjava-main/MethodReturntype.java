package assignmentproject;

public class MethodReturntype {
	
	public void hello()
	{
		System.out.println("Inside hello method. No return type");
	}
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double mul(double a, double b)
	{
		return a*b;
	}
	
	public float div(float a, float b)
	{
		return a/b;
	}
	
	public String ending()
	{
		return "The Program is End";
	}

	public static void main(String[] args) {
		MethodReturntype  mt = new MethodReturntype ();
		mt.hello();
		System.out.println(mt.add(10, 23));
		System.out.println(mt.mul(40, 50));
		System.out.println(mt.div(500, 50));
		System.out.println(mt.ending());

	}

}

