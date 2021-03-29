package by.epamtc.task1.ex3.logic;

public class SquareRoundLogic {
	public static double calculateInnerSquareArea(double outerSquareArea) {
		double innnerSquareDiagonal;
		innnerSquareDiagonal = calculateSquareSideByArea(outerSquareArea); //innnerSquareDiagonal == outerSquareSide

		double innerSquireSide;
		innerSquireSide = calculateSquareSideByDiagonal(innnerSquareDiagonal);

		double innerSquareArea;
		innerSquareArea = calculateSquareAreaByside(innerSquireSide);

		return innerSquareArea;
	}

	public static double compareSquaresAreas(double smallerArea, double biggerArea) {
		double result;
		result = biggerArea / smallerArea;
		return result;
	}

	public static double calculateSquareSideByArea(double area) {
		double result;
		result = Math.sqrt(area);
		return result;
	}

	public static double calculateSquareAreaByside(double side) {
		double result;
		result = side * side;
		return result;
	}

	public static double calculateSquareSideByDiagonal(double diagonal) {
		double result;
		result = Math.sqrt(diagonal * diagonal / 2);
		return result;
	}

}
