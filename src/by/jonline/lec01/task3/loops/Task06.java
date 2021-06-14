package by.jonline.lec01.task3.loops;

import java.util.Arrays;

//Вывести на экран соответствий между символами и их численными 
//обозначениями в памяти компьютера.
public class Task06 {
	public static void main(String[] args) {
		String str = "Symbols123";
		int[] result = getNumericValue(str);
		
		System.out.println("Function return: " + Arrays.toString(result));	
	}
 
	public static int[] getNumericValue(String str) {
		int len = str.length();
		int[] arr = new int[len];
		
		for (int i = 0; i < len; i++) {
			arr[i] = str.charAt(i);
		}
		
		return arr;
	}
}

