package by.epamtc.task1.ex8.logic;

public class LogicForX {

	public static double selectAndRunFormula(int x) { //надеюсь, это название не противоречит правилу single responsibility
		double result;
		result = (x >= 3) ? calculateThreeAndMoreFormula(x) : calculateLessThanThreeFormula(x);
		return result;
	}
	
	public static double calculateThreeAndMoreFormula(int x) {
		double result;
		result = -(x*x) + 3*x +9;
		return result;
	}
	
	public static double calculateLessThanThreeFormula(int x) {
		double result;
		result = 1.0 / (x*x*x - 6);
		return result;
	}
	
}
