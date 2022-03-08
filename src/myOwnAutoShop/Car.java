package myOwnAutoShop;

abstract class Car {
	int speed;
	double regularPrice;
	String color;

	/**
	 * Create a parameterized constructor of the Car which has name same as the
	 * class with no return type
	 * 
	 * @param speed -passing the speed of the car value
	 * @param regularPrice -passing the regularPrice of the car
	 * @param color -color of the car
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	/*
	 * creating a method getSalePrice() to get the SalePrice amount
	 */
	abstract double getSalePrice();

}