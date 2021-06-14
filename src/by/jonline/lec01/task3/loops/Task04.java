package by.jonline.lec01.task3.loops;

import java.math.BigInteger;

//Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Task04 {
	public static void main(String[] args) {
		int num = 200;
		BigInteger result = getProductOfSquares(num);
		
		System.out.println("Function return: " + result);
	}

	// section 
	public static BigInteger getProductOfSquares(int num) {
		BigInteger prod = BigInteger.valueOf(1);
		
		for (int i = 1; i <= num; i++) {
			BigInteger square = BigInteger.valueOf(i * i);
			prod = prod.multiply(square);
		}
		
		return prod;
	}

}


