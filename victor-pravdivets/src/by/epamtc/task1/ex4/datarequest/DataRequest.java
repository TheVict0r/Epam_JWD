package by.epamtc.task1.ex4.datarequest;

import by.epamtc.task1.scanner.DataScanner;

public class DataRequest {

	public static int[] recieveFourIntegersFromConsole() {

		int[] numbersArr = new int[4];

		System.out.println("Введите четыре целых числа. \nВвод каждого числа подтверждайте клавишей <Enter>:");
		for (int i = 0; i < numbersArr.length; i++) {
			numbersArr[i] = DataScanner.enterIntFromConsole();
		}

		return numbersArr;
	}

	
}
