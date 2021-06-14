package by.jonline.lec01.task1.linear;

//Для данной области составить линейную программу, которая печатает true, 
//если точка с координатами (х, у) принадлежит закрашенной области, 
//и false — в противном случае:
public class Task06 {
	public static void main(String[] args) {
		int x = -4;
		int y = -0;

		// For simplicity our shape can be viewed as 2 rectangles 		
		int[][] shape1 = getRectangle(-2, 2, 0, 4);
		int[][] shape2 = getRectangle(4, -4, -2, 0);
		
		boolean res = isInShape(shape1, x, y) 
				|| isInShape(shape2, x, y); 

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("Function result: " + res);
	}

	public static boolean isInShape(int[][] shape, int x, int y) {
		int[] width = shape[0];
		int[] height = shape[1];
		int minX = width[0];
		int maxX = width[1];
		int minY = height[0];
		int maxY = height[1];
		
		if (width[0] > width[1]) {
			minX = width[1];
			maxX = width[0];
		}
		if (height[0] > height[1]) {
			minY = height[1];
			maxY = height[0];
		}
		
		boolean res = (
				(x >= minX) && (x <= maxX) &&
				(y >= minY) && (y <= maxY)
				);
		return res;
	}
	
	// I chose to represent rectangle as an array of width and height,
	// where width is represented by X-coordinates: x1 and x2,
	// and height by Y-coordinates: y1 and y2
	private static int[][] getRectangle(int x1, int x2, int y1, int y2) {
		int[][] rect = {{x1, x2}, {y1, y2}};
		return rect;
	}

}
