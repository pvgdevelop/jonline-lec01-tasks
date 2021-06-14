package by.jonline.lec01.task3.loops;

import java.util.Arrays;

//Вычислить значения функции на отрезке [а,b] c шагом h:
// y = x, x > 2
// y = -x, x <= 2
public class Task02 {
	public static void main(String[] args) {
		int[] section = {-20, -10};
		int step = 3;
		int[] result = getResult(section, step);

		System.out.println("Function return: " + Arrays.toString(result));
	}

	// section 
	public static int[] getResult(int[] section, int step) {
		int a = section[0];
		int b = section[1];
		int len = (b - a) / step + 1; 
		int[] res = new int[len];
		int y;
		int idx = 0;

		for (int i = a; i <= b; i += step) {
			y = getYofX(i);
			res[idx] = y;
			idx++;
		}
		
		return res;
	}
	
	private static int getYofX(int x) {
		if (x > 2) {
			return x;
		}
					
		return x * -1;
	}
}
