package edu.handong.csee.java.lab09; //package name

/**
 * This is a class to get names, sales from user.
 * This class has string and double variable.
 * This class has getter, setter method.
 * @author JS
 *
 */

public class SalesAssociate {
	
	private String mName; //declare a string variable.
	private double mSales; //declare a double variable.
	
	/**
	 * This is a method to return the value of name.
	 * variable mName has been declared by private, we should approach it using a method.
	 * @return mName 
	 */
	public String get_Name() {
		return mName; //return name of salesman.
	}
	
	/**
	 * This is a method to set the name.
	 * variable mName has been declared by private, we should approach it using a method.
	 * @param name (salesman)
	 */
	public void set_name(String name) {
		this.mName = name; //change the value of mName to a parameter.
	}
	
	/**
	 * This is a method to return the value of sales.
	 * variable mSales has been declared by private, we should approach it using a method.
	 * @return mSales (salesman)
	 */
	public double get_Sales() {
		return mSales; //return the sales.
	}

	/**
	 * This is a method to set the sales.
	 * variable mSales has been declared by private, we should approach it using a method.
	 * @param sales (salesman)
	 */
	public void set_Sales(double sales) {
		
		this.mSales = sales; //change the value of mSales to a parameter.
	}
}

