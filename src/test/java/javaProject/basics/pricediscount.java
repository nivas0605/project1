package javaProject.basics;


public class pricediscount {
	public static  double TotalamountwithDiscount(double price,double discount) {
		double discountprice = price - (price % discount);
		return discountprice;
	}
	public static void main(String[] args) {
        double originalprice = 1000.0;
        double discountpercentage = 0.10;
   double afterdiscount=  TotalamountwithDiscount(originalprice, discountpercentage);
       System.out.println("total price"+ afterdiscount);
       
	}

}
