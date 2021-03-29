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
		return biggerArea / smallerArea;
	}

	public static double calculateSquareSideByArea(double area) {
		return Math.sqrt(area);
	}

	public static double calculateSquareAreaByside(double side) {
		return side * side;
	}

	public static double calculateSquareSideByDiagonal(double diagonal) {
		return Math.sqrt(diagonal * diagonal / 2);
	}

}
