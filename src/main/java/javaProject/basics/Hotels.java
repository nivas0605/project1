package javaProject.basics;

public class Hotels{
	public void checkavailability(String hotel) {
		 
		if (hotel.equalsIgnoreCase("aryas")) {
			System.out.println("the hotel is avilable");
		}
		else {
			System.out.println("the hotel is not available");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotels hotel1 = new Hotels();
		hotel1.checkavailability("aryas");
	}
	
	

}
