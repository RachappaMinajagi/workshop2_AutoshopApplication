package myOwnAutoShop;

public class MyOwnAutoShop {
	
	/**
	 * Main method for manipulation of MyOwnAutoShop
	 * 
	 * @param args - Default Java param (Not used)
	 */
	public static void main(String args[]) {

		/**
		
		 *  Create a super class called Car. The Car class has the following fields and methods. 
		 * 
		 *  Create a sub class of Car class and name it as Truck. The Truck class has the following 
		 *    fields and methods.
		 *
		 *  Create a subclass of Car class and name it as Ford.The Ford class has the following
		 *    fields and methods 
		 *
		 *  Create a subclass of Car class and name it as Sedan. The Sedan class has the following
		 *    fields and methods. 
		 * 
		 *  Create MyOwnAutoShop class which contains the main() method. Perform the following
		 *    within the main() method.
		 *
		 *  Creating an instance of all the subclasses class and
		 *    initialize all the fields with appropriate values. Using super(...) method in
		 *    the constructor for initializing the fields of the superclass .
		 * 
		 *  Displaying the sale prices of all instance.
		 */

		Car truck = new Truck(100, 500000, "Black", 1000);
		truck.getSalePrice();

		Car ford1 = new Ford(120, 1000000, "Blue");
		ford1.getSalePrice();
		
		Car ford2 = new Ford(180, 1400000, "Red");
		ford2.getSalePrice();

		Car sedan = new Sedan(160, 1200000, "Red", 10);
		sedan.getSalePrice();
	}
}