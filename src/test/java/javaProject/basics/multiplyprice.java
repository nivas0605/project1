package javaProject.basics;

public class multiplyprice {
	static int multiply(int a,int b){
		int mul;
		mul = a*b;
		return mul;
	}
       public static void main(String []args) {
    	
    	 int mul = multiply(4,6);
    	 System.out.println(mul);
     }
//       private modifier is only accessible classes,protected modifier is accessible within package and outside the package but through inherritance only
//       protected access modifier can be applied on the data ,cons
//       default modifier is accessible within package and not accessible 
       
}
