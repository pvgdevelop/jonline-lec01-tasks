package by.jonline.lec01.task1.linear;

//Дано натуральное число Т, которое представляет длительность прошедшего 
//времени в секундах. Вывести данное значение длительности 
//в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.
public class Task05 {
	public static void main(String[] args) {
		int seconds = 3661;

		String time = formatSeconds(seconds); 
		System.out.println(seconds + " seconds is " + time);
	}

	public static String formatSeconds(int seconds) {
		int hours = seconds / 60 / 60;
		int min = seconds / 60 % 60;
		int sec = seconds % 60;
		
		String time = toDoubleDigits(hours) + "ч " 
				+ toDoubleDigits(min) + "мин " 
				+ toDoubleDigits(sec) + "с";
		
		return time;
	}
	
	private static String toDoubleDigits(int num) {
		String res = Integer.toString(num); 
		if (num < 10) {
			return "0" + res;
		}
		return res;
	}
}
