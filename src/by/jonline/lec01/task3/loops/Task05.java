package by.jonline.lec01.task3.loops;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. 
//Общий член ряда имеет вид:
// A(n) = 1/2^n + 1/3^n
public class Task05 {
	public static void main(String[] args) {
		int[] sequence = generateSequence(10);
		double e = 0.01;
		
		double result = getResult(sequence, e);
		
		System.out.println("Function return: " + result);	
		
	}
 
	public static double getResult(int[] seq, double e) {
		double sum = 0;
		double memberValue;
		
		for (int i = 0; i < seq.length; i++) {
			memberValue = getMemberValue(seq[i]);
			if (Math.abs(memberValue) >= e) {
				sum += memberValue;
			}
		}
		return sum;
	}
	
	public static double getMemberValue(int num) {
		double res = 1.0 / Math.pow(2,  num) + 1.0 / Math.pow(3, num);
		return res;
	}
	
	private static int[] generateSequence(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
	
}

