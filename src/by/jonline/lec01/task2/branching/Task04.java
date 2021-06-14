package by.jonline.lec01.task2.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
//Определить, пройдет ли кирпич через отверстие.
public class Task04 {
	public static void main(String[] args) {
		int[] opening = {8, 4};
		int[] brick = {5, 4, 8};
		
		boolean result = willBrickFitOpening(opening, brick);
		
		System.out.println("The brick will fit?: " + result);	
		
	}

	public static boolean willBrickFitOpening(int[] opening, int[] brick) {
		int widthOp = opening[0];
		int heightOp = opening[1];
		
		int widthBr = brick[0];
		int heightBr = brick[1];
		int depthBr = brick[2];
		
		
		boolean res = (widthOp >= widthBr && (heightOp >= heightBr || heightOp >= depthBr) 
						|| ((widthOp >= heightBr) && ((heightOp >= widthBr) || (heightOp >= depthBr)))
						|| ((widthOp >= depthBr) && (heightOp >= heightBr) || (heightOp >= widthBr)));
		return res;
	}	
}

