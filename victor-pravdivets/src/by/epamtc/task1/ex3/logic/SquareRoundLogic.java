package by.epamtc.task1.ex3.logic;

public class SquareRoundLogic {
	public static double calculateInnerSquareArea(double outerSquareArea) {
		
		if (outerSquareArea <= 0) {
			//throw new IncorrectDataException(outerSquareArea);
			//пока не реализовано
		}
		
		double innnerSquareDiagonal;
		innnerSquareDiagonal = calculateSquareSideByArea(outerSquareArea); //innnerSquareDiagonal == outerSquareSide

		double innerSquireSide;
		innerSquireSide = calculateSquareSideByDiagonal(innnerSquareDiagonal);

		double innerSquareArea;
		innerSquareArea = calculateSquareAreaByside(innerSquireSide);

		return innerSquareArea;
	}

	public static double compareSquaresAreas(double smallerArea, double biggerArea) {
		if (smallerArea <= 0) {
			//throw new IncorrectDataException(smallerArea);
			//пока не реализовано
		}

		if (biggerArea <= 0) {
			//throw new IncorrectDataException(biggerArea);
			//пока не реализовано
		}
		
		double result;
		result = biggerArea / smallerArea;
		return result;
	}

	public static double calculateSquareSideByArea(double area) {
		if (area <= 0) {
			//throw new IncorrectDataException(area);
			//пока не реализовано
		}
		double result;
		result = Math.sqrt(area);
		return result;
	}

	public static double calculateSquareAreaByside(double side) {
		if (side <= 0) {
			//throw new IncorrectDataException(side);
			//пока не реализовано
		}
		double result;
		result = side * side;
		return result;
	}

	public static double calculateSquareSideByDiagonal(double diagonal) {
		if (diagonal <= 0) {
			//throw new IncorrectDataException(diagonal);
			//пока не реализовано
		}
		double result;
		result = Math.sqrt(diagonal * diagonal / 2);
		return result;
	}

}
