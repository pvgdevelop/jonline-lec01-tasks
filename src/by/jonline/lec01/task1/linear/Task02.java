package by.jonline.lec01.task1.linear;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑏+√𝑏2 +4𝑎𝑐−𝑎3𝑐+𝑏−2 2𝑎
public class Task02 {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 9;
		
		double z = calculate(a, b, c); 
		System.out.println("Function result: " + z);
	}

	public static double calculate(int a, int b, int c) {
		double z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

		return z;
	}
}