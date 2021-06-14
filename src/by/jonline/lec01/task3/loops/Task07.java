package by.jonline.lec01.task3.loops;

import java.util.*;

//Для каждого натурального числа в промежутке от m до n 
//вывести все делители, кроме единицы и самого числа. 
//m и n вводятся с клавиатуры.
public class Task07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    // Enter number and press Enter
		System.out.println("Введите натуральное число: ");
	    int m =  scan.nextInt();
	    System.out.println("Введите натуральное число: ");
	    int n =  scan.nextInt();
		
		int[] result1 = getDivisors(m);
		int[] result2 = getDivisors(n);
		System.out.println("Divisors for M = " + m + ": " + Arrays.toString(result1));
		System.out.println("Divisors for N = " + n + ": " + Arrays.toString(result2));
		
	}

	public static int[] getDivisors(int num) {
		int[] arr = {};
		for (int i = 2; i < num; i++) {
			int[] temp = arr.clone();
			if (num % i == 0) {
				arr = addItemToArray(arr, i);
			}
		}
		
		return arr;
	}
	
	private static int[] addItemToArray(int[] arr, int item) {
		int len = arr.length;
		int[] newArr = new int[len + 1];
		
		for (int i = 0; i < len; i++) {
			newArr[i] = arr[i];
		}
		newArr[len] = item;
		return newArr;
	}
	
}

