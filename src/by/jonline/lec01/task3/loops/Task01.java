package by.jonline.lec01.task3.loops;

import java.util.Scanner;

//Напишите программу, где пользователь вводит
//любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.
public class Task01 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String userInput;
		
	    // Enter number and press Enter
	    System.out.println("Введите любое целое положительное число: ");
	    userInput =  myObj.nextLine();
	    
	    long number =  Long.parseLong(userInput);
	    long result = getSum(number);

		
		System.out.println("Function return: " + result);
		System.out.println("Function return: " + number);
		
	}

	public static long getSum(long num) {
		long sum = 0;
		
		while (num > 0) {
			sum += num;
			num -= 1;
		}
		
		return sum;
	}	
}

