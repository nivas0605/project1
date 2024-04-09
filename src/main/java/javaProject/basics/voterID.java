package javaProject.basics;

public class voterID {
	public void verified(int age,String country) {
		int bal = 18 - age;
		 
		 
		if ( age >= 18 && country.equalsIgnoreCase("india")) 
		{
			System.out.println("you are eligible for vote");
		}
		else if(age <18)
		{
			bal = 18-age;
			System.out.println("you are wait"+  bal + "more years");
		}
		
		else  {
			System.out.println("you are not eligible for vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voterID vi = new voterID();
		vi.verified(25,"india");
		
//			coding standards,operators
	}

}
