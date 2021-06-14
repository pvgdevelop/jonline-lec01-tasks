package by.jonline.lec01.task2.branching;

//Найти max{min(a, b), min(c, d)}.
public class Task02 {
	public static void main(String[] args) {
		double a = 10;
		double b = 16;
		double c = -10;
		double d = -3;
		
		double result = getResult(a, b, c, d);
		System.out.println("Result: " + result);
	}

	public static double getResult(double a, double b, double c, double d) {
		double min1 = Math.min(a, b);
		double min2 = Math.min(c, d);
		return Math.max(min1, min2);
	}	
}

