package by.jonline.lec01.task1.linear;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task04 {
	public static void main(String[] args) {
		double x = 534.764;
		double z = swapNumbers(x); 

		System.out.println("Swaping numbers for: " + x);
		System.out.printf("Function result: %.3f", z);
	}

	public static double swapNumbers(double x) {
		int left = (int) (x);
		double right = (x % left);
		double res = (right * 1000) + (left / 1000.0);
		return res;
	}
}
