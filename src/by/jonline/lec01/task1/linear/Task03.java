package by.jonline.lec01.task1.linear;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 ∗ 𝑡𝑔 𝑥𝑦 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦
public class Task03 {
	public static void main(String[] args) {
		int x = 30;
		int y = 60;
		
		double z = calculate(x, y); 
		System.out.println("Function result: " + z);
	}

	public static double calculate(int x, int y) {
		double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		return z;
	}
}
