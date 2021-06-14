package by.jonline.lec01.task2.branching;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
//Определить, будут ли они расположены на одной прямой.
public class Task03 {
	public static void main(String[] args) {
		int[] a = {1, 3};
		int[] b = {2, 6};
		int[] c = {3, 9};
		
		boolean result = isCollinear(a, b, c);
		System.out.println("Result: " + result);
	}

	//	In order to test if they are collinear we should test the validity of the following expression:
	//	(y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)
	public static boolean isCollinear(int[] point1, int[] point2, int[] point3) {
		int x1 = point1[0];
		int y1 = point1[1];
		int x2 = point2[0];
		int y2 = point2[1];
		int x3 = point3[0];
		int y3 = point3[1];
		
		return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
	}	
}

