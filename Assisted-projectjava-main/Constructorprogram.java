package assignmentproject;

public class Constructorprogram {

	
		String name;
		int rollNo;
		
		public Constructorprogram(String name, int no)
		{
			this.name = name;
			this.rollNo = no;
		}
		
		public Constructorprogram()
		{
			this.name = "Nitish";
			this.rollNo = 10;
		}

		public static void main(String[] args) {
			Constructorprogram obj = new Constructorprogram("Test",1);
			System.out.println(obj.name+" "+obj.rollNo);
			Constructorprogram obj2 = new Constructorprogram();
			System.out.println(obj2.name+" "+obj2.rollNo);
		}

	}

