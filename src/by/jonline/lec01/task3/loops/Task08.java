package by.jonline.lec01.task3.loops;

import java.util.Arrays;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class Task08 {
	public static void main(String[] args) {
		int num1 = 12348;
		int num2 = 98431231;
		
		int[] result = getIntersection(num1, num2);
		System.out.println("First number: " + num1);
		System.out.println("Second number: " + num2);
		System.out.println("Numbers has following common digits: " + Arrays.toString(result));
	}

	public static int[] getIntersection(int num1, int num2) {
		int[] arrNum1 = numberToArray(num1);
		int[] arrNum2 = numberToArray(num2);
		int[] arr = {};
		
		for (int i = 0; i < arrNum1.length; i++) {
			int digit = arrNum1[i];
			
			if (isInArray(arrNum2, digit) && !isInArray(arr, digit)) {
				arr = arrayUnshift(arr, digit);
			}
		}
		return arr;
	}
	
	
	private static int[] numberToArray(int num) {
		int[] arr = {};
		boolean done = false;
		int digit;
		
		while (!done) {
			digit = num % 10;
			num = num / 10;
			arr = arrayPush(arr, digit);
			done = num == 0;
		}
		
		return arr;
	}
	
	
	private static boolean isInArray(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return true;
			}
		}return false;
	}
	

	// Insert item to the END of an Array 
	// Returns new array of size + 1
	private static int[] arrayPush(int[] arr, int item) {
		int len = arr.length;
		int[] newArr = new int[len + 1];
		
		for (int i = 0; i < len; i++) {
			newArr[i] = arr[i];
		}
		newArr[len] = item;
		return newArr;
	}
	

	// Insert item at the START of an Array 
	// Returns new array of size + 1  	
	private static int[] arrayUnshift(int[] arr, int item) {
		int len = arr.length;
		int[] newArr = new int[len + 1];
		newArr[0] = item;
		
		for (int i = 1; i <= len; i++) {
			newArr[i] = arr[i - 1];
		}
		return newArr;
	}
	
}

