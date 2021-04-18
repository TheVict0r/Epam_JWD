package by.epamtc.task1.ex9.logic;

public class CircleLogic {

	public static double calculateLength(int r) {
		
		if(r <= 0) {
			//throw new OutOfRangeExceptionn(r);
			//пока не реализовано
		}
		
		double length;
		length = 2 * Math.PI * r;
		return length;
	}

	public static double calculateArea(int r) {
		
		if(r <= 0) {
			//throw new OutOfRangeException(r);
			//пока не реализовано
		}
		
		double area;
		area = Math.PI * r * r;
		return area;
	}

}
