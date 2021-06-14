package by.jonline.lec01.task2.branching;

//Вычислить значение функции:
public class Task05 {
	public static void main(String[] args) {
		double x = 5;
		
		double result = getResult(x);
		
		System.out.println("Function return: " + result);	
		
	}
 
	public static double getResult(double x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		}
					
		return 1 / (Math.pow(x,  3) + 6);
	}	
}

