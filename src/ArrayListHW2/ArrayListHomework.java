
//Write a public static method called "toPower" (method=function) that takes in as parameters two integers 
//called size and 
//power. The method should return an array of size "size" with each array index raised to the value of 
//"power." So, for example, if we passed in "size = 4" and "power = 2" to the "toPower," the method should 
//return the following result: [0,1,4,9].

package ArrayListHW2;

import java.util.Arrays;

//importing necessary functions

public class ArrayListHomework {
//main method below
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userSize = 5;
		int userPower = 10;
		// Invoking the function
		// toPower(userSize, userPower);
		// invoking the toPower function
		System.out.println(
				"Here are the results of the integers put in: " + Arrays.toString(toPower(userSize, userPower)));

	}

	// other method outside of main method above
	// defining the function
	public static int[] toPower(int size, int power) {
		System.out.println("This is the to power method");
		System.out.println("The size is " + size + ", the power is " + power + ".");

		int[] powerList = new int[size];
		// for loop to iterate through array and set values
		for (int i = 0; i < powerList.length; i++) {
			powerList[i] = i ^ power;
		}

		return powerList;

	}
}
