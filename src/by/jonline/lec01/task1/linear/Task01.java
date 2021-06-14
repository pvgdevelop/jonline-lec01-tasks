package by.jonline.lec01.task1.linear;

//Найдите значениефункции:z=((a–3)*b/2)+c.
public class Task01 {
	public static void main(String[] args) {
		int a = 13;
		int b = 10;
		int c = 9;
		
		double z = calculate(a, b, c); 
		System.out.println("Function result: " + z);
	}

	public static double calculate(int a, int b, int c) {
		return ((a - 3) * b / 2) + c;
	}

}
