package by.epamtc.task1.ex3.datarequest;

import by.epamtc.task1.scanner.DataScanner;

public class DataRequest {

	public static double enterSquareArea() {
		double squareArea;
		System.out.println("Пожалуйста, введите площадь исходного квадрата:");

		do {
			squareArea = DataScanner.enterDoubleFromConsole();
			if (squareArea <= 0) {
				System.out.println("Площадь должна быть положительной. Введите данные ещё раз:");
			}
		} while (squareArea <= 0);

		return squareArea;
	}

}
