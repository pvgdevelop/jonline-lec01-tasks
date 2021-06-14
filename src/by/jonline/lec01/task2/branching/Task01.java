package by.jonline.lec01.task2.branching;

//Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник,и если да, то 
//будет ли он прямоугольным.
public class Task01 {
	public static void main(String[] args) {
		double angle1 = 45;
		double angle2 = 45;
		
		boolean isTriangle = isTriangle(angle1, angle2);
		boolean isTriangleRight = isTriangleRight(angle1, angle2);
		
		System.out.println("Following angles provided: " + angle1 + ", " + angle2);

		if (isTriangle && isTriangleRight) {
			System.out.println("Triangle exists and it is right.");
		} else if (isTriangle) {
			System.out.println("Triangle exists.");
		} else {
			System.out.println("Triangle does not exist with given angles");
		}
	}

	public static boolean isTriangle(double angle1, double angle2) {
		return angle1 + angle2 < 180;
	}
	
	public static boolean isTriangleRight(double angle1, double angle2) {
		boolean res = false;
		
		if (!isTriangle(angle1, angle2)) {
			return res;
		}
		
		
		res = angle1 == 90
				|| angle2 == 90
				|| 180 - angle1 - angle2 == 90;
		
		return res;
	}
}

