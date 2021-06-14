package by.jonline.lec01.task3.loops;

//Найти сумму квадратов первых ста чисел.
public class Task03 {
	public static void main(String[] args) {
		int num = 100;
		int result = getSumOfSquares(num);
		
		System.out.println("Function return: " + result);
	}

	// section 
	public static int getSumOfSquares(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i * i;
		}
		
		return sum;
	}

}


